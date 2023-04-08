package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student Name: Divya M");
	}
    public void studentDept() {
    	System.out.println("Student Dept: BE - ECE");
    }
    public void studentId() {
    	System.out.println("Student Id: 22");
    }
	public static void main(String[] args) {
		Student stu= new Student();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
	    

	}

	
}
