package org.xmlread;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder= {"productname","model","loc","orderid","efficient"})
public class Product {
	
	private String productname;
	private String model;
	private String loc;
	private int orderid;
	private float efficient;
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public float getEfficient() {
		return efficient;
	}
	public void setEfficient(float efficient) {
		this.efficient = efficient;
	}

}
