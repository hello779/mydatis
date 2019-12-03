package com.zking.oa.util;

import lombok.ToString;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class PageBean {
	//页码
	private int page=1;
	//每页多少条记录
	private int rows=10;
	//总页数
	private int total;
	
	//分页标记
	private boolean pagination=true;
	
	//上一次的请求地址
	private String url;
	
	//上一次的请求参数
	private Map<String, String[]> map;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Map<String, String[]> getMap() {
		return map;
	}

	public void setMap(Map<String, String[]> map) {
		this.map = map;
	}

	public int getPage() {
		return page;
	}

	@Override
	public String toString() {
		return "PageBean [page=" + page + ", rows=" + rows + ", total=" + total + ", pagination=" + pagination
				+ ", url=" + url + ", map=" + map + "]";
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public boolean isPagination() {
		return pagination;
	}

	public void setPagination(boolean pagination) {
		this.pagination = pagination;
	}

	public PageBean() {
	}

	public void setPage(String page) {
		if(null!=page&&!"".equals(page)) 
			this.page=Integer.parseInt(page);
	}
	
	public void setrows(String rows) {
		if(null!=rows&&!"".equals(rows)) 
			this.rows=Integer.parseInt(rows);
	}
	
	public void setpagination(String pagination) {
		if(null!=pagination&&!"".equals(pagination)) 
			this.pagination=Boolean.parseBoolean(pagination);
	}
	
	//获取分页的开始位置
	public int getStarIndex() {
		return (this.page-1)*this.rows;
	}
	
	//最大页数
	public int getMaxPager() {
		int maxPager=this.total/this.rows;
		if(this.total%this.rows!=0) 
			maxPager++;
		return maxPager;
	}
	
	//下一页
	public int getNextPager() {
		int nextPager=this.page+1;
		if(nextPager>=getMaxPager())
			nextPager=getMaxPager();
		return nextPager;
	}
	
	//上一页
	public int getProviousPager() {
		int proviousPager=this.page-1;
		if(proviousPager<=1) 
			proviousPager=1;
		return proviousPager;
	}
	
	public void setRequest(HttpServletRequest req) {
		String page=req.getParameter("page");
		String rows=req.getParameter("rows");
		String pagination=req.getParameter("pagination");
		
		//设置请求参数
		setPage(page);
		setrows(rows);
		setpagination(pagination);
		
		//获取上一次的请求路径
		this.url=req.getRequestURI();
		
		this.map=req.getParameterMap();
		
		//
		
		
	}
	

}
