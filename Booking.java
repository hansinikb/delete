package com.example.demo.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Booking {
    @Id
    @GeneratedValue
    private Long bookingid;
    private String seatnumbers;
    private Integer numberoftickets;

    public Long getBookingid() {
        return bookingid;
    }





    public void setBookingid(Long bookingid) {
        this.bookingid = bookingid;
    }





    public String getSeatnumbers() {
        return seatnumbers;
    }





    public void setSeatnumbers(String seatnumbers) {
        this.seatnumbers = seatnumbers;
    }





    public Integer getNumberoftickets() {
        return numberoftickets;
    }





    public void setNumberoftickets(Integer numberoftickets) {
        this.numberoftickets = numberoftickets;
    }




    //@JsonManagedReference
    public Customer getCustomer() {
        return customer;
    }





    public void setCustomer(Customer customer) {
        this.customer = customer;
    }





    @ManyToOne
    //@Column(name="customerid")
    @JoinColumn(name="customerid",referencedColumnName  = "customerid" )
    private Customer customer;



}
