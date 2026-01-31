package com.ironlady.aiassistant.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ironlady.aiassistant.entity.AiLead;
import com.ironlady.aiassistant.service.AiLeadService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/leads")

public class AiLeadController {

	private final AiLeadService service;
	

    public AiLeadController(AiLeadService service) {
        this.service = service;
    }

    @GetMapping
    public List<AiLead> all(){
        return service.getAll();
    }

    @PutMapping("/{id}")
    public AiLead update(@PathVariable Long id, @RequestParam String status){
        return service.updateStatus(id, status);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.softDelete(id);
    }

    
    @PutMapping("/contact/{id}")
    public void updateContact(@PathVariable Long id, @RequestBody AiLead dto){

        AiLead lead = service.getById(id);

        lead.setName(dto.getName());
        lead.setEmail(dto.getEmail());
        lead.setPhone(dto.getPhone());

        service.save(lead);
    }

    
    
	  
}
