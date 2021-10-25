package apAssignment2;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Display obj=new Display();
        String fname1="Inputfile.txt";
        obj.Create_File(fname1);
                                   
        obj.Input(fname1);
                                  
        obj.Read_File(fname1);
        
        
	}
	

}

