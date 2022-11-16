package com.macalsandair.order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.macalsandair.product.Product;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "Popcard")
@Table(name = "table")
@Getter
@Setter
public class OrderedProduct {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	@JoinColumn(name = "product_type")
	private Product productType;
	private int amount;
	

}
