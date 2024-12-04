package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class OrderEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "state")
    private String state;

    @Column(name = "consumer_id")
    private Long consumerId;

    @Column(name = "restaurant_id")
    private Long restaurantId;
    
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderLineItemsEntity> lineItems;

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private DeliveryInfoEntity deliveryInfo;
    
    public OrderEntity() {}
    
    public OrderEntity(Long id, String state, Long consumerId, Long restaurantId) {
        this.id = id;
        this.state = state;
        this.consumerId = consumerId;
        this.restaurantId = restaurantId;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Long consumerId) {
        this.consumerId = consumerId;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", state=" + state + ", consumerId=" + consumerId + ", restaurantId=" + restaurantId
                + "]";
    } 
}
