import java.util.ArrayList;

public class TicketSystem {
	private ArrayList<Technician> technicians;
	private ArrayList<Staff> staff;
	
	public TicketSystem()
	{
		technicians = new ArrayList<Technician>();
		staff = new ArrayList<Staff>();
	}
	
	public ArrayList<Technician> getTechnicians()
	{
		return technicians;
	}
	
	public ArrayList<Staff> getStaff()
	{
		return staff;
	}
	
	public void addTechnician(Technician technician)
	{
		technicians.add(technician);
	}
}
