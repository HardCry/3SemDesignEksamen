package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "customer_order")
public class OrderModel {

    // region fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int guestCount;

    private double priceTotal;

    private String customerName;
    private String customerEmail;
    private String customerAddress;
    private String customerPhoneNumber;

    private Date deliveryDate;
    private Date orderDate;

    @ManyToOne
    private MenuModel menu;
    // endregion

    public OrderModel() {
    }

    public OrderModel(int guestCount, double priceTotal, String customerName, String customerEmail,
                      String customerAddress, String customerPhoneNumber, Date deliveryDate, Date orderDate,
                      MenuModel menu) {
        this.guestCount = guestCount;
        this.priceTotal = priceTotal;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
        this.customerPhoneNumber = customerPhoneNumber;
        this.deliveryDate = deliveryDate;
        this.orderDate = orderDate;
        this.menu = menu;
    }

    // region getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGuestCount() {
        return guestCount;
    }

    public void setGuestCount(int guestCount) {
        this.guestCount = guestCount;
    }

    public double getPriceTotal() {
        return priceTotal;
    }

    public void setPriceTotal(double priceTotal) {
        this.priceTotal = priceTotal;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public MenuModel getMenu() {
        return menu;
    }

    public void setMenu(MenuModel menu) {
        this.menu = menu;
    }
    // endregion
}
