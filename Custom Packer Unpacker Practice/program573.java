import java.io.*;
import java.util.*;

class program573
{   
    public static void main(String A[]) throws Exception
    {
       int iRet = 0;
       boolean bRet = false;
       String FileName = null;
       File fObj = null;
       byte Arr[] = new byte[100];

       Scanner sObj = new Scanner(System.in);
        
       System.out.println("Enter the name of file");
       FileName = sObj.nextLine();
       
       fObj = new File(FileName);

       if(fObj.exists())
       {
          FileInputStream fiObj = new FileInputStream(fObj);
          
          iRet = fiObj.read(Arr);
          
          String str = new String(Arr);

          System.out.println("iRet = "+iRet);
          System.out.println(str);
       }
       else
       {
         System.out.println("There is no such file");
       }
        
       

       // Close Resources
   
       sObj.close();
    }
}
