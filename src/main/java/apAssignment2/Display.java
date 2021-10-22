package apAssignment2;
import java.io.File; 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner; 

import java.io.BufferedWriter; 
import java.io.FileWriter; 
import java.io.PrintWriter;


public class Display {
	
           public static void Create_File() 
           {
        	 
        	 try {
        	      File myObj = new File("Inputfile.txt");
        	      if (myObj.createNewFile()) {
        	        System.out.println("File created: " + myObj.getName());
        	      } 
        	      else 
        	      {
        	        System.out.println("File already exists.");
        	      }
        	    } catch (IOException e) {
        	      System.out.println("An error occurred.");
        	      e.printStackTrace();
        	    }
        	  
           }
           
           public  void Input()
           {
        	   String Name;
        	   String Gender;
        	   String passport;
        	   String address;
        	   String destination;
        	   String type_of_Plane;
        	   
        	     String Origin;
        		 String Destination;
        		 String flight_Date;
        		 int book_seat;
        		 String CNIC;
        		 String pass;
        	   
        	   Passenger obj2=new Passenger();
        	   Flight obj3=new Flight();
        	 int choice;
        	 System.out.println("Welcome To Flight Reservation system ");  
        	 System.out.println("Customer Registration: ");
        	 System.out.println("Are you want to book a flight!");
        	 System.out.println("Enter 1 for yes and 0 for No!");
        	 
        	 Scanner Obj1 = new Scanner(System.in); 
        	 choice=Obj1.nextInt();
        	 
        	 if(choice==1)
        	 {
        		 Obj1 = new Scanner(System.in);  		 
        	     System.out.println("Enter your Name : ");
        	    Name = Obj1.nextLine(); 
        	    obj2.setname(Name);
        	    
        	    System.out.println(" ");
        	   // System.out.println(" your Name : " + name);
        	    
        	    System.out.println("Enter your Gender(Male or Female) : ");
        	    
        	    Gender = Obj1.nextLine(); 
        	    obj2.setgender(Gender); 
        	    //System.out.println(" your gender : " + gender);
        	    System.out.println("Enter your Address : ");
        	    address = Obj1.nextLine(); 
        	    obj2.setAddress(address);
        	    System.out.println("Enter your Passport Number : ");
        	    passport = Obj1.nextLine(); 
        	    obj2.setPassport(passport);
        	    System.out.println("Enter Type plane in strings(Enter your choice) : ");
        	    System.out.println("Business class");
        	    System.out.println("Economy class");
        	    System.out.println("First class ");
        	    type_of_Plane = Obj1.nextLine(); 
        	    obj2.setType_of_Plane(type_of_Plane);
        	    
        	    System.out.println("Please Enter your Destination (name of city):  ");
        	    destination=Obj1.nextLine();
        	    obj2.setDestination(destination);
        	    
        	    System.out.println("Please Enter correct Flight information! ");
        	    System.out.println("Enter your Origin(Departure city) Name:");
        	    Origin=Obj1.nextLine();
        	    obj3.setorigin(Origin);
        	    
        	    System.out.println("Enter your Destination (Arrival city)name :");
        	    Destination=Obj1.nextLine();
        	    obj3.setDestination(Destination);
        	    
        	    System.out.println("Enter Date of your travel :");
        	    flight_Date=Obj1.nextLine();
        	    obj3.setflight_Date(flight_Date);
        	    
        	    System.out.println("How many seats you want to book (Enter number): ");
        	    book_seat=Obj1.nextInt();
        	    obj3.setbook_seat(book_seat);
        	    
        	    Obj1 = new Scanner(System.in); 
        	    System.out.println("Enter your Passport Number : ");
        	    pass = Obj1.nextLine(); 
        	    obj3.setPassport(pass);
        	    
        	    Obj1 = new Scanner(System.in); 
        	    System.out.println("Enter your Valid CNIC Number : ");
        	    CNIC=Obj1.nextLine();
        	    obj3.setCNIC(CNIC);
        	    
        	    
        	    
           }
        	 
        	 else
        	 {
        		 System.out.println("You do not want to book a flight so system quit!");	 
        	 }
        	 
        }  
           
           public static void Write_File()
           {
        	   
        	   FileWriter fw = null; 
        	   BufferedWriter bw = null;
        	   PrintWriter pw = null;
               
        	   try { 
        		   fw = new FileWriter("Inputfile.txt", true); 
        		   bw = new BufferedWriter(fw);
        		   pw = new PrintWriter(bw); 
        		   pw.println("Shane"); 
        		   pw.println("Root");
        		   pw.println("Ben");
        		   System.out.println("Data Successfully appended into file");
        		   pw.flush(); 
        		   
        	   }
        	   
        	   catch (IOException io) 
    		   {
    			   // can't do anything 
    			   //}
    		   }
        	   
        	   finally 
        	   {
        		   try 
        		   {
        			   pw.close();
        			   bw.close();
        			   fw.close(); 
        			   }
        		   
        		   catch (IOException io) 
        		   {
        			   // can't do anything 
        			   //}
        		   }
        		   
        		   
        	   }
        	   
        	   //final
           
        	   }

        		 
           
           
           public static void Read_File()
           {
        	   try {
        		      File myObj = new File("Inputfile.txt");
        		      Scanner myReader = new Scanner(myObj);
        		      while (myReader.hasNextLine()) 
        		      {
        		        String data = myReader.nextLine();
        		        System.out.println(data);
        		      }
        		      
        		      myReader.close();
        		    } 
        	   
        	         catch (FileNotFoundException e) 
        	         {
        		      System.out.println("An error occurred.");
        		      e.printStackTrace();
        		    }
           }
           
           
           
        	   
           }
           
           
        
           
           
           
//}
