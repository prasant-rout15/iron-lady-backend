package com.ironlady.aiassistant.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;


@Entity
@Table(name = "ai_leads")
public class AiLead {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String role;
    private String experience;
    private String struggle;
    private String goal;
    
    private String name;
    private String email;
    private String phone;
    
    
    @Column(name = "deleted")
    private boolean deleted = false;

    
    @Column(name = "recommended_program")
    private String recommendedProgram;

    private String status = "NEW";

    private LocalDateTime createdAt = LocalDateTime.now();
    
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getStruggle() {
		return struggle;
	}

	public void setStruggle(String struggle) {
		this.struggle = struggle;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public String getRecommendedProgram() {
		return recommendedProgram;
	}

	public void setRecommendedProgram(String recommendedProgram) {
		this.recommendedProgram = recommendedProgram;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
	

	
	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "AiLead [id=" + id + ", role=" + role + ", experience=" + experience + ", struggle=" + struggle
				+ ", goal=" + goal + ", name=" + name + ", email=" + email + ", phone=" + phone + ", deleted=" + deleted
				+ ", recommendedProgram=" + recommendedProgram + ", status=" + status + ", createdAt=" + createdAt
				+ "]";
	}
	
	





    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
