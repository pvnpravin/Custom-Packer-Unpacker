import java.io.*;
import java.util.*;

class program572
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
          FileInputStream fiObj = new FileInputStream(fObj);
          
          byte Arr[] = new byte[50];
          fiObj.read(Arr);
          
          String str = new String(Arr);
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
