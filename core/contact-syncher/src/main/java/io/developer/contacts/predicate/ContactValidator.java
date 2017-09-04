package io.developer.contacts.predicate;

import io.developer.contacts.vo.Contact;
import io.developer.contacts.vo.Person;
import org.springframework.util.StringUtils;

/**
 * Created by AjayMenon on 6/7/2017.
 */
public class ContactValidator {

    public static boolean isContactNameValid(final Contact contact) {
        Person person = contact.getPerson();
        if (person != null && !StringUtils.isEmpty(person.getFirst_name())
                && !StringUtils.isEmpty(person.getLast_name())) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isContactMobileValid(final Contact contact) {
        Person person = contact.getPerson();
        if (person != null && !StringUtils.isEmpty(contact.getMobileNum())
                && !StringUtils.isEmpty(contact.getMobileNum())) {
            return true;
        } else {
            return false;
        }
    }


}
