package org.sid.orderservice.repo;

import org.sid.orderservice.Entities.Order;
import org.sid.orderservice.Entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Order,Long> {
}
