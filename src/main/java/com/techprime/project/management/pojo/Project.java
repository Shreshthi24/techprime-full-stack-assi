package com.techprime.project.management.pojo;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "projects")
public class Project {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String theme;
	    private String reason;
	    private String type;
	    private String division;
	    private String category;
	    private String priority;
	    private String department;
	    private String startDate;
	    private String endDate;
	    private String location;
	 	private String status; 
	 	
	 	//chart
	 	private long total;
		private long closed;
		
		
	    public Project(String department, long total, long closed) {
			super();
			this.department = department;
			this.total = total;
			this.closed = closed;
		}

		public long getTotal() {
			return total;
		}

		public void setTotal(long total) {
			this.total = total;
		}

		public long getClosed() {
			return closed;
		}

		public void setClosed(long closed) {
			this.closed = closed;
		}

	
	    
	    // Constructors, getters, and setters
	    public Project() {
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getTheme() {
	        return theme;
	    }

	    public void setTheme(String theme) {
	        this.theme = theme;
	    }

	    public String getReason() {
	        return reason;
	    }

	    public void setReason(String reason) {
	        this.reason = reason;
	    }

	    public String getType() {
	        return type;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }

	    public String getDivision() {
	        return division;
	    }

	    public void setDivision(String division) {
	        this.division = division;
	    }

	    public String getCategory() {
	        return category;
	    }

	    public void setCategory(String category) {
	        this.category = category;
	    }

	    public String getPriority() {
	        return priority;
	    }

	    public void setPriority(String priority) {
	        this.priority = priority;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    public String getStartDate() {
	        return startDate;
	    }

	    public void setStartDate(String startDate) {
	        this.startDate = startDate;
	    }

	    public String getEndDate() {
	        return endDate;
	    }

	    public void setEndDate(String endDate) {
	        this.endDate = endDate;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public void setLocation(String location) {
	        this.location = location;
	    }
	    public String getStatus() {
	 			return status;
	 		}

	 	public void setStatus(String status) {
	 			this.status = status;
	 		}

	}
