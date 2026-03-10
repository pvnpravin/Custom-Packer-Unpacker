import java.io.*;
import java.util.*;

class program575
{   
    public static void main(String A[]) throws Exception
    {
       int iRet = 0;
       boolean bRet = false;
       String FileName = null;
       File fObj = null;
       byte Buffer[] = new byte[100];

       Scanner sObj = new Scanner(System.in);
        
       System.out.println("Enter the name of file");
       FileName = sObj.nextLine();
       
       fObj = new File(FileName);

       if(fObj.exists())
       {
         String str = null;
         FileInputStream fiObj = new FileInputStream(fObj);
         
         while ((iRet = fiObj.read(Buffer)) != -1) 
         {
            str = new String(Buffer);
            System.out.print(str);
            str = null;
         }
          
         System.out.println();
       }
       else
       {
         System.out.println("There is no such file");
       }
        
       

       // Close Resources
   
       sObj.close();
    }
}
