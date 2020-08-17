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
    	else if(keyword!=null){
    		
    		return new ResponseEntity<>("ok",HttpStatus.OK);
    		
    	}
    	
    	
    	if(pageSize==null) {
    		return new ResponseEntity<>("no page size",HttpStatus.BAD_REQUEST);
    		
    	}
    	
    	if(pageSize.isEmpty())
    	{
    		return new ResponseEntity<>("empty pagesize",HttpStatus.BAD_REQUEST);
    	}
    	
    	
    	Integer keynum=Integer.parseInt(keyword);
    	Integer pagenum=Integer.parseInt(pageSize);
    	 
    	int[] array = Arrays.asList(pageIndex).stream().mapToInt(Integer::parseInt).toArray(); //convert String to integer array.
    	
    	
    	
    	
    	
    	return new ResponseEntity<>("Well come to Basic Spring boot application", HttpStatus.OK); 
    }

}