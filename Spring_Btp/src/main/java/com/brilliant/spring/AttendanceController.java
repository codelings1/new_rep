package com.brilliant.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.brilliant.spring.model.Attendance;
import com.brilliant.spring.model.Student;
import com.brilliant.spring.service.Attendance_Service;
import com.brilliant.spring.service.Student_Service;

@Controller
public class AttendanceController{
	
	Attendance_Service attendance_service;
	Student_Service student_service;
    
	@Autowired(required=true)
	@Qualifier(value="attendance_service")
	public void setAttendance_service(Attendance_Service attendance_service) {
		this.attendance_service = attendance_service;
	}
	@Autowired(required=true)
	@Qualifier(value="student_service")
	public void setStudent_service(Student_Service student_service) {
		this.student_service = student_service;
	}

//	@RequestMapping(value = "two",method=RequestMethod.GET)
	@RequestMapping("/initiateAttendanceModel/{batch}")
	public String addModel(@PathVariable("batch") String batch , Model model) { 
		System.out.println("Here");
	    model.addAttribute("attendance", new Attendance()); 
	    return "redirect:/batchStudentsAttendance/"+batch;
	    //return "redirect:/attendanceEnter/{batch}";
	    //	    return "index"; 
	}
	@RequestMapping("/batchStudentsAttendance/{batch}")
	public String listStudentAttendance(@PathVariable("batch") String batch , Model model)
	{
		model.addAttribute("batchStudents",student_service.listBatchStudents(batch));
		model.addAttribute("batchName",batch);
		System.out.println("Hello " + batch);
		return "enterAttendanceView";
	}
	
	@RequestMapping("attendanceEnter/{batch}")
	public String enterAttendance(@PathVariable("batch") String batch , Model model , HttpServletRequest req , HttpServletResponse resp)
	{
		System.out.println("HelloHAHA");
//	    System.out.println(req.getParameter("attendance213"));
//	    System.out.println(req.getParameter("attendance214"));
	    System.out.println(req.getParameter("sub_but"));
//	    attendance_service.addAttendance();
		//model.addAttribute("batchStudents",student_service.listBatchStudents(batch));
		//System.out.println("Hello " + batch);
		return "enterAttendanceView";
	}
}
