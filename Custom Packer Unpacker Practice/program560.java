import java.io.*;
import java.util.*;

class program560
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

       bRet = fObj.exists();

       if (bRet == true) 
       {
            fObj.delete();
            System.out.println("File gets deleted");
       }
       else
       {

        System.out.println("There is no such file");

       }

       
        
        sObj.close();
    }
}
