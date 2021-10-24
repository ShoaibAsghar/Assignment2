package apAssignment2;

public class Ticket 
{
 private static int Ticket_number;
 
 public Ticket()
 {
	 Ticket_number=0;	 
 }
 
 public Ticket(int tick)
 {
	 Ticket_number=tick;	 
 }
 
 public static void setTicket_number(int num) 
 {
	 Ticket_number=num;	 
 }

 public int getTicket_number() 
 {
	 return Ticket_number;	 
 }
 
	
}
