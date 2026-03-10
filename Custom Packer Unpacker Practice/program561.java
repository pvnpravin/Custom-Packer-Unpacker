import java.io.*;
import java.util.*;

class program561
{   
    public static void main(String A[]) throws Exception
    {
       boolean bRet = false;
       String FileName = null;
       File fObj = null;

       Scanner sObj = new Scanner(System.in);
        
       System.out.println("Enter the name of file");
       FileName = sObj.nextLine();

       FileWriter fwObj = new FileWriter(FileName);
        
       sObj.close();
    }
}
