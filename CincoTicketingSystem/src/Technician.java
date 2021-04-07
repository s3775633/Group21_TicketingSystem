import java.util.ArrayList;

// Class used to create a technician within the system
public class Technician {
	private String name;
	private int level;
	private String username;
	private String password;
	private ArrayList<Ticket> tickets;
	
	// Constructor
	public Technician(String name, int level, String username, String password)
	{
		this.name = name;
		this.level = level;
		this.username = username;
		this.password = password;
		this.tickets = new ArrayList<Ticket>();
	}
	
	// Getters
	public String getName()
	{
		return name;
	}
	
	public int getLevel()
	{
		return level;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public ArrayList<Ticket> getTickets()
	{
		return tickets;
	}
	
	// Setter
	public void setPassword(String password)
	{
		this.password = password;
	}
}
