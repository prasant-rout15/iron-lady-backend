package com.ironlady.aiassistant.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ironlady.aiassistant.entity.AiLead;

@Repository
public interface AiLeadRepository extends JpaRepository<AiLead, Long>{
	List<AiLead> findByDeletedFalse();


}
