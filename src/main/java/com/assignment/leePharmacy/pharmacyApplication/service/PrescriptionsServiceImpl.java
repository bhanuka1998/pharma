package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.Prescriptions;
import com.assignment.leePharmacy.pharmacyApplication.repository.PrescriptionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrescriptionsServiceImpl implements PrescriptionsService{

    @Autowired
    PrescriptionsRepository prescriptionsRepository;

    @Override
    public void addPrescription(Prescriptions prescriptions) {
        prescriptionsRepository.save(prescriptions);
    }

    @Override
    public List<Prescriptions> getAllPrescriptions() {
        List<Prescriptions> prescriptionsList = new ArrayList<>();
        prescriptionsRepository.findAll().forEach(prescriptionsList :: add);
        return prescriptionsList;
    }
}
