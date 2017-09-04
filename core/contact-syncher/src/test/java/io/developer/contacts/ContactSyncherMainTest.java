package io.developer.contacts;

import io.developer.contacts.service.ContactServiceManager;
import io.developer.contacts.vo.Contact;
import io.developer.contacts.vo.Person;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple ContactSyncherMain.
 */
public class ContactSyncherMainTest {

    public static void main(String[] args) {
        ContactServiceManager contactServiceManager = new ContactServiceManager();

        Contact contact1 = new Contact();
        Person person1 = new Person();
        person1.setFirst_name("Ajay");
        person1.setLast_name("Menon");

        contact1.setPerson(person1);

        Contact contact2 = new Contact();
        Person person2 = new Person();
        person2.setFirst_name("test");

        contact2.setPerson(person2);

        List<Contact> contactList = new ArrayList<>();
        contactList.add(contact1);
        contactList.add(contact2);

        System.out.println(contactList.size());

        //pass around a method (isContactNameValid)
        contactList = contactServiceManager.filterContacts(contactList, Contact::isContactNameValid);

        System.out.println(contactList.size());
    }
}
