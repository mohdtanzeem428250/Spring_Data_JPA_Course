package com.data.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.data.jpa.entity.Address;
public interface AddressRepository extends JpaRepository<Address, Integer>
{

}
