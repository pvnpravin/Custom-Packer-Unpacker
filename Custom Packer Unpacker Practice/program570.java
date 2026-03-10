import java.io.*;
import java.util.*;

class program570
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
         FileOutputStream foObj = new FileOutputStream(fObj);
         String str = "Jay Ganesh...";

         byte Arr[] = str.getBytes();

         System.out.println("Length of Arr is : " + Arr.length);
         
         foObj.write(Arr);
       }
       else
       {
         System.out.println("There is no such file");
       }
        
       

       // Close Resources
   
       sObj.close();
    }
}
