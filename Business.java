
public class Business extends Building{

	// instance variables
	  protected int numRentableUnits;

	  // CONSTRUCTORS
	  // empty argument constructor
	  public Business() {
	    super();
	    this.numRentableUnits = 0;
	  }

	  // preferred constructor
	  public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
	      String subgroup, int numRentableUnits) {
	    super.setProjectName(projectName);
	    super.setCompleteAddress(completeAddress);
	    super.setTotalSquareFeet(totalSquareFeet);
	    super.setOccupancyGroup(occupancyGroup);
	    this.numRentableUnits = numRentableUnits;
	  }

	  // getters and setters
	  public int getNumRentableUnits() {
	    return numRentableUnits;
	  }

	  public void setNumRentableUnits(int numRentableUnits) {
	    this.numRentableUnits = numRentableUnits;
	  }

	  @Override
	  public void draw() {
	  }

	  @Override
	  public String displayData() {
	    return "Business [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
	        + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + ", numRentableUnits="
	        + numRentableUnits + "]";
	  }
}
