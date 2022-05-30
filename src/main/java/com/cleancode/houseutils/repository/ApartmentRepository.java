package com.cleancode.houseutils.repository;

import com.cleancode.houseutils.entity.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository extends JpaRepository<Apartment, Long> {
}
