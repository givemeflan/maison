package com.tts.maison_site.maison;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Maison {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;

    @Column
    @CreationTimestamp
    private Date signedup;

    public Maison() {
    }

    public Maison(String firstName, String lastName, String userName, Date signedup) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.signedup = signedup;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getSignedup() {
        return signedup;
    }

    public void setSignedup(Date signedup) {
        this.signedup = signedup;
    }

    @Override
    public String toString() {
        return "Maison [firstName=" + firstName + ", id=" + id + ", lastName=" + lastName + ", signedup=" + signedup
                + ", userName=" + userName + "]";
    }

}
