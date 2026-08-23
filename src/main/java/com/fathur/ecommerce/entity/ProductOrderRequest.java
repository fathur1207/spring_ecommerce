package com.fathur.ecommerce.entity;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ProductOrderRequest {
	
	private String firstName;

	private String lastName;

	@Column(unique = true)
	private String email;

	private String mobile;

	private String address;

	private String city;

	private String state;

	private String pinCode;
	
	
	private String paymentType;

}
