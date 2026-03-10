import java.io.*;
import java.util.*;

class program568
{   
    public static void main(String A[]) throws Exception
    {
       boolean bRet = false;
       String FileName = null;
       File fObj = null;

       Scanner sObj = new Scanner(System.in);
        
       System.out.println("Enter the name of file");
       FileName = sObj.nextLine();
       
       fObj = new File(FileName);

       if(fObj.exists())
       {
         System.out.println("File name : " +fObj.getName());
         System.out.println("File path : " +fObj.getAbsolutePath());
         System.out.println("File size : "+ fObj.length());
       }
       else
       {
         System.out.println("There is no such file");
       }
        
       

       // Close Resources
   
       sObj.close();
    }
}
