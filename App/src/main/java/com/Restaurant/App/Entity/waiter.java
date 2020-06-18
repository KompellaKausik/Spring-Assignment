package com.Restaurant.App.Entity;

import javax.persistence.*;

@Entity
@Table(name="waiter")
public class waiter {

    public waiter() {
    }

    public waiter(int waiterId, String waiterName, int tableAssigned) {
        this.waiterId = waiterId;
        this.waiterName = waiterName;
        this.tableAssigned = tableAssigned;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="waiter_id")
    private int waiterId;



    @Column(name="waiter_name")
    private String waiterName;

    @Column(name = "table_assigned")
    private int tableAssigned;

    public int getWaiterId() {
        return waiterId;
    }

    public void setWaiterId(int waiterId) {
        this.waiterId = waiterId;
    }

    public String getWaiterName() {
        return waiterName;
    }

    public void setWaiterName(String waiterName) {
        this.waiterName = waiterName;
    }

    public int getTableAssigned() {
        return tableAssigned;
    }

    public void setTableAssigned(int tableAssigned) {
        this.tableAssigned = tableAssigned;
    }
}
