
public class Building {

	// instance variables
	  protected String projectName;
	  protected String completeAddress;
	  protected double totalSquareFeet;
	  protected String occupancyGroup;
	  protected String subgroup;

	  // CONSTRUCTORS
	  // empty argument constructor
	  public Building() {
	    this.projectName = "";
	    this.completeAddress = "";
	    this.totalSquareFeet = 0.00;
	    this.occupancyGroup = "";
	    this.subgroup = "";
	  }

	  // preferred constructor
	  public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
	      String subgroup) {
	    this.projectName = projectName;
	    this.completeAddress = completeAddress;
	    this.totalSquareFeet = totalSquareFeet;
	    this.occupancyGroup = occupancyGroup;
	    this.subgroup = subgroup;
	  }

	  // getters and setters
	  public String getProjectName() {
	    return projectName;
	  }

	  public void setProjectName(String projectName) {
	    this.projectName = projectName;
	  }

	  public String getCompleteAddress() {
	    return completeAddress;
	  }

	  public void setCompleteAddress(String completeAddress) {
	    this.completeAddress = completeAddress;
	  }

	  public double getTotalSquareFeet() {
	    return totalSquareFeet;
	  }

	  public void setTotalSquareFeet(double totalSquareFeet) {
	    this.totalSquareFeet = totalSquareFeet;
	  }

	  public String getOccupancyGroup() {
	    return occupancyGroup;
	  }

	  public void setOccupancyGroup(String occupancyGroup) {
	    this.occupancyGroup = occupancyGroup;
	  }

	  public String getSubgroup() {
	    return subgroup;
	  }

	  public void setSubgroup(String subgroup) {
	    this.subgroup = subgroup;
	  }

	  public void draw() {
	  }

	  public String displayData() {
	    return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
	        + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	  }
}
