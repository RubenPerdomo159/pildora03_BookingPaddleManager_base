package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class PaddleManager {
    public List<Customer> customers;
    public List<Court> courts;

    public void addMember(String name, String surname, String street, int number, int postalCode, String city, int points){
        Member newMember = new Member(name, surname, street, number, postalCode, city, points);
        customers.add(newMember);
    }

    public void addCustomer(String name, String surname, String street, int number, int postalCode, String city){
        Customer newCustomer = new Customer(name, surname, street, number, postalCode, city);
        customers.add(newCustomer);
    }

    public Customer getCustomer(int i){
        return customers.get(i);
    }

    public void addCourt(String name, int price, CourtType type){
        Court newCourt = new Court(name, price, type);
        courts.add(newCourt);
    }

    public Court getCourt(int i){
        return courts.get(i);
    }

    public void reserve(Customer customer, Court court, Date date, int hours){
        Reservation newReservation = new Reservation(customer, court, date, hours);
        court.reservation.add(newReservation);
    }
}
