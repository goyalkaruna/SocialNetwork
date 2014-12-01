package domain;

public class ResponseType1 {
	
		private int responseMessage;
		public int getResponseMessage() {
			return responseMessage;
		}
		public void setResponseMessage(int responseMessage) {
			this.responseMessage = responseMessage;
		}
		public int getResponseCode() {
			return responseCode;
		}
		public void setResponseCode(int responseCode) {
			this.responseCode = responseCode;
		}
		public String getServerCreateDate() {
			return serverCreateDate;
		}
		public void setServerCreateDate(String serverCreateDate) {
			this.serverCreateDate = serverCreateDate;
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public int getMailSent() {
			return mailSent;
		}
		public void setMailSent(int mailSent) {
			this.mailSent = mailSent;
		}
		public int getType() {
			return type;
		}
		public void setType(int type) {
			this.type = type;
		}
		public String getServerModificationDate() {
			return serverModificationDate;
		}
		public void setServerModificationDate(String serverModificationDate) {
			this.serverModificationDate = serverModificationDate;
		}
		private int responseCode;
		private String serverCreateDate;
		private int userId;
		private int mailSent;
		private int type;
		private String serverModificationDate;

}
