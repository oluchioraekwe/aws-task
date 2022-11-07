package utility;

public class CsvBody{
	private String accountId;
	private String iamUser;
	private String keyLastRotated;
	private long dayCount;
	private String status;
	public CsvBody() {
		super();
	}
	public CsvBody(String accountId, String iamUser, String keyLastRotated, long dayCount, String status) {
		super();
		this.accountId = accountId;
		this.iamUser = iamUser;
		this.keyLastRotated = keyLastRotated;
		this.dayCount = dayCount;
		this.status = status;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getIamUser() {
		return iamUser;
	}
	public void setIamUser(String iamUser) {
		this.iamUser = iamUser;
	}
	public String getKeyLastRotated() {
		return keyLastRotated;
	}
	public void setKeyLastRotated(String keyLastRotated) {
		this.keyLastRotated = keyLastRotated;
	}
	public long getDayCount() {
		return dayCount;
	}
	public void setDayCount(Long dayCount) {
		this.dayCount = dayCount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}
