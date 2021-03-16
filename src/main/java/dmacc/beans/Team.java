package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Team {
	private long teamId;
	private String teamName;
	private String currentProjects;
	
	public Team() {
		super();
	}
	
	public Team(String teamName, String currentProjects) {
		super();
		this.teamName = teamName;
		this.currentProjects = currentProjects;
	}


	public Team(long teamId, String teamName, String currentProjects) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.currentProjects = currentProjects;
	}


	public long getTeamId() {
		return teamId;
	}


	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public String getCurrentProjects() {
		return currentProjects;
	}


	public void setCurrentProjects(String currentProjects) {
		this.currentProjects = currentProjects;
	}


	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", currentProjects=" + currentProjects + "]";
	}
	
	
	
	
	
}