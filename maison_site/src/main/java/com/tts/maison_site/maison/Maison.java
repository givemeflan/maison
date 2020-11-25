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
    private String fullName;
    private String emailAddress;
    private String subjectMatter;
    private String clientMessage;

    @Column
    @CreationTimestamp
    private Date signedup;

    public Maison() {
    }

    public Maison(String fullName, String emailAddress, String subjectMatter, String clientMessage, Date signedup) {
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.subjectMatter = subjectMatter;
        this.clientMessage = clientMessage;
        this.signedup = signedup;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getSubjectMatter() {
        return subjectMatter;
    }

    public void setSubjectMatter(String subjectMatter) {
        this.subjectMatter = subjectMatter;
    }

    public String getClientMessage() {
        return clientMessage;
    }

    public void setClientMessage(String clientMessage) {
        this.clientMessage = clientMessage;
    }

    public Date getSignedup() {
        return signedup;
    }

    public void setSignedup(Date signedup) {
        this.signedup = signedup;
    }

    @Override
    public String toString() {
        return "Maison [clientMessage=" + clientMessage + ", emailAddress=" + emailAddress + ", fullName=" + fullName
                + ", id=" + id + ", signedup=" + signedup + ", subjectMatter=" + subjectMatter + "]";
    }

}
