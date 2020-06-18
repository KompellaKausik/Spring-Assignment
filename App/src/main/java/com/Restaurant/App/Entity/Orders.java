package com.Restaurant.App.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "orders")
public class Orders{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;

    @Column(name = "waiter_id")
    private int waiterId;

    @Column(name = "item_id")
    private int itemId;

    @Column(name = "table_id")
    private int tableId;

    @Column(name="order_status")
    private boolean orderStatus;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "order_value")
    private int orderValue;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "date")
    private Date date;

    public Orders() {
    }

    public Orders(int orderId, int waiterId, int itemId, int tableId, boolean orderStatus, int quantity, int orderValue, int customerId, Date date) {
        this.orderId = orderId;
        this.waiterId = waiterId;
        this.itemId = itemId;
        this.tableId = tableId;
        this.orderStatus = orderStatus;
        this.quantity = quantity;
        this.orderValue = orderValue;
        this.customerId = customerId;
        this.date = date;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getWaiterId() {
        return waiterId;
    }

    public void setWaiterId(int waiterId) {
        this.waiterId = waiterId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public boolean isOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(int orderValue) {
        this.orderValue = orderValue;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}