package Contacts;

public class Contacts {

    public String firstname;
    public String lastname;
    public String address;
    public String number;

    public Contacts(String firstname, String lastname, String address, String number) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.number = number;
    }

    public String toString() {
        return firstname + "," + lastname + "," + address + "," + number + ",";
    }
}