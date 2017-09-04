package io.developer.contacts.predicate;

public interface ContactPredicate<Contact> {
    boolean isContactNameValid (Contact contact);
}
