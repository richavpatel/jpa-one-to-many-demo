package com.richa.jpaonetomanydemo.service;

import com.richa.jpaonetomanydemo.model.Address;
import com.richa.jpaonetomanydemo.model.Student;
import com.richa.jpaonetomanydemo.repository.AddressRepository;
import com.richa.jpaonetomanydemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;
    @Autowired
    StudentRepository studentRepository;

    public Address addAddress(int studentId, Address address){
       Student s1 =  studentRepository.getOne(studentId);
       address.setStudent(s1);
       return addressRepository.save(address);

    }
    public List<Address> listAddress(int studentId){
        return addressRepository.findByStudentId(studentId);
    }

    public Address updateAddress(int studentId, Address address) {
        return addressRepository.save(address);
    }

    public void deleteAddress(int studentId) {
        addressRepository.deleteById(studentId);
    }

    public List<Address> listAllAddress() {
        return addressRepository.findAll();
    }
}
