package br.com.fernanda.wsRESTful_Jersey_Hibernate.http;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


@XmlRootElement
public class Product implements Serializable {
	   
	
	private int id;
	private String name;
	private int quantity;
	private double value;
	private static final long serialVersionUID = 1L;
	
	public Product() {
		super();
	}  
	
	
	public Product(int id, String name, int quantity, double value) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.value = value;
	}


	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}   
	public double getValue() {
		return this.value;
	}

	public void setValue(double value) {
		this.value = value;
	}
   
}
