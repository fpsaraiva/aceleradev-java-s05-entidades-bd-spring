package com.challenge.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.entity.Submission;
import com.challenge.repository.SubmissionRepository;
import com.challenge.service.interfaces.SubmissionServiceInterface;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SubmissionServiceImplementation implements SubmissionServiceInterface {

	@Autowired
    private SubmissionRepository repository;

    @Override
    public BigDecimal findHigherScoreByChallengeId(Long challengeId) {
    	return BigDecimal.valueOf(repository.findHigherScoreByChallengeId(challengeId));
      }

    @Override
    public List<Submission> findByChallengeIdAndAccelerationId(Long challengeId, Long accelerationId) {
        return repository.findByChallengeIdAndAccelerationId(challengeId, accelerationId);
    }

    @Override
    public Submission save(Submission submission) {
        return repository.save(submission);
    }
}