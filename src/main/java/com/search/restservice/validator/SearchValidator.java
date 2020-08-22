package com.search.restservice.validator;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.search.restservice.request.SearchRequest;

@Component
public class SearchValidator {
	
	  public SearchRequest validateSearchParams(HttpServletRequest request) {
		  
		 String keyword=request.getParameter("keyword");
		 String  pageSize=request.getParameter("pageSize");
		 String	 pageIndex=request.getParameter("pageIndex");
		 
		 SearchRequest searchRequest=new SearchRequest();
		 
		 if(validateKeyword(keyword)) {
			 
			 searchRequest.setKeyword(keyword);
		 }
		 
		 if( validatePageSize(pageSize)) {
			 
			 searchRequest.setPageSize(pageSize);
		 }
	 
	  if(validatePageIndex(pageIndex)) {
		  
		  searchRequest.setPageIndex(pageIndex);
	  }
	return searchRequest;
	  
	  
	  }
	  
	  
	  public boolean validateKeyword(String keyword) {
		  
		  
		  if(StringUtils.isNotBlank(keyword))
		  {
			  return true;
		  }
		  return false;
		  
	  }
	  
	  public boolean validatePageSize(String pageSize) {

		 
		 try {
			 Integer pagesize=Integer.parseInt(pageSize);
			 
			 return true;
			  
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		 return false;
		  }
	  

	  
	  public boolean validatePageIndex(String pageIndex) {
		  
		  try {
			  
			  Integer pageindex=Integer.parseInt(pageIndex);
			  
			  return true;
			  
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	  return false;
	  }
	  
	  
	  
	 
}

