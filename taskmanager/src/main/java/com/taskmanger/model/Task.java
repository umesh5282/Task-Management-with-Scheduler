package com.taskmanger.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import com.taskmanger.service.TaskStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {

	 @Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id ;
	 
	 private String title ;
	 
	 private String description  ;
	 
	  
	 @Enumerated(EnumType.STRING)
	 private TaskStatus status ;
	 
	 private LocalDateTime createAt ;
	 
	 private LocalDateTime updatedAt;
	 
	 
	  @PrePersist
	    protected void onCreate() {
	        createAt = LocalDateTime.now();
	        updatedAt = createAt;
	    }

	    @PreUpdate
	    protected void onUpdate() {
	        updatedAt = LocalDateTime.now();
	    }
	 
	 
}
