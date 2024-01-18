package com.csis3275.assignment1.controller;

import com.csis3275.assignment1.model.Car_jsh_35;
import com.csis3275.assignment1.model.Truck_jsh_35;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleController {

    @GetMapping("/")
    public String showVehicles(Model model) {
        Car_jsh_35 car = new Car_jsh_35("Honda", "Civic", 5, 15.0);
        Truck_jsh_35 truck = new Truck_jsh_35("Ford", "F-150", 1000, false);
        model.addAttribute("car", car);
        model.addAttribute("truck", truck);
        return "AssignmentView";
    }
}
