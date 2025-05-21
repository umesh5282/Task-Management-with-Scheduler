package com.taskmanger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskmanger.model.Task;
import com.taskmanger.repository.TaskRepository;

@Service

public class TaskService {
 
	@Autowired
	private TaskRepository taskRepo;
	
	
	public Task createTask(Task task) {
		task.setStatus(TaskStatus.PENDING);
		return taskRepo.save(task);
		
	}
	
	public List<Task> getAllTask(){
		return taskRepo.findAll();
		
	}
	
  public void updateTaskStatus() {
	  List<Task > tasks=taskRepo.findAll();
	    for (Task task :tasks) {
	    	switch (task.getStatus()) {
			case PENDING: {
				   task.setStatus(TaskStatus.IN_PROGRESS);
				   break;
			}
			case IN_PROGRESS:{
				task.setStatus(TaskStatus.REVIEW);
				break;
				
			}
			case REVIEW :{
				task.setStatus(TaskStatus.COMPLETED);
				break;
			}
			case COMPLETED :
			{
				task.setStatus(TaskStatus.COMPLETED);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: "  );
			}
	    }
	    
	    taskRepo.saveAll(tasks);
  }
}
