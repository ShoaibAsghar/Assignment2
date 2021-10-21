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
        	 System.out.println("Welcome To Flight Reservation system ");
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
        	   
        	 System.out.println("Customer Registration: ");
        		 
        	 Scanner Obj1 = new Scanner(System.in);   
        	 System.out.println("Enter your Name : ");
        	    Name = Obj1.nextLine(); 
        	   // System.out.println(" your Name : " + name);
        	    
        	    System.out.println("Enter your Gender : ");
        	    Gender = Obj1.nextLine(); 
        	    //System.out.println(" your gender : " + gender);
        	    System.out.println("Enter your Address : ");
        	    address = Obj1.nextLine(); 
        	    
        	    System.out.println("Enter your Passport Number : ");
        	    passport = Obj1.nextLine(); 
        	    
        	    System.out.println("Enter Type plane: ");
        	    System.out.println("1:Business class");
        	    System.out.println("2:Economy class");
        	    System.out.println("3:First class ");
        	    type_of_Plane = Obj1.nextLine(); 
        	    
        	    
        	 
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
        	   
        	   //finl
           
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
