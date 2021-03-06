package com.challenge.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.challenge.entity.Challenge;

@Repository
public interface ChallengeRepository extends JpaRepository<Challenge, Long> {

	@Query("select distinct cha from Challenge cha " +
			  " join cha.accelerations as acc " +
			  " join acc.candidates can " +
			  " join can.id.user user " +
			  "where user.id = ?2 and acc.id = ?1")
	List<Challenge> findByAccelerationIdAndUserId(Long accelerationId, Long userId);
}