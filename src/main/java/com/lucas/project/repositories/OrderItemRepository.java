package com.lucas.project.repositories;

import com.lucas.project.entities.OrderItem;
import com.lucas.project.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
