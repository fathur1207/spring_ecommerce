package com.fathur.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fathur.ecommerce.entity.ProductOrder;
@Repository
public interface ProductOrderRepository extends JpaRepository<ProductOrder, Long>{

}
