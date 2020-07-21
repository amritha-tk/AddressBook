package com.Address;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    String firstName,lastName,address,state,city,phone;
    int zip;
    int duplicateFlag=0;
    Scanner sc=new Scanner(System.in);
    ArrayList<AddressBook> list=new ArrayList<AddressBook>();
    AddressBook adbook;
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
    public String getPhone(){ return phone; }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAddress(String address){ this.address=address; }
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
    public void duplicateEntry(String firstName){
        System.out.println("Checking for duplicate entries");
        if(list.size()>1) {
            for (int i = 0; i < list.size(); i++) {
                adbook = (AddressBook) list.get(i);
                if (firstName.equals(adbook.firstName)) {
                    System.out.println("Duplicate record found with same first name" + adbook.getFirstName());
                    duplicateFlag = 1;
                }
            }
        }
        else{
            System.out.println("No records to check duplicates");
            }
    }
    public void addEntry(){

        System.out.println("Enter the number of people to be added");
        int numP=sc.nextInt();
        for(int i=0;i<numP;i++) {
            System.out.println("Enter the first name");
            firstName = sc.next();
            System.out.println("Enter the last name");
            lastName = sc.next();
            duplicateEntry(firstName);
            if(duplicateFlag==0) {
                System.out.println("Enter address");
                address = sc.next();
                System.out.println("Enter state");
                state = sc.next();
                System.out.println("Enter city");
                city = sc.next();
                System.out.println("Enter zip");
                zip = sc.nextInt();
                System.out.println("Enter phone");
                phone = sc.next();

                list.add(new AddressBook(firstName, lastName, address, state, city, zip, phone));
                //addList.display();
                for (AddressBook book : list) {
                    System.out.println("Firstname :" + book.getFirstName() + "\nLastname :" + book.getLastName() + "\nAddress :" + book.getAddress() + "\nState :" + book.getState() + "\nCity :" + book.getCity() + "Zip :" + book.getZip() + "\nPhone :" + book.getPhone());
                }
            }
        }
    }
    public void editEntry(){
      System.out.println("Enter the first name");
      String firstName=sc.next();
      for(int i=0;i<list.size();i++){
          adbook=(AddressBook)list.get(i);
          if(firstName.equals(adbook.firstName)){
             System.out.println("Matching record found "+adbook.firstName);
             System.out.println("Do you want to edit 1.Address 2.State 3.City 4.Zip 5.Phone");
             int num = sc.nextInt();
             switch (num) {
                 case 1:
                     System.out.println("Enter the address");
                     address = sc.next();
                     adbook.setAddress(address);
                     break;
                 case 2:
                     System.out.println("Enter State");
                     state = sc.next();
                     adbook.setState(state);
                     break;
                 case 3:
                     System.out.println("Enter City");
                     city = sc.next();
                     adbook.setCity(city);
                     break;
                 case 4:
                     System.out.println("Enter Zip");
                     zip = sc.nextInt();
                     adbook.setZip(zip);
                     break;
                 case 5:
                     System.out.println("Enter phone");
                     phone = sc.next();
                     adbook.setPhone(phone);
                     break;
                 default:
                     System.out.println("Not applicable");
                     break;

             }
              System.out.println("Firstname :"+adbook.getFirstName()+"\nLastname :"+adbook.getLastName()+"\nAddress :"+adbook.getAddress()+"\nState :"+adbook.getState()+"\nCity :"+adbook.getCity()+"Zip :"+adbook.getZip()+"\nPhone :"+adbook.getPhone());
          }
         else {
             System.out.println("No matching record found");
         }
      }
    }
    public void deleteEntry() {
        System.out.println("Enter the first name");
        String firstName = sc.next();
        for (int i = 0; i < list.size(); i++) {
            adbook = (AddressBook) list.get(i);
            if (firstName.equals(adbook.firstName)) {
                System.out.println("Matching record found " + adbook.firstName);
                System.out.println("Do you want to delete 1.Yes 2.No");
                int choice = sc.nextInt();
                if (choice == 1) {
                    list.remove(i);
                } else {
                    System.out.println("No need to delete");
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String firstName = null,lastName=null,address=null,state=null,city=null,phone=null;
        int zip=0;
        System.out.println("Welcome to Address Book Program");
       AddressBook select=new AddressBook(firstName,lastName,address,state,city,zip,phone);
       while(true){
         System.out.println("Enter the choice 1.Add 2.Edit 3.Delete 4.Quit");
         int choice1=sc.nextInt();
         switch(choice1) {
            case 1:
                select.addEntry();
                break;
            case 2:
                select.editEntry();
                 break;
            case 3:
                select.deleteEntry();
                break;
            case 4:
                System.out.println("Thankyou for using Address book");
                break;
            default:
                System.out.println("Enter correct choice");
                break;
         }

       }
    }
}
