package com.anhdungpham.designpattern.dto.controller;

import com.anhdungpham.designpattern.dto.builder.Contact;
import com.anhdungpham.designpattern.dto.builder.ContactBuilder;
import com.anhdungpham.designpattern.dto.factory.Pet;
import com.anhdungpham.designpattern.dto.factory.PetFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/")
public class Controller {
    @Autowired
    private PetFactory petFactory;

    @PostMapping("pet/{type}/{name}")
    public Pet pet(@PathVariable String type, @PathVariable String name) {
        Pet pet = petFactory.createPet(type);
        pet.setName(name);
        pet.isHungry();
        return pet;
    }

    @GetMapping(value = "student")
    public List<Contact> getContact() {
        List<Contact> contacts = new ArrayList<>();
        Contact contact = new Contact();
        contact.setFirstName("Anh Dung");
        contact.setLastName("Pham");
        contacts.add(contact);

        contacts.add(new Contact("Stanley", "Pham", null));

        contacts.add(new ContactBuilder().setFirstName("DEF").buildContact());
        return contacts;


    }
}
