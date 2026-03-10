import java.io.*;
import java.util.*;

class program558 
{   
    public static void main(String A[]) throws Exception
    {
       String FileName = null;
       Scanner sObj = new Scanner(System.in);
        
       System.out.println("Enter the name of file");
       FileName = sObj.nextLine();

       File fObj = new File(FileName);

       boolean bRet =  fObj.createNewFile();

        if (bRet == true) 
        {
            System.out.println("File gets created sucessfully");    
        }
        else
        {
            System.out.println("Unable to Create File");
        }
        
        sObj.close();
    }
}
