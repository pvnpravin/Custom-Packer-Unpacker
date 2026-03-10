import java.io.*;
import java.util.*;

class program579
{   
    public static void main(String A[]) throws Exception
    {
      Scanner sObj = new Scanner(System.in);
      
      File fObj = new File("PPA.txt");

      if (fObj.exists()) 
      {
        System.out.println("Folder is Present");
        
      }
      else
      {
        System.out.println("There is no such folder");
      }
    }
}
