package com.sameer.student.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sameer.student.entity.student;
import com.sameer.student.repository.studentrepository;

@Service
public class studentservice {
	@Autowired
	studentrepository studentrepository;
	public student save(student student) {
		return studentrepository.save(student);
	}
	
	public student getstudent(int Id) {
		return studentrepository.findById(Id).get();
	}
	
	public student updatestudent(int id,student student) {
		student stu=studentrepository.findById(id).get();
		stu.setName(student.getName());
		stu.setCollege(student.getCollege()); 
		stu.setRoll(student.getRoll());
		stu.setQualification(student.getQualification());
		stu.setCourse(student.getCourse());
		stu.setYear(student.getYear());
		stu.setCertificate(student.getCertificate());
		stu.setHallticketno(student.getHallticketno());
		return studentrepository.save(stu); 
		}
	
	public String deletestudent(int id)
	{
	studentrepository.deleteById(id);
	return "Entity deleted" +id;
	}
	public List<student> getstudentlist()
	{
	return studentrepository.findAll();
	}
	public studentrepository getstudentrepository() {
	return studentrepository;
	}
	public void setstudentrepository(studentrepository studentrepository) {
	this.studentrepository = studentrepository;
	}
	


}



