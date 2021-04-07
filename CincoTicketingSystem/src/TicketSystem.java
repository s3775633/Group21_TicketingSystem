import java.util.ArrayList;

// Class used to represent the entire system
public class TicketSystem {
	//Arrays of staff and technicians
	private ArrayList<Technician> technicians;
	private ArrayList<Staff> staff;
	
	//Ticket system constructor
	public TicketSystem()
	{
		technicians = new ArrayList<Technician>();
		staff = new ArrayList<Staff>();
	}
	
	// Getters
	public ArrayList<Technician> getTechnicians()
	{
		return technicians;
	}
	
	public ArrayList<Staff> getStaff()
	{
		return staff;
	}
	
	// Method to add a technician to the technicians array
	public void addTechnician(Technician technician)
	{
		technicians.add(technician);
	}
}
