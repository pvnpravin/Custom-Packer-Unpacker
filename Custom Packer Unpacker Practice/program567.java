import java.io.*;
import java.util.*;

class program567
{   
    public static void main(String A[]) throws Exception
    {
       boolean bRet = false;
       String FileName = null;
       File fObj = null;
       FileReader frObj = null;

       Scanner sObj = new Scanner(System.in);
        
       System.out.println("Enter the name of file");
       FileName = sObj.nextLine();
       
       fObj = new File(FileName);

       if(fObj.exists())
       {
         frObj = new FileReader(FileName);

         char Buffer[] = new char[50];

         frObj.read(Buffer, 0, 13);

         System.out.println("Data from file : "+ new String(Buffer));
         
       }
       else
       {
         System.out.println("There is no such file");
       }
           
       if (frObj != null) 
       {
            frObj.close(); 
       }
       
       sObj.close();
    }
}
