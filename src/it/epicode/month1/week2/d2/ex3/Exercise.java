package it.epicode.month1.week2.d2.ex3;

public class Exercise {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addPhoneContact("Mario", "343243212");
        phoneBook.addPhoneContact("Giorgio", "344152312");
        phoneBook.addPhoneContact("Manzo", "34741232");

        phoneBook.printContacts();

        System.out.println();

        phoneBook.deletePhoneContact("Mario");

        phoneBook.printContacts();

        System.out.println("The chosen contacts number is: " + phoneBook.getNumberByName("Giorgio"));
        System.out.println("The chosen phone's contact name is: " + phoneBook.getNameByPhoneNumber("34741232"));
    }
}
