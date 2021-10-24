/**
 * 
 */
package apAssignment2;

/**
 * @author shoaib Asghar
 *
 */

public class Flight 
{
     
	 private Passenger name;
	  
	 public void setPassenger(Passenger name) 
	   {
			this.name=name;	 
	   }
	 
	 public Passenger getname() 
	   {
			 return name;
	   }
	 
	 
	 private String Origin;
	 private String Destination;
	 private static String[] flight_Date=new String[7];
	 private static String[] flight_schedule=new String[7];
	 private int book_seat;
	 private String CNIC,Passport;
     
	 public Flight()
	 {
		 Origin=" ";	 
		 Destination=" ";	
		 book_seat=0; 
		
		 CNIC=" ";	 
		 Passport=" ";	 
		 
	 }
	 public Flight(String org,String des,String[] date,int siz,String cnic,String pass)
	 {
		 Origin=org;	 
		 Destination=des;	
		 book_seat=siz;
		 flight_Date=date;
		 CNIC=cnic;	 
		 Passport=pass;	 
	 }
	 
	 
	 
	 public void setorigin(String org) 
     {
		 Origin=org;	 
     }
	 
	 public String getorigin() 
     {
		 return Origin;
     }
	 
	 public void setDestination(String des) 
     {
		 Destination=des;	 
     }
	 
	 public String getDestination() 
     {
		 return Destination;	 
     }
	 
	 public static void setflight_Date(String[] date) 
     {
		 flight_Date=date;
     }
	 
	 //
	 public static void setflight_schedule(String[] schedul) 
     {
		 flight_schedule=schedul;
     }
	 
	 public String[] getflight_schedule() 
     {
		 return flight_schedule;
     }
	 
	 //
	 public String[] getflight_Date() 
     {
		return flight_Date;
     }
	 
	 public void setbook_seat(int bookseat) 
     {
		 book_seat=bookseat;	 
     }
	 
	 public int getbook_seat() 
     {
		 return book_seat;	 
     }
	 
	 public void setCNIC(String cnic) 
     {
		 CNIC=cnic;	 
     }
	 
	 public String getCNIC() 
     {
		return CNIC; 
     }
	 
	 public void setPassport(String pass) 
     {
		 Passport=pass;	 
     }
	 
	 public String getPassport() 
     {
		 return Passport;	 
     }
	 
	 
}
