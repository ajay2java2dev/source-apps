package io.developer.contacts.vo;

import org.springframework.util.StringUtils;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by AjayMenon on 6/7/2017.
 */
public class Contact {

    private Person person;
    private String mobileNum;


    private Timestamp createDate;
    private Timestamp createdBy;
    private Timestamp modifiedDate;
    private Timestamp modifiedBy;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Timestamp createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Timestamp getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Timestamp modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

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
