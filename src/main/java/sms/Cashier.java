package sms;

import java.sql.Date;

public class Cashier extends Users{
    public Cashier(int id,String name,  long number, Date DOB) {
        super(id, name, number, DOB, "CASHIER");
    }
}
