package com.cleancode.houseutils.service;

import com.cleancode.houseutils.exception.ErrorCode;
import com.cleancode.houseutils.exception.HouseUtilsException;
import com.cleancode.houseutils.repository.ApartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ApartmentService {
    private final ApartmentRepository apartmentRepository;

    public Long getPriceOrThrow(Long apartmentId) {
        return apartmentRepository.findById(apartmentId)
                .orElseThrow(() -> new HouseUtilsException(ErrorCode.ENTITY_NOT_FOUND))
                .getPrice();
    }
}


