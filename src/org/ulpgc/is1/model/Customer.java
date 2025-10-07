package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    public String name;
    public String surname;
    public List<Reservation> reservation = new ArrayList<>();

    public Customer(String name, String surname, String street, int number, int postalCode, String city) {
        this.name = name;
        this.surname = surname;
        Address newAddress = new Address(street, number, postalCode, city);
    }

    public Reservation getReservation(int i){
        return reservation.get(i);
    }
}
