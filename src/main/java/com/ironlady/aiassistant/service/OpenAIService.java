package com.ironlady.aiassistant.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.ironlady.aiassistant.ProgramData;
import com.ironlady.aiassistant.dto.UserProfileRequest;
@Service
public class OpenAIService {

	public String getRecommendation(UserProfileRequest user) {
        System.out.println(  user);
	    String struggle = user.getStruggle().toLowerCase().trim();
	    String role = user.getRole().toLowerCase().trim();
	    String goal = user.getGoal().toLowerCase().trim();

	    System.out.println("DEBUG struggle: " + struggle);
	    System.out.println("DEBUG role: " + role);
	    System.out.println("DEBUG goal: " + goal);

	    if (struggle.contains("confidence") 
	            || struggle.contains("office") 
	            || struggle.contains("politics")) {

	        return """
	Recommended Program: Leadership Essentials Program

	Why:
	Designed for working women facing confidence issues, visibility challenges,
	and office politics in corporate environments.

	60-Day Roadmap:
	Week 1-2: Confidence building exercises
	Week 3-4: Visibility and communication techniques
	Week 5-6: Political navigation strategies
	Week 7-8: Prepare for promotion discussion
	""";
	    }

	    else if (goal.contains("board") 
	            || role.contains("senior") 
	            || goal.contains("promotion")) {

	        return """
	Recommended Program: 100 Board Members Program

	Why:
	Focuses on executive presence and board readiness.

	60-Day Roadmap:
	Week 1-2: Executive mindset training
	Week 3-4: Strategic thinking practices
	Week 5-6: Board-level communication
	Week 7-8: Personal brand for leadership
	""";
	    }

	    else {

	        return """
	Recommended Program: Master of Business Warfare

	Why:
	Ideal for women entrepreneurs and leaders looking to grow in competitive environments.

	60-Day Roadmap:
	Week 1-2: Business clarity
	Week 3-4: Competitive strategy
	Week 5-6: Growth planning
	Week 7-8: Execution roadmap
	""";
	    }
	}

}
