package it.epicode.month1.week2.d2.ex3;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private Map<String, String> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void addPhoneContact(String name, String number) {
        this.phoneBook.put(name, number);
    }

    public void deletePhoneContact(String name) {
        this.phoneBook.remove(name);
    }


    public void printContacts() {
        for (Map.Entry<String, String> contact : phoneBook.entrySet()) {
            System.out.println("Name: " + contact.getKey() + " Number: " + contact.getValue());
        }
    }

    public String getNumberByName(String name) {
        return phoneBook.get(name);
    }

    public String getNameByPhoneNumber(String phoneNumber) {
        for(Map.Entry<String, String> contact : phoneBook.entrySet()) {
            if(contact.getValue().equals(phoneNumber)) {
                return contact.getKey();
            }
        }
        return null;
    }

}
