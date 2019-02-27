package cn.kgc.entity;

import java.util.Date;

public class SellCar {
	private Integer id;
	private String title;
	private String cartime;
	private String mile;
	private String out;
	private String standard;
	private String detail;
	private Date dateTime;
	private User user;
	private Integer price;
	private String picpath;
	public SellCar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SellCar(Integer id, String title, String cartime, String mile, String out, String standard, String detail,
			Date dateTime, User user, Integer price, String picpath) {
		super();
		this.id = id;
		this.title = title;
		this.cartime = cartime;
		this.mile = mile;
		this.out = out;
		this.standard = standard;
		this.detail = detail;
		this.dateTime = dateTime;
		this.user = user;
		this.price = price;
		this.picpath = picpath;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCartime() {
		return cartime;
	}
	public void setCartime(String cartime) {
		this.cartime = cartime;
	}
	public String getMile() {
		return mile;
	}
	public void setMile(String mile) {
		this.mile = mile;
	}
	public String getOut() {
		return out;
	}
	public void setOut(String out) {
		this.out = out;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getPicpath() {
		return picpath;
	}
	public void setPicpath(String picpath) {
		this.picpath = picpath;
	}
	@Override
	public String toString() {
		return "CellCar [id=" + id + ", title=" + title + ", cartime=" + cartime + ", mile=" + mile + ", out=" + out
				+ ", standard=" + standard + ", detail=" + detail + ", dateTime=" + dateTime + ", user=" + user
				+ ", price=" + price + ", picpath=" + picpath + "]";
	}
	
}
