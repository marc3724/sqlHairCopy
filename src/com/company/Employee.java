package com.company;

public class Employee extends User{
    int wage;
    //remove password from classes
    public Employee(String name, String email, String phone, String address, String password) {
        super(name, email, phone, address, password);
//      this.wage = wage;
    }
    public Employee() {
    }

    public Employee(String email, String password){
        super(email, password);
    }


}