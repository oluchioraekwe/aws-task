package utility;

public class Ec2ImageDetails {
	
	private String accountId;
	private String region;
	private String imageId;
	private String imageType;
	private String creationDate;
	private String status;
	
	public Ec2ImageDetails() {
		super();
	}

	public Ec2ImageDetails(String accountId, String region, String imageId, String imageType, String creationDate,
			String status) {
		super();
		this.accountId = accountId;
		this.region = region;
		this.imageId = imageId;
		this.imageType = imageType;
		this.creationDate = creationDate;
		this.status = status;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	

}
