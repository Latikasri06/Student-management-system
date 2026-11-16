package com.sms.service;

import java.util.List;
 
import com.sms.model.Student;

public class StudentService {
	public interface students{
		public boolean addStudent();
		public List<Student> FindAll();
		public int FindbyId(int id);
		
	}

}
