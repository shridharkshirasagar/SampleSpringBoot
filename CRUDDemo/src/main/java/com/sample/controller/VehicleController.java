package com.sample.controller;


import com.sample.model.Vehicle;
import com.sample.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    public VehicleService vehicleService;

    @PostMapping
    public Vehicle add(@RequestBody Vehicle vehicle){
        return vehicleService.add(vehicle);
    }

    @GetMapping
    public List<Vehicle> get(){
        return vehicleService.get();
    }

    @GetMapping("/get/{id}")
    public Optional<Vehicle> getid(@PathVariable("id") Integer id){
        return vehicleService.getid(id);
    }

    @DeleteMapping("/delete/{id}")
    public Vehicle delete(@PathVariable("id") Integer id){
        return vehicleService.delete(id);
    }

    @PutMapping("/modify/{id}")
    public Vehicle modify(@PathVariable("id") Integer id, @RequestBody Vehicle vehicle){
        return vehicleService.modify(id, vehicle);
    }
}
