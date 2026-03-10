import java.io.*;
import java.util.*;

class program563
{   
    public static void main(String A[]) throws Exception
    {
       boolean bRet = false;
       String FileName = null;
       File fObj = null;

       Scanner sObj = new Scanner(System.in);
        
       System.out.println("Enter the name of file");
       FileName = sObj.nextLine();

       FileReader frObj = new FileReader(FileName);
        
       
        
       frObj.close();
       sObj.close();
    }
}
