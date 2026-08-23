package com.fathur.ecommerce.service;

import com.fathur.ecommerce.entity.ProductOrder;
import com.fathur.ecommerce.entity.ProductOrderRequest;

public interface ProductOrderService {
	
	public ProductOrder saveProductOrder(Long id, ProductOrderRequest productOrderRequest);
}
