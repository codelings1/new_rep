package com.brilliant.spring.dao;

import org.hibernate.SessionFactory;

public class AttendanceDao {
    protected SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void addAttendance() {
		// TODO Auto-generated method stub
		
	}
}
