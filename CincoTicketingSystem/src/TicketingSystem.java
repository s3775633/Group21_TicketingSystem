import java.util.ArrayList;

public class TicketingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketSystem ts = new TicketSystem();
		Technician t1 = new Technician("Harry Styles", 1, "HStyles", "Styles1");
		Technician t2 = new Technician("Niall Horan", 1, "NHoran", "Horan1");
		Technician t3 = new Technician("Liam Payne", 1, "LPyane", "Payne1");
		Technician t4 = new Technician("Louis Tomlinson", 2, "LTomlinson", "Tomlinson1");
		Technician t5 = new Technician("Zayn Malik", 2, "ZMalik", "Malik1");
		ts.addTechnician(t1);
		ts.addTechnician(t2);
		ts.addTechnician(t3);
		ts.addTechnician(t4);
		ts.addTechnician(t5);
	}

}
