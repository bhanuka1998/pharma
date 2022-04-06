package com.assignment.leePharmacy.pharmacyApplication.control;

import com.assignment.leePharmacy.pharmacyApplication.model.Prescriptions;
import com.assignment.leePharmacy.pharmacyApplication.service.PrescriptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PrescriptionsController {

    @Autowired
    PrescriptionsService prescriptionsService;

    @RequestMapping(method = RequestMethod.POST, value = "/addPrescription")
    public void addPrescription(@RequestBody Prescriptions prescriptions){
        prescriptionsService.addPrescription(prescriptions);
    }

    @RequestMapping(value = "/getAllPrescriptions")
    public List<Prescriptions> getAllPrescriptions(){
        return prescriptionsService.getAllPrescriptions();
    }

}
