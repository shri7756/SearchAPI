package com.search.restservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.search.restservice.entities.Course;
import com.search.restservice.request.CourseService;
import com.search.restservice.request.SearchRequest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;



/**
 * This controller would help to returns Search and Navigation Results
 *
 * @author Shrikanth
 */
@RestController
public class SearchController {
	
	@Autowired 
// For this interface spring only will create object of that interface implemenation class(CourseServiceImpl) using keyword of Autowired so it will inject here
	// so i.e it will become loose coupling ,this job doing by spring frame work
	private CourseService course_service;
	
	
	
	
    @RequestMapping(value = "/search", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> doPageSearch(@ModelAttribute SearchRequest searchRequest, BindingResult reqValidate,
                                          @RequestHeader HttpHeaders headers, final HttpServletRequest request) {
        //return doSearchWithMetrics(searchRequest, reqValidate, headers, request, null);
    	return new ResponseEntity<>("Well come to Basic Spring boot application", HttpStatus.OK); 
    }

    
    @GetMapping("/test")
    public void testing() {
    	System.out.println("making  test");
    }
    
    //get courses
    
    @GetMapping("/courses")
    
    public List<Course> getCourse() {
    	
    	
    	return this.course_service.getCourses();
    	
    }
		
	
}