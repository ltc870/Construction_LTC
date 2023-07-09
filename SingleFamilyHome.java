
public class SingleFamilyHome extends Residential {

	  // instance variables
	  private boolean garage;

	  // CONSTRUCTORS
	  // empty argument constructor
	  public SingleFamilyHome() {
	    super();
	    this.garage = false;
	  }

	  public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
	      String subgroup, boolean garage) {
	    super.setProjectName(projectName);
	    super.setCompleteAddress(completeAddress);
	    super.setTotalSquareFeet(totalSquareFeet);
	    super.setOccupancyGroup(occupancyGroup);
	    super.setSubgroup(subgroup);
	    this.garage = garage;
	  }

	  // getters and setters
	  public boolean isGarage() {
	    return garage;
	  }

	  public void setGarage(boolean garage) {
	    this.garage = garage;
	  }

	  @Override
	  public void draw() {
	  }

	  @Override
	  public String displayData() {
	    return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
	        + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + ", garage=" + garage
	        + "]";
	  }
}
