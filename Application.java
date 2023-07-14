
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Building object
		Building building1 = new Building();
	    building1.setProjectName("Gaines House");
	    building1.setCompleteAddress("123 Main Street | Louisville, Kentucky 40201");
	    building1.setTotalSquareFeet(2540);
	    building1.setOccupancyGroup("Residential");
	    building1.setSubgroup("R1");
	    System.out.println(building1.displayData());

	    System.out.println("");

	    // Business object
	    Business business1 = new Business();
	    business1.setProjectName("Gaines House");
	    business1.setCompleteAddress("123 Main Street | Louisville, Kentucky 40201");
	    business1.setTotalSquareFeet(2000);
	    business1.setOccupancyGroup("Business");
	    business1.setSubgroup("Group B");
	    business1.setNumRentableUnits(3);
	    System.out.println(business1.displayData());

	    System.out.println("");

	    // Residential Object
	    Residential residential1 = new Residential();
	    residential1.setProjectName("Gaines House");
	    residential1.setCompleteAddress("11115 Indian Legends Dr. | Louisville, Kentucky 40241");
	    residential1.setTotalSquareFeet(1700);
	    residential1.setOccupancyGroup("Residential");
	    residential1.setSubgroup("Group R");
	    residential1.setNumBedrooms(3);
	    residential1.setNumBathrooms(2);
	    residential1.setLaundryRoom(true);
	    System.out.println(residential1.displayData());

	    System.out.println("");

	    // Mall Object
	    Mall mall1 = new Mall();
	    mall1.setProjectName("Mall of America");
	    mall1.setCompleteAddress("60 E Broadway | Bloomington, Minnesota 55425");
	    mall1.setTotalSquareFeet(3000);
	    mall1.setOccupancyGroup("Mercantile");
	    mall1.setSubgroup("Group M");
	    mall1.setNumRentedUnits(3);
	    mall1.setMedianUnitSize(500);
	    mall1.setNumParkingSpaces(100);
	    mall1.draw();
	    System.out.println(mall1.displayData());

	}

}
