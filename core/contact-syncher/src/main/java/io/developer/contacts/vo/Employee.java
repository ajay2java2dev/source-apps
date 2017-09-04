package io.developer.contacts.vo;

import java.sql.Timestamp;

/**
 * Created by AjayMenon on 6/3/2017.
 */
public class Employee extends Person{
    private int empId;
    private double salary;

    private Timestamp createDate;
    private Timestamp createdBy;
    private Timestamp modifiedDate;
    private Timestamp modifiedBy;
}
