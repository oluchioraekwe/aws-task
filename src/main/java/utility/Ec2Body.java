package utility;

import java.util.List;

public class Ec2Body{
	private String region;
	private List<String> regions;

	
	public Ec2Body() {
		super();
	}

	

	public Ec2Body(String region, List<String> regions) {
		super();
		this.region = region;
		this.regions = regions;
	}



	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}



	public List<String> getRegions() {
		return regions;
	}



	public void setRegions(List<String> regions) {
		this.regions = regions;
	}
	
	
	
}


