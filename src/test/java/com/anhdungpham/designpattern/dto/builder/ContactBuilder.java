package com.anhdungpham.designpattern.dto.builder;

public class ContactBuilder {
    private String firstName;
    private String lastName;
    private String address;

    public ContactBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ContactBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Contact buildContact() {
        return new Contact(firstName, lastName, address);
    }
}
