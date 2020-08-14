package com.search.restservice.request;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.search.restservice.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	
//	data for temporaly 
	
	List<Course> list;
	
	
	
	
	public CourseServiceImpl() {

		list= new ArrayList<>();
		list.add(new Course(01,"core java","it is basic java course"));
		list.add(new Course(02,"spring","adavance concept of java"));
	}




	@Override
	public List<Course> getCourses() {

		return list;
	}

}
