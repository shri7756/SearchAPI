package com.search.restservice.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.search.restservice.request.SearchRequest;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;



/**
 * This controller would help to returns Search and Navigation Results
 *
 * @author Shrikanth
 */
@RestController
public class SearchController {
    @RequestMapping(value = "/search", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> doPageSearch(@ModelAttribute SearchRequest searchRequest, BindingResult reqValidate,
                                          @RequestHeader HttpHeaders headers, final HttpServletRequest request) {
    	
    	
    	String keyword;
    	String pageSize;
    	String pageIndex;    	
    	
    	keyword=request.getParameter("keyword");
    	pageSize=request.getParameter("pageSize");
    	pageIndex=request.getParameter("pageIndex");
    	
    	if(keyword==null || keyword.isEmpty())
    	{
    		return new ResponseEntity<>("please enter the keyword",HttpStatus.BAD_REQUEST);
    	}
    		
    		
    	
    	
    	
    	if(pageSize==null || pageSize.isEmpty()) {
    		return new ResponseEntity<>("no page size",HttpStatus.BAD_REQUEST);
    		
    	}
    	
    	
    	try {
    		if(pageSize!=null) {
    			
    			Integer pagenum=Integer.parseInt(pageSize);
    	    	 
    			//return new ResponseEntity<>("page size ok",HttpStatus.OK);
        	}
			
		} catch (Exception e) {
			
    		return new ResponseEntity<>(" pageSize this is not a number",HttpStatus.BAD_REQUEST);


		}
    	
     	
    	if(pageIndex==null || pageIndex.isEmpty()) {
    		return new ResponseEntity<>("no page size",HttpStatus.BAD_REQUEST);
    		
    	}
    	
    	
    	try {
    		if(pageIndex!=null) {
    			
    			Integer pIndex=Integer.parseInt(pageIndex);
    	    	 
    			//return new ResponseEntity<>("page size ok",HttpStatus.OK);
        	}
			
		} catch (Exception e) {
			
    		return new ResponseEntity<>(" pageIndex this is not a number",HttpStatus.BAD_REQUEST);


		}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	return new ResponseEntity<>("Well come to Basic Spring boot application", HttpStatus.OK); 
    }

}