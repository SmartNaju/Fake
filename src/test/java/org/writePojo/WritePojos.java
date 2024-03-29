package org.writePojo;

import java.util.ArrayList;

public class WritePojos {
	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private ArrayList<Tata> tatas ;
	private Airport airpot;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPer_page() {
		return per_page;
	}
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}
	public ArrayList<Tata> getTatas() {
		return tatas;
	}
	public WritePojos(int page, int per_page, int total, int total_pages, ArrayList<Tata> tatas, Airport airpot) {
		super();
		this.page = page;
		this.per_page = per_page;
		this.total = total;
		this.total_pages = total_pages;
		this.tatas = tatas;
		this.airpot = airpot;
	}
	public void setTatas(ArrayList<Tata> tatas) {
		this.tatas = tatas;
	}
	public Airport getAirpot() {
		return airpot;
	}
	public void setAirpot(Airport airpot) {
		this.airpot = airpot;
	}

}
