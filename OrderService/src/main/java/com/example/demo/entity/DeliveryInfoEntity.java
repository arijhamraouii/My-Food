package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "delivery_info")
public class DeliveryInfoEntity implements Serializable{
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "delivery_time")
    @Temporal(TemporalType.TIME)
    private int deliveryTime;

    @Column(name = "delivery_address")
    private String deliveryAddress;
    
    @OneToOne
    @JoinColumn(name = "order_id")
    private OrderEntity order;

    public DeliveryInfoEntity() {}

    public DeliveryInfoEntity(int deliveryTime, String deliveryAddress, OrderEntity order) {
        this.deliveryTime = deliveryTime;
        this.deliveryAddress = deliveryAddress;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public OrderEntity getOrder() {
        return order;
    }

    public void setOrder(OrderEntity order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "DeliveryInfo [id=" + id + ", deliveryTime=" + deliveryTime + ", deliveryAddress=" + deliveryAddress
                + "]";
    }    
}
