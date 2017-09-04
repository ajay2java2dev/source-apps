package io.developer.contacts.service;

import io.developer.contacts.predicate.ContactPredicate;
import io.developer.contacts.vo.Contact;

import java.util.List;
import java.util.function.Predicate;

/**
 * Created by AjayMenon on 6/1/2017.
 */
public interface ContactService {
    List<Contact> filterContacts (final List<Contact> contacts, ContactPredicate<Contact> predicate);
}
