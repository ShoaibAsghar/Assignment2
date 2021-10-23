package apAssignment2;
import java.io.File; 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

import java.io.BufferedWriter; 
import java.io.FileWriter; 
import java.io.PrintWriter;
import java.lang.invoke.SwitchPoint;
import java.util.Random;

public class Display {
	
           public static void Create_File(String Fname) 
           {
        	 
        	 try {
        	      File myObj = new File(Fname);
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
           
           public  void Input(String Fname2)
           {
        	   String Name;
        	   String Gender;
        	   String passport;
        	   String address;
        	   String destination;
        	   String type_of_Plane=" ";
        	   
        	     String Origin;
        		 String Destination;
        		 String flight_Date=" ";
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
        	    int fare=10000;
        	    int total_fare=0;
        	    System.out.println(" ");
        	   
        	    
        	    System.out.println("Enter your Gender(Male or Female) : ");
        	    
        	    Gender = Obj1.nextLine(); 
        	    obj2.setgender(Gender); 
        	    int choice2;
        	    System.out.println("Enter your Address : ");
        	    address = Obj1.nextLine(); 
        	    obj2.setAddress(address);
        	    System.out.println("Enter your Passport Number : ");
        	    passport = Obj1.nextLine(); 
        	    obj2.setPassport(passport);
        	    System.out.println("Enter Type plane in strings(Enter your choice) : ");
        	    System.out.println("Enter 1 for Business class!");
        	    System.out.println("Enter 2 for Economy class!");
        	    System.out.println("Enter 3 for First class! ");
        	    choice2=Obj1.nextInt();
        	    if(choice2==1)
        	    {
        	    	type_of_Plane="Business class";  	
        	    	obj2.setType_of_Plane(type_of_Plane);
        	    	total_fare=fare+3000;
        	    	
        	    }
        	    
        	    if(choice2==2)
        	    {
        	    	type_of_Plane="Economy class";  	
        	    	obj2.setType_of_Plane(type_of_Plane);
        	    	total_fare=fare;
        	    	
        	    }
        	    
        	    if(choice2==3)
        	    {
        	    	type_of_Plane="First Class";  	
        	    	obj2.setType_of_Plane(type_of_Plane);
        	    	total_fare=fare+2000;
        	    	
        	    }
        	    
        	    if(choice2<=0)
        	    {
        	    	System.out.println("You entered wrong choice");
        	    }
        	    
        	  //  type_of_Plane = Obj1.nextLine(); 
        	    //obj2.setType_of_Plane(type_of_Plane);
        	    Obj1 = new Scanner(System.in); 
        	    System.out.println("Enter your Destination (Arrival city)name! ");
        	    destination=Obj1.nextLine();
        	    obj2.setDestination(destination);
        	    
        	    System.out.println("Please Enter correct Flight information! ");
        	    System.out.println("Enter your Origin(Departure city) Name : ");
        	    Obj1 = new Scanner(System.in); 
        	    Origin=Obj1.nextLine();
        	    obj3.setorigin(Origin);
        	    
        	    //System.out.println("Enter your Destination (Arrival city)name :");
        	    //Destination=Obj1.nextLine();
        	    Obj1 = new Scanner(System.in); 
        	    obj3.setDestination(destination);
        	    int choice_date=0;
        	    
        	    String Date1="24/10/2021";
        	    String Date2="25/10/2021";
        	    String Date3="26/10/2021";
        	    String Date4="27/10/2021";
        	    String Date5="28/10/2021";
        	    String Date6="29/10/2021";
        	    String Date7="30/10/2021";
        	    System.out.println("Please choose correct Date From Available Date!");
        	    System.out.println("Enter 1 to choose this-> Date "+Date1+" : ");
        	    System.out.println("Enter 2 to choose this-> Date "+Date2+" : ");
        	    System.out.println("Enter 3 to choose this-> Date "+Date3+" : ");
        	    System.out.println("Enter 4 to choose this-> Date "+Date4+" : ");
        	    System.out.println("Enter 5 to choose this-> Date "+Date5+" : ");
        	    System.out.println("Enter 6 to choose this-> Date "+Date6+" : ");
        	    System.out.println("Enter 7 to choose this-> Date "+Date7+" : ");
        	    Obj1 = new Scanner(System.in); 
        	    //System.out.println("Enter Date of your travel :");
        	    choice_date=Obj1.nextInt();
        	    //
        	    switch (choice_date) 
        	    {
        	    
        	    case 1:
        	      System.out.println("Monday");
        	    	flight_Date=Date1;
            	    obj3.setflight_Date(flight_Date);
        	      break;
        	      
        	    case 2:
        	    	flight_Date=Date2;
            	    obj3.setflight_Date(flight_Date);	
        	        System.out.println("Tuesday");
        	      break;
        	      
        	    case 3:
        	    	flight_Date=Date3;
            	    obj3.setflight_Date(flight_Date); 	
        	        System.out.println("Wednesday");
        	      break;
        	      
        	    case 4:
        	    	flight_Date=Date4;
            	    obj3.setflight_Date(flight_Date);	
        	        System.out.println("Thursday");
        	      break;
        	      
        	    case 5:
        	    	flight_Date=Date5;
            	    obj3.setflight_Date(flight_Date);	
        	        System.out.println("Friday");
        	      break;
        	      
        	    case 6:
        	      System.out.println("Saturday");
        	      flight_Date=Date6;
          	      obj3.setflight_Date(flight_Date);
        	      break;
        	      
        	    case 7:
        	      System.out.println("Sunday");
        	      flight_Date=Date7;
          	      obj3.setflight_Date(flight_Date);
        	      break;
        	  }
        	    //
        	    
        	    
        	    //flight_Date=Obj1.nextLine();
        	    //obj3.setflight_Date(flight_Date);
        	    
        	    //System.out.println("How many seats you want to book (Enter number): ");
        	    //book_seat=Obj1.nextInt();
        	    book_seat=1;
        	    obj3.setbook_seat(book_seat);
        	    
        	    //Obj1 = new Scanner(System.in); 
        	    //System.out.println("Enter your Passport Number : ");
        	   // pass = Obj1.nextLine(); 
        	    
        	    obj3.setPassport(passport);
        	    
        	    Obj1 = new Scanner(System.in); 
        	    System.out.println("Enter your Valid CNIC Number : ");
        	    CNIC=Obj1.nextLine();
        	    obj3.setCNIC(CNIC);
        	    
        	    int ticket_choice=0;
        	    //total_fare=total_fare*book_seat;
        	    System.out.println("Dear customer you want to book "+type_of_Plane+" ");
        	    System.out.println("Your Fare is "+ total_fare);
        	    System.out.println("Do you want to buy this ticket? ");
        	    System.out.println("Enter 1 to buy this ticket! ");
        	    System.out.println("Enter 2 to cancel this ticket! ");
        	    Obj1 = new Scanner(System.in); 
        	    ticket_choice=Obj1.nextInt();
        	    int ticket_random=0;
        	    int seat_random=0;
        	    int amount=0;
        	    Random rand_num = new Random();
        	     if(ticket_choice==1)
        	     {
        	    	 System.out.println("Enter Your Flight Fare -> "+ total_fare+" Thorugh your consol! ");
        	    	 Obj1 = new Scanner(System.in); 
             	    amount=Obj1.nextInt();
             	    if (amount==total_fare)
             	    {
             	    	
        	         // Generate random integers 
        	         ticket_random = rand_num.nextInt(10000);
        	         seat_random = rand_num.nextInt(200);
        	         System.out.println("Congratulations Your Ticket and generated successfully! ");
        	         System.out.println("Your ticket number is "+ticket_random+" ");
        	         System.out.println("Your seat number is "+seat_random+" ");
        	         
        	        } 
             	    
             	    else 
             	    {
             	    	System.out.println("You enter wrong amount!");
             	    	System.out.println("so system exit! ");
             	    	System.exit(0);
             	    }
             	    
        	     }
        	     
        	     if(ticket_choice==2)
        	     {
        	    	 System.out.println("You cancel the transection! ");
        	    	 System.out.println("System exit!");
        	    	 System.exit(0);
        	     }
        	     
        	    //
        	    FileWriter fw = null; 
         	   BufferedWriter bw = null;
         	   PrintWriter pw = null;
                
         	   try { 
         		   fw = new FileWriter(Fname2, true); 
         		   bw = new BufferedWriter(fw);
         		   pw = new PrintWriter(bw); 
         		   pw.println(Name+" "+Gender+" "+address+" "+passport+" "+ type_of_Plane +" "+destination+" "+Origin+" "+book_seat+" "+flight_Date+" "+CNIC+" "+total_fare+" "+ticket_random+" "+seat_random+" "); 
         		  // pw.println("Root");
         		  // pw.println("Ben");
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
         	   
         	   //
        	    
        	    
        	    
           }
        	 
        	 else
        	 {
        		 System.out.println("You do not want to book a flight so system quit!");	 
        	 }
        	 
        }  
           
          /*
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

        		*/
           
           
           
           public static void Read_File(String Fname3)
           {
        	   try {
        		      File myObj = new File(Fname3);
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
