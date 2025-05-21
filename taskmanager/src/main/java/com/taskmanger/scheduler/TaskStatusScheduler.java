package com.taskmanger.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.taskmanger.service.TaskService;

@Component
public class TaskStatusScheduler {
 
	 @Autowired
	private TaskService taskService;
	
	// @Scheduled(cron = "0 */5 * * * *") // Every 5 minutes
	 @Scheduled(cron = "0 0 */6 * * *") //every 6 hours 
	public void updateStatus() {
		taskService.updateTaskStatus();
		System.out.print("Task Status Updated ");
	}
}
