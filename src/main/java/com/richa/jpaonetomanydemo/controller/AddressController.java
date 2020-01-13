package com.richa.jpaonetomanydemo.controller;

import com.richa.jpaonetomanydemo.model.Address;
import com.richa.jpaonetomanydemo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping(value = "/{studentId}")
    public Address addAddress(@PathVariable int studentId, @RequestBody Address address){
       return addressService.addAddress(studentId,address);
    }
    @GetMapping()
    public List<Address> addressAllList(){
        return  addressService.listAllAddress();
    }
    @GetMapping(value = "/{studentId}")
    public List<Address> addressList(@PathVariable int studentId){
       return  addressService.listAddress(studentId);
    }
    @PostMapping
    public Address updateAddress(@PathVariable int studentId , @RequestBody Address address){
        return addressService.updateAddress(studentId, address);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteAddress(@PathVariable int studentId){
        addressService.deleteAddress(studentId);
    }

}
