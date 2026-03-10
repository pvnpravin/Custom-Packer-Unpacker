import java.io.*;
import java.util.*;

class program564
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
