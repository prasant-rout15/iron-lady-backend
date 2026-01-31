package com.ironlady.aiassistant.controller;

import com.ironlady.aiassistant.dto.RecommendationResponse;
import com.ironlady.aiassistant.dto.UserProfileRequest;
import com.ironlady.aiassistant.entity.AiLead;
import com.ironlady.aiassistant.service.AiLeadService;
import com.ironlady.aiassistant.service.OpenAIService;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RecommendationController {

	 private final OpenAIService openAIService;
	    private final AiLeadService leadService;
	    
	    public RecommendationController(OpenAIService openAIService, AiLeadService leadService) {
	        this.openAIService = openAIService;
	        this.leadService = leadService;
	    }


	    @PostMapping("/recommend-program")
	    public Map<String, Object> recommendProgram(@RequestBody UserProfileRequest request) {

	        String result = openAIService.getRecommendation(request);

	        AiLead lead = new AiLead();
	        lead.setRole(request.getRole());
	        lead.setExperience(request.getExperience());
	        lead.setStruggle(request.getStruggle());
	        lead.setGoal(request.getGoal());
	        lead.setRecommendedProgram(result);
	        lead.setStatus("NEW");

	        AiLead saved = leadService.save(lead);

	        Map<String, Object> response = new HashMap<>();
	        response.put("leadId", saved.getId());
	        response.put("plan", result);

	        return response;
	    }

	    
	    
	 

}
