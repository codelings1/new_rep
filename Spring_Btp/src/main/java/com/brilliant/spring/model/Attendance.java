package com.brilliant.spring.model;

import java.util.Date;


import javax.persistence.*;

@Entity
@Table
public class Attendance {
	@Id
	private int stud_id;
    private Date date;
	
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
