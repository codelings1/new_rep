package com.brilliant.spring.service;

import com.brilliant.spring.dao.AttendanceDao;


public class Attendance_Service {
    
	private AttendanceDao attendanceDao; 
	
	public void setAttendanceDao(AttendanceDao attendanceDao) {
		this.attendanceDao = attendanceDao;
	}

	public void addAttendance() {
		// TODO Auto-generated method stub
		attendanceDao.addAttendance();
	}

    
	
}
