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
 
	 private String Origin;
	 private String Destination;
	 private static String [] flight_Date;
	 private int size=10;
	 private String CNIC,Passport;
    
	 public Flight(String org,String des,String [] date,int siz,String cnic,String pass)
	 {
		 Origin=org;	 
		 Destination=des;	
		 size=siz;
		 flight_Date[size]=date[size];
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
	 
	 public void setflight_Date(String [] date,int siz) 
     {
		 flight_Date[size]=date[size];
     }
	 
	 public String getflight_Date() 
     {
		return flight_Date[size];
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
