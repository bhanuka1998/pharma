package com.assignment.leePharmacy.pharmacyApplication.repository;

import com.assignment.leePharmacy.pharmacyApplication.model.Prescriptions;
import org.springframework.data.repository.CrudRepository;

public interface PrescriptionsRepository extends CrudRepository<Prescriptions, Integer> {
}
