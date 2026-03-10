import java.io.*;
import java.util.*;

class program559
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
            System.out.println("File is already present");
       }
       else
       {
        bRet = fObj.createNewFile();

        if (bRet == true) 
        {
            System.out.println("File gets created sucessfully");    
        }
        else
        {
            System.out.println("Unable to Create File");
        }
       }

       
        
        sObj.close();
    }
}
