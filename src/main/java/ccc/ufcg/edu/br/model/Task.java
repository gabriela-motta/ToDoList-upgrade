package ccc.ufcg.edu.br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Task {
	
	@Id
	@GeneratedValue(generator="STORE_SEQ")
	@SequenceGenerator(name="STORE_SEQ",sequenceName="STORE_SEQ", allocationSize=1)
	private Long id;

	private String name;
	private String category;
	private boolean status;
	private String description;
	private Priority priority;
	
	public Task(String name, String category, String description, Priority priority) {
		this.name = name;
		this.category = category;
		this.status = false;
		this.description = description;
		this.priority = priority;
	}
	
	public Task(){
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isDone() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}
}
