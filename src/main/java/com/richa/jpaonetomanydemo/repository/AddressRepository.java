package com.richa.jpaonetomanydemo.repository;

import com.richa.jpaonetomanydemo.model.Address;
import com.richa.jpaonetomanydemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {

    List<Address> findByStudentId(int studentId);
}
