package com.Restaurant.App.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Date;



@Entity
@Table(name="bill")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bill_id")
    private int billId;

    @Column(name = "bill_value")
    private int billValue;

    @Column(name="customer_id'")
    private int customerId;

    @Column(name="waiter_id")
    private int waiterId;

    @Column(name="table_id")
    private int tableId;



    @JsonFormat(pattern = "yyyy-mm-dd")
    @Column(name="bill_date")
    private Date billDate;

    public Bill() {
    }

    public Bill(int billId, int billValue, int customerId, int tableId, int waiterId, Date billDate) {
        this.billId = billId;
        this.billValue = billValue;
        this.customerId = customerId;
        this.tableId = tableId;
        this.waiterId = waiterId;
        this.billDate = billDate;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getBillValue() {
        return billValue;
    }

    public void setBillValue(int billValue) {
        this.billValue = billValue;
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

    public int getWaiterId() {
        return waiterId;
    }

    public void setWaiterId(int waiterId) {
        this.waiterId = waiterId;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }
}

