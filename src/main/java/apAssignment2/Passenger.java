package apAssignment2;

public class Passenger 
{
   private String name;
   private String gender;
   private String Passport;
   private String Address;
   private String Destination;
   private String Type_of_Plane;
   
   public Passenger(String nam,String gen,String pass,String Add,String des,String plane_type)
   {
	   Type_of_Plane=plane_type;	 
	   name=nam;
	   gender=gen;
	   Passport=pass;	 
	   Address=Add;	
	   Destination=des;	
	   
   }
   
   public void setname(String nam) 
   {
		 name=nam;	 
   }

  public String getname() 
   {
		 return name;
   }
	
  public void setgender(String gen) 
  {
		 gender=gen;	 
  }
  
  public String getgender() 
  {
		 return gender; 
  }
  
  public void setPassport(String pass) 
  {
		 Passport=pass;	 
  }
	 
	 public String getPassport() 
  {
		 return Passport;	 
  }
	 
   
	 public void setAddress(String Add) 
	  {
			 Address=Add;	 
	  }
	 
	 public String getAddress() 
	  {
			 return Address;	 
	  }
	 
	 public void setDestination(String des) 
     {
		 Destination=des;	 
     }
	 
	 public String getDestination() 
     {
		 return Destination;	 
     }
	 
	 public void setType_of_Plane(String plane_type) 
     {
		 Type_of_Plane=plane_type;	 
     }
	 
	 public String getType_of_Plane() 
     {
		 return Type_of_Plane; 
     }
	 
   public void Input()
   {
	   
	 System.out.println("Customer Registration: ");
	 System.out.println("Enter your Name : ");
	 
	 
   }
	
}
