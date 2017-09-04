package io.developer.contacts.service;

import io.developer.contacts.predicate.ContactPredicate;
import io.developer.contacts.vo.Contact;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AjayMenon on 6/7/2017.
 */
public class ContactServiceManager implements ContactService {

    @Override
    public List<Contact> filterContacts(List<Contact> contacts,
                                        ContactPredicate<Contact> predicate) {
        if (contacts!=null && !contacts.isEmpty()) {
            List<Contact> filteredList = new ArrayList<>();
            for (Contact contact : contacts) {
                if (predicate.isContactNameValid(contact)) {
                    filteredList.add(contact);
                }
            }
            return filteredList;
        }
        return null;
    }

}
