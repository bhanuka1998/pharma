package com.assignment.leePharmacy.pharmacyApplication.model;

import javax.persistence.*;

@Entity
@Table(name = "prescriptions")
public class Prescriptions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pres_id", nullable = false)
    private Integer presID;

    @Column(name = "cus_name", nullable = false)
    private  String cusName;

    @Column(name = "doc_name", nullable = false)
    private String docName;

    @Column(name = "pres_content", nullable = false)
    private String presContent;

    public Integer getPresID() {
        return presID;
    }

    public void setPresID(Integer presID) {
        this.presID = presID;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getPresContent() {
        return presContent;
    }

    public void setPresContent(String presContent) {
        this.presContent = presContent;
    }
}
