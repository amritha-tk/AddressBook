package com.Address;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    String firstName,lastName,address,state,city,phone;
    int zip;

    public AddressBook(String firstName, String lastName, String address,String state, String city, int zip, String phone)
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
    public String getPhone(){
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
    public void setPhone(String phone){
        this.phone=phone;
    }
    public void display(){
        System.out.println("\nAddress Book\n FirstName:"+firstName+"\nLastName:"+lastName+"\nAddress:"+address+"\nState:"+state+"\nCity:"+city+"\nZip:"+zip+"\nPhone:"+phone);
    }
    public static void main(String args[]){
        System.out.println("Welcome to Address Book Program");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first name");
        String firstName=sc.next();
        System.out.println("Enter the last name");
        String lastName=sc.next();
        System.out.println("Enter address");
        String address=sc.next();
        System.out.println("Enter state");
        String state=sc.next();
        System.out.println("Enter city");
        String city=sc.next();
        System.out.println("Enter zip");
        int zip=sc.nextInt();
        System.out.println("Enter phone");
        String phone=sc.next();

        AddressBook addList=new AddressBook(firstName,lastName,address,state,city,zip,phone);
        addList.display();
        System.out.println("Do you want to edit 1.Address 2.State 3.City 4.Zip 5.Phone");
        int num=sc.nextInt();
        switch(num)
        {
            case 1:System.out.println("Enter the address");
                    address=sc.next();
                    addList.setAddress(address);
                    break;
            case 2:System.out.println("Enter State");
                    state=sc.next();
                    addList.setState(state);
                    break;
            case 3:System.out.println("Enter City");
                    city=sc.next();
                    addList.setCity(city);
                    break;
            case 4:System.out.println("Enter Zip");
                    zip=sc.nextInt();
                    addList.setZip(zip);
                    break;
            case 5:System.out.println("Enter phone");
                    phone=sc.next();
                    addList.setPhone(phone);
                    break;
            default:System.out.println("Not applicable");
                    break;

        }
        AddressBook addList1=new AddressBook(firstName,lastName,address,state,city,zip,phone);
        addList.display();
    }
}
