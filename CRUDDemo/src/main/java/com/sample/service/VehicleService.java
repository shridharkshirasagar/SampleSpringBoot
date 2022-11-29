package com.sample.service;

import com.sample.model.Vehicle;
import com.sample.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {

    @Autowired
    public Repo repo;

    public Vehicle add(Vehicle vehicle){
        return repo.save(vehicle);
    }

    public List<Vehicle> get(){
        return repo.findAll();
    }

    public Optional<Vehicle> getid(Integer id){
        return repo.findById(id);
    }

    public Vehicle delete(Integer id){
        Optional<Vehicle> repo1= repo.findById(id);
        if(repo1.isPresent()){
            repo.deleteById(id);
            return repo1.get();
        }
        else{
            return null;
        }
    }

    public Vehicle modify(Integer id, Vehicle vehicle){
        Optional<Vehicle> vehicle1=repo.findById(id);
        if(vehicle1.isPresent()){
            vehicle1.get().setVname(vehicle.getVname());
            vehicle1.get().setVmake(vehicle.getVmake());
            vehicle1.get().setVengine(vehicle.getVengine());
            vehicle1.get().setVetype(vehicle.getVetype());
            vehicle1.get().setVcolor(vehicle.getVcolor());
            vehicle1.get().setVprice(vehicle.getVprice());
            vehicle1.get().setVgear(vehicle.getVgear());
            repo.save(vehicle1.get());
            return vehicle1.get();
        }
        else{
            return null;
        }
    }

}
