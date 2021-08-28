package com.challenge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.entity.Candidate;
import com.challenge.entity.CandidateId;
import com.challenge.repository.CandidateRepository;
import com.challenge.service.interfaces.CandidateServiceInterface;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CandidateServiceImplementation implements CandidateServiceInterface {

	@Autowired
    private CandidateRepository repository;

    @Override
    public Optional<Candidate> findById(CandidateId id) {
        return repository.findById(id);
    }

    @Override
    public Optional<Candidate> findById(Long userId, Long companyId, Long accelerationId) {
    	 return repository.findByIdUserIdAndIdCompanyIdAndIdAccelerationId(userId, companyId, accelerationId);
    }

    @Override
    public List<Candidate> findByCompanyId(Long companyId) {
        return repository.findByIdCompanyId(companyId);
    }

    @Override
    public List<Candidate> findByAccelerationId(Long accelerationId) {
        return repository.findByIdAccelerationId(accelerationId);
    }

    @Override
    public Candidate save(Candidate candidate) {
        return repository.save(candidate);
    }
}