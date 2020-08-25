package com.search.restservice.request;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This contains color related request parameter input values.
 *
 * @author Shrikanth
 */

public class SearchRequest {

String keyword;
String pageSize;
String pageIndex;

public String getKeyword() {
	return keyword;
}
public void setKeyword(String keyword) {
	this.keyword = keyword;
}
public String getPageSize() {
	return pageSize;
}
public void setPageSize(String pageSize) {
	this.pageSize = pageSize;
}
public String getPageIndex() {
	return pageIndex;
}
public void setPageIndex(String pageIndex) {
	this.pageIndex = pageIndex;
}



}
