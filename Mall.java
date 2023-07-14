
public class Mall extends Business{

	// instance variables
	  private int numRentedUnits;
	  private double medianUnitSize;
	  private int numParkingSpaces;

	  // CONSTRUCTORS
	  // empty argument constructors
	  public Mall() {
	    super();
	    this.numRentedUnits = 0;
	    this.medianUnitSize = 0;
	    this.numParkingSpaces = 0;
	  }

	  public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
	      String subgroup, int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
	    super.setProjectName(projectName);
	    super.setCompleteAddress(completeAddress);
	    super.setTotalSquareFeet(totalSquareFeet);
	    super.setOccupancyGroup(occupancyGroup);
	    super.setSubgroup(subgroup);
	    this.numRentedUnits = 0;
	    this.medianUnitSize = 0.0;
	    this.numParkingSpaces = 0;
	  }

	  // getters and setters
	  public int getNumRentedUnits() {
	    return numRentedUnits;
	  }

	  public void setNumRentedUnits(int numRentedUnits) {
	    this.numRentedUnits = numRentedUnits;
	  }

	  public double getMedianUnitSize() {
	    return medianUnitSize;
	  }

	  public void setMedianUnitSize(double medianUnitSize) {
	    this.medianUnitSize = medianUnitSize;
	  }

	  public int getNumParkingSpaces() {
	    return numParkingSpaces;
	  }

	  public void setNumParkingSpaces(int numParkingSpaces) {
	    this.numParkingSpaces = numParkingSpaces;
	  }

	  @Override
	  public void draw() {
		  System.out.println("<<Draw building>>");
	  }

	  @Override
	  public String displayData() {
	    return "Mall [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
	        + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + ", numRentedUnits="
	        + numRentedUnits + ", medianUnitSize=" + medianUnitSize
	        + ", numParkingSpaces=" + numParkingSpaces + "]";
	  }
}
