package com.data.jpa.repository;
import com.data.jpa.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Employee,Integer>
{

}
