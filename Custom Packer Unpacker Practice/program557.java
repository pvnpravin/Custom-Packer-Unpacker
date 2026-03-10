import java.io.*;
import java.util.*;

class program557 
{
    public static void main(String A[]) throws Exception
    {   
        File fObj = new File("Demo.txt");

       boolean bRet =  fObj.createNewFile();

        if (bRet == true) 
        {
            System.out.println("File gets created sucessfully");    
        }
        else
        {
            System.out.println("Unable to Create File");
        }
        
    }
}
