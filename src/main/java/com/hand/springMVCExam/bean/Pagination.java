package com.hand.springMVCExam.bean;

public class Pagination {
	private int pageSize=10;
	private int currentPage=1;
	private int totalPage=1;
	private int lastPage=totalPage;
	private int firstPage=1;
	private int beginIndex=(currentPage-1)*pageSize;
	private int endIndex=currentPage*pageSize;
	
	public Pagination(int pageSize, int currentPage, int totalPage, int lastPage) {
		super();
		this.pageSize = pageSize;
		this.currentPage = currentPage;
		this.totalPage = totalPage;
		this.lastPage = lastPage;
	}
	public Pagination(int currentPage) {
		super();
		this.currentPage = currentPage;
	}
	public Pagination() {
		super();
	}
	
	public int getBeginIndex() {
		return beginIndex;
	}
	public void setBeginIndex(int beginIndex) {
		this.beginIndex = beginIndex;
	}
	public int getEndIndex() {
		return endIndex;
	}
	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		if(pageSize>=1){
			this.pageSize = pageSize;
		}
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		if(1<=currentPage&&currentPage<=totalPage){
			this.currentPage = currentPage;
		}
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getLastPage() {
		return lastPage;
	}
	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}
	public int getFirstPage() {
		return firstPage;
	}
}
