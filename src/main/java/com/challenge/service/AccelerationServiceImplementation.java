package com.challenge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.entity.Acceleration;
import com.challenge.repository.AccelerationRepository;
import com.challenge.service.interfaces.AccelerationServiceInterface;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccelerationServiceImplementation implements AccelerationServiceInterface {

    @Autowired
    private AccelerationRepository repository;

    @Override
    public Optional<Acceleration> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Acceleration> findByCompanyId(Long companyId) {
        return repository.findByCandidatesIdCompanyId(companyId);
    }

    @Override
    public Acceleration save(Acceleration acceleration) {
        return repository.save(acceleration);
    }
}