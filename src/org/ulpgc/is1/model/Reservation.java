package org.ulpgc.is1.model;

import java.util.Date;

public class Reservation {
    private static int NEXT_ID = 0;
    public final int id;
    public Date date;
    public int hours;
    public Customer customer;
    public Court court;

    public Reservation(Customer customer, Court court, Date date, int hours) {
        this.customer = customer;
        this.court = court;
        this.date = date;
        this.hours = hours;
        this.id = NEXT_ID;
        NEXT_ID++;
    }

    public int price(){
        return court.getPrice();
    }
}
