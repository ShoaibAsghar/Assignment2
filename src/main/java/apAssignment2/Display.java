package apAssignment2;
import java.io.File; 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import java.io.BufferedWriter; 
import java.io.FileWriter; 
import java.io.PrintWriter;
import java.lang.invoke.SwitchPoint;
import java.util.Random;

public class Display extends Flight 
{
	   private static int availabl_seat;
	   private static int seat_number;	
	     
	   public Display()
	   {
		   availabl_seat=60;
		   seat_number=0;
		   
	   }
           public static void Create_File(String Fname) 
           {
        	 
        	 try {
        	      File myObj = new File(Fname);
        	      if (myObj.createNewFile()) 
        	      {
        	        System.out.println("File created: " + myObj.getName());
        	      } 
        	      else 
        	      {
        	        System.out.println("File already exists.");
        	      }
        	    } 
        	    
        	    catch (IOException e) 
        	     {
        	      System.out.println("An error occurred.");
        	      e.printStackTrace();
        	     }
        	  
           }
           
           public  static void Input(String Fname2)
           {
        	   String Name;
        	   String Gender;
        	   String passport;
        	   String address;
        	   int Age=0;
        	   String destination;
        	   String type_of_Plane=" ";
        	   int Total_seat=60;
        	   int Dirrect_ch=0;
        	 
        	     String Origin;
        		 String Destination;
        		 String flight_Date=" ";
        		 int book_seat;
        		 String CNIC;
        		 String pass;
        	   
        	   Random rand_num = new Random();	 
        	   Passenger obj2=new Passenger();
        	   Flight obj3=new Flight();
        	   int choice;
        	   int ticket_random=0;  
       	       int amount=0;
        try 
        	{
        	 System.out.println("--------------------------------------------------");
        	 System.out.println("|                                                |");
        	 System.out.println("|       Welcome To Flight Reservation system     |");  
        	 System.out.println("|                                                |");
        	 System.out.println("|         Customer Registration:                 |");
        	 System.out.println("|                                                |");
        	 System.out.println("|        Are you want to book a flight!          |");
        	 System.out.println("|                                                |");
        	 System.out.println("|       Enter 1 for yes and 0 for No!            |");
        	 System.out.println("|                                                |");
        	 System.out.println("|------------------------------------------------|");
        	 
        	 Scanner Obj1 = new Scanner(System.in); 
        	 choice=Obj1.nextInt();
        	 if(choice<0 || choice>1)
        	 {
        		 throw new Exception();
        	 }
        	 
        	 if(choice==1)
        	 {
        		 Obj1 = new Scanner(System.in);  		 
        	     System.out.println("Enter your Name : ");
        	    Name = Obj1.nextLine(); 
        	    obj2.setname(Name);
        	    
        	    Obj1 = new Scanner(System.in);  		 
       	        System.out.println("Enter your Age : ");
       	        Age = Obj1.nextInt(); 
        	    int fare=15000;
        	    int total_fare=0;
        	    int another_record=0;
        	    System.out.println(" ");
        	   
        	    Obj1 = new Scanner(System.in); 
        	    System.out.println("Enter your Gender(Male or Female) : ");
        	    
        	    Gender = Obj1.nextLine(); 
        	    obj2.setgender(Gender); 
        	    int choice2;
        	    Obj1 = new Scanner(System.in); 
        	    System.out.println("Enter your Address : ");
        	    address = Obj1.nextLine(); 
        	    obj2.setAddress(address);
        	    System.out.println("Enter your Passport Number : ");
        	    passport = Obj1.nextLine(); 
        	    obj2.setPassport(passport);
        	    
        	try
        	  {
        		System.out.println("|-------------------------------------------------|");
        		System.out.println("|                                                 |");
        	    System.out.println("|    Enter Type of plane (Enter your choice) :    |");
        	    System.out.println("|                                                 |");
        	    System.out.println("|            Enter 1 for Business class!          |");
        	    System.out.println("|                                                 |");
        	    System.out.println("|            Enter 2 for Economy class!           |");
        	    System.out.println("|                                                 |");
        	    System.out.println("|            Enter 3 for First class!             |");
        	    System.out.println("|-------------------------------------------------|");
        	    choice2=Obj1.nextInt();
        	    
        	    if(choice2<=0 || choice2>3)
           	     {
           		   throw new Exception();
           	     }
        	    
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
        	 } 
        	
      catch (Exception e) 
        	{
    	      
    	      System.out.println("|-------------------------------------------------|");
    	      System.out.println("|-------------You entered wrong choice!-----------|");
    	      System.out.println("|------------Please entered correct choice--------|");
    	      System.out.println("|-------------------------------------------------|");
    	      System.out.println("|-------Enter Type of plane (Enter your choice) : |");
      	      System.out.println("|-------Enter 1 for Business class!---------------|");
      	      System.out.println("|-------Enter 2 for Economy class!----------------|");
      	      System.out.println("|-------Enter 3 for First class! -----------------|");
      	      System.out.println("|-------------------------------------------------|"); 
      	      Obj1 = new Scanner(System.in);  
      	      choice2=Obj1.nextInt();
      	      while(choice2<=0  || choice2>3)
      	      {
      	    	 System.out.println("|-------------------------------------------------|");
       	         System.out.println("|-------------You entered wrong choice!-----------|");
       	         System.out.println("|------------Please entered correct choice--------|");
       	         System.out.println("|-------------------------------------------------|");
       	         System.out.println("|-------Enter Type of plane (Enter your choice) : |");
         	     System.out.println("|-------Enter 1 for Business class!---------------|");
         	     System.out.println("|-------Enter 2 for Economy class!----------------|");
         	     System.out.println("|-------Enter 3 for First class! -----------------|");
         	     System.out.println("|-------------------------------------------------|"); 
         	      Obj1 = new Scanner(System.in);   
         	      choice2=Obj1.nextInt();	  
      	      }
      	      //
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
      	      
    	      //
			}
        	    String [] flight_Array=new String [7]; 
        	    flight_Array[0]="Pk701 Islamabad to Lahore! ";
        	    flight_Array[1]="Pk702 Islamabad to Karachi! ";
        	    flight_Array[2]="Pk703 Islamabad to Multan! ";
        	    flight_Array[3]="Pk704 Lahore to Islamabad! ";
        	    flight_Array[4]="Pk705 Lahore to Karachi! ";
        	    flight_Array[5]="Pk706 Lahore to Peshawar! ";
        	    flight_Array[6]="Pk707 Lahore to London! ";
        	   
        	    //
        	    String [] flight_time_Array=new String [7];
        	    flight_time_Array[0]=" 10:00AM ";
        	    flight_time_Array[1]=" 12:00PM ";
        	    flight_time_Array[2]=" 01:30PM ";
        	    flight_time_Array[3]=" 02:30PM ";
        	    flight_time_Array[4]=" 05:00PM ";
        	    flight_time_Array[5]=" 08:30PM ";
        	    flight_time_Array[6]=" 10:30PM ";
        	    
        	    //
        	    int [] flight_Fare_Array=new int [7];
        	    flight_Fare_Array[0]=15000;
        	    flight_Fare_Array[1]=25000;
        	    flight_Fare_Array[2]=30000;
        	    flight_Fare_Array[3]=20000;	
        	    flight_Fare_Array[4]=22000;
        	    flight_Fare_Array[5]=35000;
        	    flight_Fare_Array[6]=50000;
        	    //
        	    int [] flight_Avail_seat_Array=new int [7];
        	    flight_Avail_seat_Array[0]=60;
        	    flight_Avail_seat_Array[1]=60;
        	    flight_Avail_seat_Array[2]=60;
        	    flight_Avail_seat_Array[3]=60;	
        	    flight_Avail_seat_Array[4]=60;
        	    flight_Avail_seat_Array[5]=60;
        	    flight_Avail_seat_Array[6]=60;
        	    
        	    //
        	    String [] Indirectflight_Array=new String [7]; 
        	    Indirectflight_Array[0]="Pk901 Islamabad to ->Lahore then ->Multan! ";
        	    Indirectflight_Array[1]="Pk902 Islamabad to ->Karachi then ->Dubai! ";
        	    Indirectflight_Array[2]="Pk903 Islamabad to ->Peshawar then -> Queta! ";
        	    Indirectflight_Array[3]="Pk904 Lahore to ->Islamabad then ->Queta! ";
        	    Indirectflight_Array[4]="Pk905 Lahore to ->Karachi then ->Sukkur! ";
        	    Indirectflight_Array[5]="Pk906 Lahore to ->Islamabad then->Peshawar! ";
        	    Indirectflight_Array[6]="Pk907 Lahore to -> Qatar then ->London! ";
        	    
        	    //
        	    setflight_schedule(flight_Array); 
        	    
        	    System.out.println("Please Enter correct Flight information! ");
        	    System.out.println("You can choose Direct or Indirect Flight as your wish! ");
        	    System.out.println("Enter 1 for Direct Flight! ");
        	    System.out.println("Enter 2 for Indirect flight! ");
        	    //Dirrect_ch
        	    Obj1 = new Scanner(System.in); 
        	    Dirrect_ch=Obj1.nextInt();
        	    if(Dirrect_ch==1)
        	    {
        	    	System.out.println(" These are the Available Direct Flights! ");
            	    for(int i=0; i<7; i++)
            	    {
            	    	System.out.println(flight_Array[i]+ " has fare "+ flight_Fare_Array[i] + " Departure time "+ flight_time_Array[i]+ " has availabe seat " + flight_Avail_seat_Array[i]);	
            	    }	
        	    	
            	    
        	    }
        	    
        	    if(Dirrect_ch==2)
        	    {
        	    	System.out.println(" These are the Available Indirect Flights! ");
            	    for(int i=0; i<7; i++)
            	    {
            	    	System.out.println(Indirectflight_Array[i] + " has fare "+ flight_Fare_Array[i] + " Departure time "+ flight_time_Array[i]+ " has availabe seat " + flight_Avail_seat_Array[i]);	
            	    }	
        	    	
            	    
        	    }
        	    
        	    
        	    
        	    
        	    System.out.println(" "); 
        	    System.out.println("Enter your Origin(Departure city) Name : ");
        	    Obj1 = new Scanner(System.in); 
        	    Origin=Obj1.nextLine();
        	    obj3.setorigin(Origin);
        	    
        	    Obj1 = new Scanner(System.in); 
        	    System.out.println("Enter your Destination (Arrival city)name! ");
        	    destination=Obj1.nextLine();
        	    obj2.setDestination(destination);

        	    Obj1 = new Scanner(System.in); 
        	    obj3.setDestination(destination);
        	    
        	    
        	    
        	    int choice_date=0;
        	    String [] flight_Date_Array=new String [7]; 
        	    flight_Date_Array[0]="24/10/2021";
        	    flight_Date_Array[1]="25/10/2021";
        	    flight_Date_Array[2]="26/10/2021";
        	    flight_Date_Array[3]="27/10/2021";
        	    flight_Date_Array[4]="28/10/2021";
        	    flight_Date_Array[5]="29/10/2021"; 
        	    flight_Date_Array[6]="30/10/2021";
        	    
        	    setflight_Date(flight_Date_Array); 
        	   
           try 
        	  {
        	    System.out.println("|-------------------------------------------------------------------------------|");
        	    System.out.println("|-----Please choose correct Date From Available Date!---------------------------|");
        	    System.out.println("| Enter 1 to choose this-> Date "+flight_Date_Array[0]+ " has departure time " + flight_time_Array[0]);
        	    System.out.println("| Enter 2 to choose this-> Date "+flight_Date_Array[1]+ " has departure time " + flight_time_Array[1]);
        	    System.out.println("| Enter 3 to choose this-> Date "+flight_Date_Array[2]+ " has departure time " + flight_time_Array[2]);
        	    System.out.println("| Enter 4 to choose this-> Date "+flight_Date_Array[3]+ " has departure time " + flight_time_Array[3]);
        	    System.out.println("| Enter 5 to choose this-> Date "+flight_Date_Array[4]+ " has departure time " + flight_time_Array[4]);
        	    System.out.println("| Enter 6 to choose this-> Date "+flight_Date_Array[5]+ " has departure time " + flight_time_Array[5]);
        	    System.out.println("| Enter 7 to choose this-> Date "+flight_Date_Array[6]+ " has departure time " + flight_time_Array[6]);
        	    System.out.println("|--------------------------------------------------------------------------------|");
        	    System.out.println("|--------------------------------------------------------------------------------|");
        	    Obj1 = new Scanner(System.in); 
        	    choice_date=Obj1.nextInt();
        	    
        	    if(choice_date<=0 || choice_date>7)
          	     {
          		   throw new Exception();
          	     }
        	    
        	    switch (choice_date) 
        	    {
        	    
        	    case 1:
        	    	flight_Date=flight_Date_Array[0];
            	   //obj3.setflight_Date(flight_Date);
        	      break;
        	      
        	    case 2:
        	    	flight_Date=flight_Date_Array[1];
            	   //obj3.setflight_Date(flight_Date);	
        	      break;
        	      
        	    case 3:
        	    	flight_Date=flight_Date_Array[2];
            	   //obj3.setflight_Date(flight_Date); 	
        	       
        	      break;
        	      
        	    case 4:
        	    	flight_Date=flight_Date_Array[3];
            	  //obj3.setflight_Date(flight_Date);	
        	       
        	      break;
        	      
        	    case 5:
        	    	flight_Date=flight_Date_Array[4];
            	   //obj3.setflight_Date(flight_Date);	
        	      
        	      break;
        	      
        	    case 6:
        	    
        	      flight_Date=flight_Date_Array[5];
          	    //obj3.setflight_Date(flight_Date);
        	      break;
        	      
        	    case 7:
        	    
        	      flight_Date=flight_Date_Array[6];
          	    //obj3.setflight_Date(flight_Date);
        	      break;
        	  }
        	    
       }	
           //above is the try block end
       catch (Exception e) 
           {
    	   System.out.println("|--------------------------------------------------------------------------------------|");
    	   System.out.println("|-----------------------------You entered wrong choice !-------------------------------|");
    	   System.out.println("|-----------------------------Please entered correct choice!---------------------------|");
    	   System.out.println("|--------------------------------------------------------------------------------------|");
    	   System.out.println("|-------------------------------------------------------------------------------|");
   	       System.out.println("|-----Please choose correct Date From Available Date!---------------------------|");
   	       System.out.println("| Enter 1 to choose this-> Date "+flight_Date_Array[0]+ " has departure time " + flight_time_Array[0]);
   	       System.out.println("| Enter 2 to choose this-> Date "+flight_Date_Array[1]+ " has departure time " + flight_time_Array[1]);
   	       System.out.println("| Enter 3 to choose this-> Date "+flight_Date_Array[2]+ " has departure time " + flight_time_Array[2]);
   	       System.out.println("| Enter 4 to choose this-> Date "+flight_Date_Array[3]+ " has departure time " + flight_time_Array[3]);
   	       System.out.println("| Enter 5 to choose this-> Date "+flight_Date_Array[4]+ " has departure time " + flight_time_Array[4]);
   	       System.out.println("| Enter 6 to choose this-> Date "+flight_Date_Array[5]+ " has departure time " + flight_time_Array[5]);
   	       System.out.println("| Enter 7 to choose this-> Date "+flight_Date_Array[6]+ " has departure time " + flight_time_Array[6]);
   	       System.out.println("|--------------------------------------------------------------------------------|");
   	       System.out.println("|--------------------------------------------------------------------------------|");
    	   
    	   
   	       Obj1 = new Scanner(System.in); 
   	       choice_date=Obj1.nextInt();
   	       while(choice_date>7 || choice_date<=0)
   	       {
   	    	 
   	    	   System.out.println("|--------------------------------------------------------------------------------------|");
      	       System.out.println("|-----------------------------You entered wrong choice !-------------------------------|");
      	       System.out.println("|-----------------------------Please entered correct choice!---------------------------|");
      	       System.out.println("|--------------------------------------------------------------------------------------|");
      	       System.out.println("|-------------------------------------------------------------------------------|");
     	       System.out.println("|-----Please choose correct Date From Available Date!---------------------------|");
     	       System.out.println("| Enter 1 to choose this-> Date "+flight_Date_Array[0]+ " has departure time " + flight_time_Array[0]);
     	       System.out.println("| Enter 2 to choose this-> Date "+flight_Date_Array[1]+ " has departure time " + flight_time_Array[1]);
     	       System.out.println("| Enter 3 to choose this-> Date "+flight_Date_Array[2]+ " has departure time " + flight_time_Array[2]);
     	       System.out.println("| Enter 4 to choose this-> Date "+flight_Date_Array[3]+ " has departure time " + flight_time_Array[3]);
     	       System.out.println("| Enter 5 to choose this-> Date "+flight_Date_Array[4]+ " has departure time " + flight_time_Array[4]);
     	       System.out.println("| Enter 6 to choose this-> Date "+flight_Date_Array[5]+ " has departure time " + flight_time_Array[5]);
     	       System.out.println("| Enter 7 to choose this-> Date "+flight_Date_Array[6]+ " has departure time " + flight_time_Array[6]);
     	       System.out.println("|--------------------------------------------------------------------------------|");
     	       System.out.println("|--------------------------------------------------------------------------------|");   
   	    	   
   	    	 
     	       Obj1 = new Scanner(System.in); 
     	       choice_date=Obj1.nextInt();  
   	       }
    	   
   	        switch (choice_date) 
	        {
	    
	        case 1:
	    	flight_Date=flight_Date_Array[0];
    	   //obj3.setflight_Date(flight_Date);
	         break;
	      
	        case 2:
	    	flight_Date=flight_Date_Array[1];
    	   //obj3.setflight_Date(flight_Date);	
	         break;
	      
	        case 3:
	    	flight_Date=flight_Date_Array[2];
    	   //obj3.setflight_Date(flight_Date); 	
	       
	         break;
	      
	        case 4:
	    	flight_Date=flight_Date_Array[3];
    	  //obj3.setflight_Date(flight_Date);	
	       
	         break;
	      
	        case 5:
	    	flight_Date=flight_Date_Array[4];
    	   //obj3.setflight_Date(flight_Date);	
	      
	        break;
	      
	      case 6:
	    
	      flight_Date=flight_Date_Array[5];
  	    //obj3.setflight_Date(flight_Date);
	        break;
	      
	      case 7:
	    
	      flight_Date=flight_Date_Array[6];
  	    //obj3.setflight_Date(flight_Date);
	        break;
	  }
   	       
   	       
	       }
           //above is catch block end
        	    book_seat=1;
        	    obj3.setbook_seat(book_seat);
        	    
        	    
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
        	 try   
        	 {
        		System.out.println("|------------------------------------------------------------------|");    
        	    System.out.println("|---------------Enter 1 to buy this ticket! -----------------------|");
        	    System.out.println("|---------------Enter 2 to cancel this ticket! --------------------|");
        	    System.out.println("|------------------------------------------------------------------|"); 
        	    Obj1 = new Scanner(System.in); 
        	    ticket_choice=Obj1.nextInt();
        	    
        	    if(ticket_choice<=0 || ticket_choice>2)
         	     {
         		   throw new Exception();
         	     }
        	    
        	  
        	     if(ticket_choice==1)
        	     {
        	    	 System.out.println("|------------------------------------------------------------------|"); 
        	    	 System.out.println("|--Enter Your Flight Fare -> "+ total_fare+" Thorugh your consol! -|");
        	    	 System.out.println("|------------------------------------------------------------------|"); 
        	    	 Obj1 = new Scanner(System.in); 
             	    amount=Obj1.nextInt();
             	    if (amount==total_fare)
             	    {
             	    	
        	         // Generate random integers 
        	         ticket_random = rand_num.nextInt(10000);
        	         seat_number=seat_number+1;
        	         System.out.println("|------------------------------------------------------------------|"); 
        	         System.out.println("|-----Congratulations Your Ticket and generated successfully! -----|");
        	         System.out.println("|------------------------------------------------------------------|"); 
        	         System.out.println("|-----  Your ticket number is "+ticket_random+"--------------------|");
        	         System.out.println("|-------Your seat number is "+seat_number+"------------------------|");
        	         System.out.println("|------------------------------------------------------------------|"); 
        	       
              	      availabl_seat=availabl_seat - 1;
              	      
              	    Obj1 = new Scanner(System.in); 
        	        int ch=0;
        	        int change_ch=0;
        	        
        	        int new_customer=0;
        	        System.out.println("|------------------------------------------------------------------|"); 
              	    System.out.println("|---------Dear Customer do you want to change your information!----|");
              	    System.out.println("|---------Enter 1 for Yes and 0 for No !---------------------------|");
              	    System.out.println("|------------------------------------------------------------------|"); 
              	    ch=Obj1.nextInt();
              	    if(ch==1)
              	    {    
              	    //below is try block 
              	    	try 
              	    	{
              	         
              	    	 System.out.println("|------------------------------------------------------------------|"); 	
              	    	 System.out.println("|-----------Enter 2 to change your Destination! -------------------|");
                  	     System.out.println("|-----------Enter 3 to change your Origin(Departure)! -------------|");	
                  	     System.out.println("|-----------Enter 4 to cancel your ticket ! -----------------------|");
                  	     System.out.println("|------------------------------------------------------------------|"); 
                  	     
                  	     Obj1 = new Scanner(System.in);
                  	     change_ch=Obj1.nextInt();
                  	     
                  	   if(change_ch<=1 || change_ch>4)
               	         {
               		       throw new Exception();
               	         }
                  	   
                  	     if(change_ch==2)
                  	     {
                  	    	Obj1 = new Scanner(System.in); 
                  	    	System.out.println("|------------------------------------------------------------------|"); 
                    	    System.out.println("|----------Enter your Destination (Arrival city)name! -------------|");
                    	    System.out.println("|------------------------------------------------------------------|"); 
                    	    destination=Obj1.nextLine();
                    	    obj2.setDestination(destination);

                    	    Obj1 = new Scanner(System.in); 
                    	    obj3.setDestination(destination);
                    	     
                  	     }
                  	     
                  	     if (change_ch==3)
                  	     {
                  	    	System.out.println("|------------------------------------------------------------------|"); 
                    	    System.out.println("|------------Enter your Origin(Departure city) Name : -------------|");
                    	    System.out.println("|------------------------------------------------------------------|"); 
                    	    Obj1 = new Scanner(System.in); 
                    	    Origin=Obj1.nextLine();
                    	    obj3.setorigin(Origin);	 
                  	    	 
                  	     }
                  	     
                  	     if(change_ch==4)
                  	     {
                  	    	System.out.println("|------------------------------------------------------------------|");  
                  	    	System.out.println("|--------------You want to cancel your Ticket! --------------------|");
                  	    	System.out.println("|--------------For New customer! ----------------------------------|");
                  	    	System.out.println("|--------------Do you want to Buy a ticket ?!----------------------|");
                  	    	System.out.println("|--------------Enter 1 for Yes and 0 for exit from the system !----|");
                  	    	System.out.println("|------------------------------------------------------------------|"); 
                  	    	
                  	    	 Obj1 = new Scanner(System.in);
                  	    	 new_customer=Obj1.nextInt(); 
                  	    	 if(new_customer==1)
                  	    	 {
                  	    		Input(Fname2);	 
                  	    	 }
                  	    	 
                  	    	if(new_customer==0)
                 	    	 {
                  	    		System.out.println("|------------------------------------------------------------------|"); 
                  	    		System.out.println("|------------You want to exit !------------------------------------|");
                     	    	System.out.println("|------------so system exit! --------------------------------------|");
                     	    	System.out.println("|------------------------------------------------------------------|"); 
                     	    	System.exit(0);
                     	    	
                 	    	 }
                  	    	 
                  	    	 
                  	    	
                  	     }
                  	     //case 4 end here
              	}	
              	    	//above is try block end
             catch (Exception e) 
              	    	//START catch
              	    	{
            	             System.out.println("|------------------------------------------------------------------|"); 
            	             System.out.println("|-------------You enter wrong choice!------------------------------|");	
                             System.out.println("|-------------please enter correct choice--------------------------|");             	   
                    	     System.out.println("|------------------------------------------------------------------|"); 	
                	    	 System.out.println("|-----------Enter 2 to change your Destination! -------------------|");
                    	     System.out.println("|-----------Enter 3 to change your Origin(Departure)! -------------|");	
                    	     System.out.println("|-----------Enter 4 to cancel your ticket ! -----------------------|");
                    	     System.out.println("|------------------------------------------------------------------|"); 
                    	     
                    	   Obj1 = new Scanner(System.in);
                    	   change_ch=Obj1.nextInt();
                    	   while(change_ch>4 || change_ch<=1)
                    	   {
                    		 System.out.println("|------------------------------------------------------------------|"); 
              	             System.out.println("|-------------You enter wrong choice!------------------------------|");	
                             System.out.println("|-------------please enter correct choice--------------------------|");             	   
                      	     System.out.println("|------------------------------------------------------------------|"); 	
                  	    	 System.out.println("|-----------Enter 2 to change your Destination! -------------------|");
                      	     System.out.println("|-----------Enter 3 to change your Origin(Departure)! -------------|");	
                      	     System.out.println("|-----------Enter 4 to cancel your ticket ! -----------------------|");
                      	     System.out.println("|------------------------------------------------------------------|"); 
                        	     
                        	   Obj1 = new Scanner(System.in);
                        	   change_ch=Obj1.nextInt();  
                    		   
                    	   }
                    	     //while end here
                    	   
                    	     if(change_ch==2)
                    	     {
                    	    
                    	    Obj1 = new Scanner(System.in); 
                    	    System.out.println("|------------------------------------------------------------------|"); 
                      	    System.out.println("|----------Enter your Destination (Arrival city)name! -------------|");
                      	    System.out.println("|------------------------------------------------------------------|"); 
                      	    destination=Obj1.nextLine();
                      	    obj2.setDestination(destination);

                      	    Obj1 = new Scanner(System.in); 
                      	    obj3.setDestination(destination);
                      	     
                    	     }
                    	     
                    	     if (change_ch==3)
                    	     {
                    	    System.out.println("|------------------------------------------------------------------|"); 
                      	    System.out.println("|-------------Enter your Origin(Departure city) Name : ------------|");
                      	    System.out.println("|------------------------------------------------------------------|"); 
                      	    Obj1 = new Scanner(System.in); 
                      	    Origin=Obj1.nextLine();
                      	    obj3.setorigin(Origin);	 
                    	    	 
                    	     }
                    	     
                    	     if(change_ch==4)
                    	     {
                    	    	
                    	    	
                    	    	System.out.println("|------------------------------------------------------------------|");  
                      	    	System.out.println("|--------------You want to cancel your Ticket! --------------------|");
                      	    	System.out.println("|--------------For New customer! ----------------------------------|");
                      	    	System.out.println("|--------------Do you want to Buy a ticket ?!----------------------|");
                      	    	System.out.println("|--------------Enter 1 for Yes and 0 for exit from the system !----|");
                      	    	System.out.println("|------------------------------------------------------------------|"); 
                      	    	
                    	    	 Obj1 = new Scanner(System.in);
                    	    	 new_customer=Obj1.nextInt(); 
                    	    	 if(new_customer==1)
                    	    	 {
                    	    		Input(Fname2);	 
                    	    	 }
                    	    	 
                    	    if(new_customer==0)
                   	    	 {
                    	    	System.out.println("|------------------------------------------------------------------|"); 
                  	    		System.out.println("|------------You want to exit !------------------------------------|");
                     	    	System.out.println("|------------so system exit! --------------------------------------|");
                     	    	System.out.println("|------------------------------------------------------------------|"); 
                     	    	
                       	    	    System.exit(0);
                       	    	
                   	    	 }
                    	    	 
                    	    	 
                    	    	
                    	     }
                    	     //case 4 end here
                    	   
            	        //case 4 end here
						}
              	    	
              	    	//catch block end
              	    }
              	   
              	    
              	      
        	        } 
             	    
             	    else 
             	    {   
             	    	System.out.println("|------------------------------------------------------------------|"); 
             	    	System.out.println("|------------You enter wrong amount!-------------------------------|");
             	    	System.out.println("|------------so system exit! --------------------------------------|");
             	    	System.out.println("|------------------------------------------------------------------|"); 
             	    	//System.exit(0);
             	    }
             	    
        	     }
        	     
        	     if(ticket_choice==2)
        	     {
        	    	System.out.println("|------------------------------------------------------------------|"); 
       	    		System.out.println("|------------You cancel the transection!---------------------------|");
          	    	System.out.println("|------------so system exit! --------------------------------------|");
          	    	System.out.println("|------------------------------------------------------------------|"); 
          	    	
        	    	 System.exit(0);
        	     }
        }
        	 //above is end of try block
        catch (Exception e) 
        {
            
        System.out.println("|---------------You enter wrong choice!----------------------------|");	
        System.out.println("|---------------please enter correct choice------------------------|");  
  	    System.out.println("|------------------------------------------------------------------|");    
	    System.out.println("|---------------Enter 1 to buy this ticket! -----------------------|");
	    System.out.println("|---------------Enter 2 to cancel this ticket! --------------------|");
	    System.out.println("|------------------------------------------------------------------|"); 
	    
  	      Obj1 = new Scanner(System.in); 
  	      ticket_choice=Obj1.nextInt();
          while(ticket_choice>2 || ticket_choice<=0)
          {
        	System.out.println("|---------------You enter wrong choice!----------------------------|");	
            System.out.println("|---------------please enter correct choice------------------------|");  
        	System.out.println("|------------------------------------------------------------------|");    
      	    System.out.println("|---------------Enter 1 to buy this ticket! -----------------------|");
      	    System.out.println("|---------------Enter 2 to cancel this ticket! --------------------|");
      	    System.out.println("|------------------------------------------------------------------|"); 
      	    
      	      Obj1 = new Scanner(System.in); 
      	      ticket_choice=Obj1.nextInt();  
          }
            //above is end of while block
          if(ticket_choice==1)
 	     {
        	 System.out.println("|------------------------------------------------------------------|"); 
 	    	 System.out.println("|--Enter Your Flight Fare -> "+ total_fare+" Thorugh your consol! -|");
 	    	 System.out.println("|------------------------------------------------------------------|"); 
 	    	 
 	    	 
 	    	 Obj1 = new Scanner(System.in); 
      	    amount=Obj1.nextInt();
      	    if (amount==total_fare)
      	    {
      	    	
 	         // Generate random integers 
 	         ticket_random = rand_num.nextInt(10000);
 	         seat_number=seat_number+1;
 	        System.out.println("|------------------------------------------------------------------|"); 
	         System.out.println("|-----Congratulations Your Ticket and generated successfully! -----|");
	         System.out.println("|------------------------------------------------------------------|"); 
	         System.out.println("|-----  Your ticket number is "+ticket_random+"--------------------|");
	         System.out.println("|-------Your seat number is "+seat_number+"------------------------|");
	         System.out.println("|------------------------------------------------------------------|"); 
	         
       	      availabl_seat=availabl_seat - 1;
      	    }
 	     }  
       	     
          
		}	 
        	    //above is end of catch block
        	   BufferedWriter bw = null;
       	       PrintWriter pw = null;
        	   FileWriter fw = null; 
         	   
                
         	   try { 
         		   fw = new FileWriter(Fname2, true); 
         		   bw = new BufferedWriter(fw);
         		   pw = new PrintWriter(bw); 
         		   pw.println(Name+" "+Age+" "+Gender+" "+address+" "+passport+" "+ type_of_Plane +" "+destination+" "+Origin+" "+seat_number+" "+flight_Date+" "+CNIC+" "+total_fare+" "+ticket_random+" "+Total_seat+" "+availabl_seat+" "); 
         		   
         		   System.out.println("|------------------------------------------------------------------|"); 
         		   System.out.println("|-------------Data Successfully saved into file!-------------------|");
         		   System.out.println("|------------------------------------------------------------------|"); 
         		   pw.flush(); 
         		   
         	   }
         	   
         	   catch (IOException io) 
     		   {
     			   
     		   }
         	   
         	   finally 
         	   {
         		   try 
         		   {
         			   bw.close();
        			   fw.close(); 
         			   pw.close();
         			   
         			   }
         		   
         		   catch (IOException io) 
         		   {
         			   
         		   }
         		   
         		   
         	   }
         	   
         	   
        	 try 
        	    {   
        	  System.out.println("|------------------------------------------------------------------|"); 	 
         	  System.out.println("|------------Do you want to book another seat! --------------------|");
         	  System.out.println("|------------Enter 1 to book for another seat! --------------------|");
         	  System.out.println("|------------Enter 2 to Quit this program! ------------------------|");
         	  System.out.println("|------------------------------------------------------------------|"); 
         	 
         	 Obj1 = new Scanner(System.in); 
         	 another_record=Obj1.nextInt();
         	 
         	 if(another_record<=0 || another_record>2)
   	         {
   		       throw new Exception();
   	         }
         	 
         	 if (another_record==1)
         	 {
         		Input(Fname2);
         	 }
         	 
         	if (another_record==2)
        	 {
         		System.out.println("|------------------------------------------------------------------|"); 
         		System.out.println("|-------You do not want to book a flight so system quit!-----------|");
         		System.out.println("|------------------------------------------------------------------|"); 
         		//System.exit(0);
        	 }
        	   }	 
        	 
        	 catch (Exception e) 
        	 {
        		 System.out.println("|------------------------------------------------------------------|"); 
        		 System.out.println("|---------------You entered wrong choice! -------------------------|");
   		         System.out.println("|---------------Please enter correct choice!-----------------------|");
   		         System.out.println("|------------Do you want to book another seat! --------------------|");
         	     System.out.println("|------------Enter 1 to book for another seat! --------------------|");
         	     System.out.println("|------------Enter 2 to Quit this program! ------------------------|");
         	     System.out.println("|------------------------------------------------------------------|"); 
         	     
   		         
         	 
         	    Obj1 = new Scanner(System.in); 
         	    another_record=Obj1.nextInt();
				while(another_record<=0 || another_record>2)
				{
					 System.out.println("|------------------------------------------------------------------|"); 
	        		 System.out.println("|---------------You entered wrong choice! -------------------------|");
	   		         System.out.println("|---------------Please enter correct choice!-----------------------|");
	   		         System.out.println("|------------Do you want to book another seat! --------------------|");
	         	     System.out.println("|------------Enter 1 to book for another seat! --------------------|");
	         	     System.out.println("|------------Enter 2 to Quit this program! ------------------------|");
	         	     System.out.println("|------------------------------------------------------------------|"); 
	         	     
					 
	         	     Obj1 = new Scanner(System.in); 
	         	     another_record=Obj1.nextInt();
				}
         	     //above is end block of while
				
				if (another_record==1)
	         	 {
	         		Input(Fname2);
	         	 }
	         	 
	         	if (another_record==2)
	        	 {
	         		System.out.println("|------------------------------------------------------------------|"); 
	         		System.out.println("|-------You do not want to book a flight so system quit!-----------|");
	         		System.out.println("|------------------------------------------------------------------|"); 
	         		
	         		
	         		//System.exit(0);
	        	 }
				
			 }
         	 //above is end of catch block
         	 
           }
        	 
        	 else
        	 {
        		 	
        		 System.out.println("|------------------------------------------------------------------|"); 
          		 System.out.println("|-------You do not want to book a flight so system quit!-----------|");
          		 System.out.println("|------------------------------------------------------------------|"); 
        		// System.exit(0);
        	 }
       }    	 
         //above is for try block 	 
        
       catch (Exception a) 
 	         {
    	         System.out.println("|------------------------------------------------------------------|"); 
  		         System.out.println("|---------------You entered wrong choice! -------------------------|");
		         System.out.println("|---------------Please enter correct choice!-----------------------|");
		      
 		       Input( Fname2);
 		      
 		      }
        	  
        }  
           
        
           public static void Read_File(String Fname3)
           {
        	   try {
        		      File myObj = new File(Fname3);
        		      Scanner obj_reader = new Scanner(myObj);
        		      while (obj_reader.hasNextLine()) 
        		      {
        		        String Line_data = obj_reader.nextLine();
        		        System.out.println(Line_data);
        		      }
        		      
        		      obj_reader.close(); 
        		    } 
        	   
        	         catch (FileNotFoundException e) 
        	         {
        		      System.out.println("Error occur while creating file!");
        		      e.printStackTrace();
        		    }
           }
           
           
           
           
           
        	   
           }
           