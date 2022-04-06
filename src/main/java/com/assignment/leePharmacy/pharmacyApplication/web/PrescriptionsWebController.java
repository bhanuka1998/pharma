package com.assignment.leePharmacy.pharmacyApplication.web;

import com.assignment.leePharmacy.pharmacyApplication.service.PrescriptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrescriptionsWebController {

    @Autowired
    PrescriptionsService prescriptionsService;

    @GetMapping("/viewAllPrescriptions")
    public String viewPrescriptions(Model model){
        model.addAttribute("prescriptions", prescriptionsService.getAllPrescriptions());
        return "viewprescriptions";
    }

}
