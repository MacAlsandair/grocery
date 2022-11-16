package com.macalsandair.order;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.macalsandair.auth.ApplicationUser;

//How i understand, there should be one class for the whole grocery store, which represents 
// assortment and product availability for the whole store, and adding new product should be done
// through instantiating new instance of its class (i cannot do it through enums, because enums are immutable during a runtime.
// Therefore, this class should represent the state of the whole grocery, while another class should represent 
// the amount of goods, which a customer ordered. How to do this in relational database mapping?
// The only pretty adequate way to implement this is to create a table with order data, such as client's address, 
// common price, used sales and so on, but without any product, and create an another table, where would be 
// an id of an order, a type of a product and its amount, therefore it would be pretty simple to take from a database
// all amount of essential data about an order, and then, if it is necessary, display a full list of all ordered goods.


@Entity(name = "Order")
@Table(name = "order")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToMany
	@JoinColumn(name = "ordered_product")
	private List<OrderedProduct> orderedProducts;
	
	@OneToOne
	@JoinColumn(name = "application_user_id")
	private ApplicationUser applicationUser;
	
	private int price;
	private String address;
	private LocalDateTime date;

	Order() {}
}
