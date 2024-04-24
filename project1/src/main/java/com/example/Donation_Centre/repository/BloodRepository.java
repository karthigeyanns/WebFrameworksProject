package com.example.Donation_Centre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Donation_Centre.model.Blood;

public interface BloodRepository extends JpaRepository<Blood, Long> {
    
   
}
