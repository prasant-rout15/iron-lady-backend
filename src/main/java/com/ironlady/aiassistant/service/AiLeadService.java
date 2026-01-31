package com.ironlady.aiassistant.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ironlady.aiassistant.entity.AiLead;
import com.ironlady.aiassistant.repo.AiLeadRepository;

@Service
public class AiLeadService {
	
	private final AiLeadRepository repository;
	
	   public AiLeadService(AiLeadRepository repository) {
	        this.repository = repository;
	    }

    public AiLead save(AiLead lead){
        return repository.save(lead);
    }

    public List<AiLead> getAll(){
        return repository.findAll();
    }

    public AiLead updateStatus(Long id, String status){
        AiLead lead = repository.findById(id).orElseThrow();
        lead.setStatus(status);
        return repository.save(lead);  
    }

    public void softDelete(Long id){
        AiLead lead = repository.findById(id).orElseThrow();
        lead.setDeleted(true);
        repository.save(lead);
    }

    
    public AiLead getById(Long id){
        return repository.findById(id).get();
    }

}
