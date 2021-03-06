package com.gpotgames.curso.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gpotgames.curso.entities.pk.OrdemItemPK;


@Entity
@Table(name = "tb_order_item")
public class OrdemItem implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrdemItemPK id = new OrdemItemPK();
	
	private Integer qunatity;
	private Double price;
	
	public OrdemItem() {}

	public OrdemItem(Order order,Product product,Integer qunatity, Double price) {
		super();
		id.setOrder(order);
		id.setProduct(product);
		this.qunatity = qunatity;
		this.price = price;
	}
	
	@JsonIgnore
	public Order getOrder() {
		return id.getOrder();
	}
	
	public void setOrder(Order order) {
		id.setOrder(order);
	}
	
	
	
	public Product getProduct() {
		return id.getProduct();
	}
	public void setProduct(Product product) {
		id.setProduct(product);
	}

	public Integer getQunatity() {
		return qunatity;
	}

	public void setQunatity(Integer qunatity) {
		this.qunatity = qunatity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getSubTotal() {
		return price * qunatity;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrdemItem other = (OrdemItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
