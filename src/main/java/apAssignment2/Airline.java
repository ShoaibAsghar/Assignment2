package apAssignment2;

public class Airline 
{
  private int total_flight;	
  private static String[] Flight_schedule=new String[7];
  
  public Airline()
  {
	total_flight=0;
	
  }
  
  public Airline(int T_flight,String[] schedule)
  {
	  total_flight=T_flight;
	  Flight_schedule=schedule;
	  
  }
  
  
   private static void compos_Airplane() 
   {
	   Airplane plane= new Airplane();
	  
	   plane.settotal_seat(50) ;
	   System.out.println("The total seat in plane is "+ plane.gettotal_seat() ); 
	   
	   plane.settotal_planes(6) ;
	   System.out.println("The total plane is "+ plane.gettotal_planes() ); 
   }
   
  
  
}
