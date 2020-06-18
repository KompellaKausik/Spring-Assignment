package com.Restaurant.App.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="orders")
public class Orders {
    public Orders() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id")
    private int orderId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public Orders(int orderId, int customerId, int tableId, int waiterId, int itemId, int orderStatus, int quantity, Date billDate) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.tableId = tableId;
        this.waiterId = waiterId;
        this.itemId = itemId;
        this.orderStatus = orderStatus;
        this.quantity = quantity;
        this.billDate = billDate;
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

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    @Column(name="customer_id'")
    private int customerId;

    @Column(name="table_id")
    private int tableId;

    @Column(name="waiter_id")
    private int waiterId;


    @Column(name = "item_id")
    private int itemId;

    @Column(name="order_status")
    private int orderStatus;

    @Column(name="quantity")
    private int quantity;

    @JsonFormat(pattern = "yyyy-mm-dd")
    @Column(name = "bill_date")
    private Date billDate;



}
