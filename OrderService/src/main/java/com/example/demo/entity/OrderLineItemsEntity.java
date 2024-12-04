package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "order_line_items")
public class OrderLineItemsEntity implements Serializable {
	 private static final long serialVersionUID = 1L;

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "quantity")
	    private int quantity;

	    @Column(name = "menu_id")
	    private Long menuId;

	    @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "order_id")
	    private OrderEntity order;
	    
	    public OrderLineItemsEntity() {}

	    public OrderLineItemsEntity(int quantity, Long menuId, OrderEntity order) {
	        this.quantity = quantity;
	        this.menuId = menuId;
	        this.order = order;
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	    public Long getMenuId() {
	        return menuId;
	    }

	    public void setMenuId(Long menuId) {
	        this.menuId = menuId;
	    }

	    public OrderEntity getOrder() {
	        return order;
	    }

	    public void setOrder(OrderEntity order) {
	        this.order = order;
	    }

	    @Override
	    public String toString() {
	        return "OrderLineItems [id=" + id + ", quantity=" + quantity + ", menuId=" + menuId + ", order=" + order + "]";
	    }
}
