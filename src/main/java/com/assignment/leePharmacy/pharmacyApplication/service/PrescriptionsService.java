package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.Prescriptions;

import java.util.List;

public interface PrescriptionsService {
    void addPrescription(Prescriptions prescriptions);

    List<Prescriptions> getAllPrescriptions();
}
