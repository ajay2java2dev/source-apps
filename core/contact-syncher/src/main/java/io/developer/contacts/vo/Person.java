package io.developer.contacts.vo;

import java.sql.Timestamp;

/**
 * Created by AjayMenon on 6/3/2017.
 */
public class Person {
    private int person_id;
    private String first_name;
    private String middle_name;
    private String last_name;

    private Timestamp createDate;
    private Timestamp createdBy;
    private Timestamp modifiedDate;
    private Timestamp modifiedBy;

    public Person() {
    }

    public Person(int person_id, String first_name, String last_name) {
        this.person_id = person_id;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
