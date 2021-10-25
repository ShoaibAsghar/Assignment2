package apAssignment2;

public class Airplane 
{
 private static int total_seat;	
 private static int total_planes;
 
 public Airplane()
 {
   total_seat=60;
   total_planes=7;
 }
 
 public void settotal_seat(int seat) 
 {
	 total_seat=seat;	 
 }
 
 public int gettotal_seat() 
 {
	 return total_seat;
 }
 
 
 public void settotal_planes(int plane) 
 {
	 total_planes=plane;	 
 }
 
 public int gettotal_planes() 
 {
	 return total_planes;
 }
 
 
}
