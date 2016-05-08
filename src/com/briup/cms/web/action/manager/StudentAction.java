package com.briup.cms.web.action.manager;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.briup.cms.bean.Student;
import com.briup.cms.service.IStudentService;
import com.briup.cms.service.impl.StudentServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport{

	
	/**
	 *序列化ID 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int number;
	private IStudentService studentService = new StudentServiceImpl();
	
	/*@Action(value="toAddStudent",
			results={@Result(name="success",location="/WEB-INF/jsp/manager/addStudent.jsp")})
	public String toAddStudent(){
		return SUCCESS;//"success"
	}

	@Action(value="addStudent",results={@Result(name="success",location="/WEB-INF/jsp/manager/addStudentSuccess.jsp")})
	public String addStudent(){
		Student student = new Student((Long) null,name, number);
		studentService.add(student);
		return SUCCESS;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
