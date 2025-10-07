package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Court {
    public String name;
    public int price;
    public CourtType type;
    public List<Reservation> reservation = new ArrayList<>();

    public int getPrice() {
        return price;
    }
}
