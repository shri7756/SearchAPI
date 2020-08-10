package com.search.restservice.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.search.restservice.request.SearchRequest;

import javax.servlet.http.HttpServletRequest;



/**
 * This controller would help to returns Search and Navigation Results
 *
 * @author Shrikanth
 */
@RestController
public class SearchController {
	//TODO Add the Appropriate logger and Exceptions

    /**
     * This method returns the search-nav results
     *
     * @param searchRequest
     * @param headers
     * @return
     * @throws ApiException
     */
    @RequestMapping(value = "/search", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> doPageSearch(@ModelAttribute SearchRequest searchRequest, BindingResult reqValidate,
                                          @RequestHeader HttpHeaders headers, final HttpServletRequest request) {
        //return doSearchWithMetrics(searchRequest, reqValidate, headers, request, null);
    	return new ResponseEntity<>("Well come to Basic Spring boot application", HttpStatus.OK); 
    }

}