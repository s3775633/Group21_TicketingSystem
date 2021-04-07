import java.util.ArrayList;

public class Technician {
	private String name;
	private int level;
	private String username;
	private String password;
	private ArrayList<Ticket> tickets;
	
	public Technician(String name, int level, String username, String password)
	{
		this.name = name;
		this.level = level;
		this.username = username;
		this.password = password;
		this.tickets = new ArrayList<Ticket>();
	}
	
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
	
	public void setPassword(String password)
	{
		this.password = password;
	}
}
