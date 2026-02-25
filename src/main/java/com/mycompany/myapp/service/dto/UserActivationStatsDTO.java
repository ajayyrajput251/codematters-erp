package com.mycompany.myapp.service.dto;

public class UserActivationStatsDTO {
	 private long totalUsers;
	    private long activatedUsers;

	    public UserActivationStatsDTO(long totalUsers, long activatedUsers) {
	        this.totalUsers = totalUsers;
	        this.activatedUsers = activatedUsers;
	    }

	    public long getTotalUsers() {
	        return totalUsers;
	    }

	    public long getActivatedUsers() {
	        return activatedUsers;
	    }
}
