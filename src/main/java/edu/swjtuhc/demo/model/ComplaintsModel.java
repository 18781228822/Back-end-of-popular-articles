package edu.swjtuhc.demo.model;

public class ComplaintsModel {
		public String username;	
		public String content;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
	
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		@Override
		public String toString() {
			return "ComplaintsModel [username=" + username + ", content=" + content
					+ "]";
		}
		
}
