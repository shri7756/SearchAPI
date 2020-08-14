package com.search.restservice.request;

import java.util.List;

import com.search.restservice.entities.Course;

public interface CourseService {

	public List<Course> getCourses();  // we are making for loose coupling 
}
