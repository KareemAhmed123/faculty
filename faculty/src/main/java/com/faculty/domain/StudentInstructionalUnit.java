//package com.faculty.domain;
//
//import javax.persistence.Entity;
//import javax.persistence.Table;
//import javax.persistence.UniqueConstraint;
//
//@Entity
//
//@Table(uniqueConstraints = {
//		@UniqueConstraint(columnNames = { "student_id", "start_time" }, 
//				name = "user_unique_user_id_org_id_idx"),
//		@UniqueConstraint(columnNames = { "student_id", "end_time" }) })
//public class StudentInstructionalUnit extends InstructionalUnit {
//	private Student student;
//
//	public Student getStudent() {
//		return student;
//	}
//
//	public void setStudent(Student student) {
//		this.student = student;
//	}
//}
