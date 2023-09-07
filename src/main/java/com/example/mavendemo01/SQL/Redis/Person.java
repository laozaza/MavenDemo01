package com.example.mavendemo01.SQL.Redis;

import org.hibernate.type.descriptor.sql.JdbcTypeFamilyInformation;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.util.List;

@RedisHash("persons")
public class Person {
    @Id
    private String id;
    @Indexed
    private String firstname;
    @Indexed
    private String lastname;
    private Address address;
    private List<JdbcTypeFamilyInformation.Family> familyList;

    public Person() {
    }

    public Person(String id, String firstname, String lastname, Address address, List<JdbcTypeFamilyInformation.Family> familyList) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.familyList = familyList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<JdbcTypeFamilyInformation.Family> getFamilyList() {
        return familyList;
    }

    public void setFamilyList(List<JdbcTypeFamilyInformation.Family> familyList) {
        this.familyList = familyList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address=" + address +
                ", familyList=" + familyList +
                '}';
    }
}

