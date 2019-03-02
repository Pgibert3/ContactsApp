package edu.gatech.cs2340.contactsapp;

public class Contact {
    private String firstName;
    private String lastName;
    private Contact.PhoneNumber phoneNumber;

    public class PhoneNumber {
        private String number;
        private PhoneType type;

        public PhoneNumber(String number, PhoneType type) {
            this.number = number;
            this.type = type;
        }

        public String getNumber() {
            return number;
        }

        public PhoneType getType() {
            return type;
        }

        @Override
        public String toString() {
            return type.getText() + ": " + number;
        }
    }

    public enum PhoneType {
        MOBILE("mobile"),
        HOME("home"),
        WORK("work");

        private final String TEXT;

        PhoneType(String text) {
            TEXT = text;
        }

        public String getText() {
            return TEXT;
        }
    }

    public Contact(String firstName, String lastName, String phoneNumber, PhoneType phoneType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = new PhoneNumber(phoneNumber, phoneType);
    }

    public Contact(String firstName) {
        this(firstName, "", "-", PhoneType.MOBILE);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Contact.PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
