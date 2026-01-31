package com.ironlady.aiassistant.dto;


public class UserProfileRequest {
	    private String role;
	    private String experience;
	    private String struggle;
	    private String goal;
	    
	    
	    
	    
	    
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
		
		
		
		
		@Override
		public String toString() {
			return "UserProfileRequest [role=" + role + ", experience=" + experience + ", struggle=" + struggle
					+ ", goal=" + goal + ", getRole()=" + getRole() + ", getExperience()=" + getExperience()
					+ ", getStruggle()=" + getStruggle() + ", getGoal()=" + getGoal() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
	    
	    
	    
}
