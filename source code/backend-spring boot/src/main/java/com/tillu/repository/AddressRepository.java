package com.tillu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tillu.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
