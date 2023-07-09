
public class Residential extends Building {

	 // instance variables
	  protected int numBedrooms;
	  protected int numBathrooms;
	  protected boolean laundryRoom;

	  // CONSTRUCTORS
	  // empty argument constructor
	  public Residential() {
	    super();
	    this.numBedrooms = 0;
	    this.numBathrooms = 0;
	    this.laundryRoom = false;
	  }

	  public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
	      String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
	    super.setProjectName(projectName);
	    super.setCompleteAddress(completeAddress);
	    super.setTotalSquareFeet(totalSquareFeet);
	    super.setOccupancyGroup(occupancyGroup);
	    this.numBedrooms = numBedrooms;
	    this.numBathrooms = numBathrooms;
	    this.laundryRoom = laundryRoom;
	  }

	  // getters and setters
	  public int getNumBedrooms() {
	    return numBedrooms;
	  }

	  public void setNumBedrooms(int numBedrooms) {
	    this.numBedrooms = numBedrooms;
	  }

	  public int getNumBathrooms() {
	    return numBathrooms;
	  }

	  public void setNumBathrooms(int numBathrooms) {
	    this.numBathrooms = numBathrooms;
	  }

	  public boolean isLaundryRoom() {
	    return laundryRoom;
	  }

	  public void setLaundryRoom(boolean laundryRoom) {
	    this.laundryRoom = laundryRoom;
	  }

	  @Override
	  public void draw() {
	  }

	  @Override
	  public String displayData() {
	    return "Residential [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
	        + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + ", numBedrooms="
	        + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom=" + laundryRoom + "]";
	  }
}
