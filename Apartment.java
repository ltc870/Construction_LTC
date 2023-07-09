
public class Apartment extends Residential {

	// instance variables
	  private int numRentableUnits;
	  private double avgUnitSize;
	  private boolean parkingAvailable;

	  // CONSTRUCTORS
	  // empty argument constructor
	  public Apartment() {
	    super();
	    this.numRentableUnits = 0;
	    this.avgUnitSize = 0;
	    this.parkingAvailable = false;
	  }

	  // preferred constructor
	  public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
	      String subgroup, int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
	    super.setProjectName(projectName);
	    super.setCompleteAddress(completeAddress);
	    super.setTotalSquareFeet(totalSquareFeet);
	    super.setOccupancyGroup(occupancyGroup);
	    super.setSubgroup(subgroup);
	    this.numRentableUnits = numRentableUnits;
	    this.avgUnitSize = avgUnitSize;
	    this.parkingAvailable = parkingAvailable;
	  }

	  // getters and setters
	  public int getNumRentableUnits() {
	    return numRentableUnits;
	  }

	  public void setNumRentableUnits(int numRentableUnits) {
	    this.numRentableUnits = numRentableUnits;
	  }

	  public double getAvgUnitSize() {
	    return avgUnitSize;
	  }

	  public void setAvgUnitSize(double avgUnitSize) {
	    this.avgUnitSize = avgUnitSize;
	  }

	  public boolean isParkingAvailable() {
	    return parkingAvailable;
	  }

	  public void setParkingAvailable(boolean parkingAvailable) {
	    this.parkingAvailable = parkingAvailable;
	  }

	  @Override
	  public void draw() {
	  }

	  @Override
	  public String displayData() {
	    return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
	        + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + ", numRentableUnits="
	        + numRentableUnits + ", avgUnitSize=" + avgUnitSize + "parkingAvailable=" + parkingAvailable + "]";
	  }
}
