package edu.swjtuhc.demo.model;

public class DeleteModel {
	public int Aid;
	public String username;
	public int getAid() {
		return Aid;
	}
	public void setAid(int aid) {
		Aid = aid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "DeleteModel [Aid=" + Aid + ", username=" + username + "]";
	}
	
}
