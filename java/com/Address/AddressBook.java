package com.Address;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    String firstName,lastName,address,state,city;
    int zip,phone;

    public AddressBook(String firstName, String lastName, String address,String state, String city, int zip, int phone)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.phone = phone;
    }
   public String getFirstName(){
    return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getAddress(){
        return address;
    }
    public String getState(){
        return state;
    }
    public String getCity(){
        return city;
    }
    public int getZip(){
        return zip;
    }
    public int getPhone(){
        return phone;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setState(String state){
        this.state=state;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setZip(int zip){
        this.zip=zip;
    }
    public void setPhone(int phone){
        this.phone=phone;
    }
    public static void main(String args[]){
        System.out.println("Welcome to Address Book Program");
    }
}
