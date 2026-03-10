// Unpacking Code

import java.io.*;
import java.util.*;

class program607
{   
    public static void main(String A[]) throws Exception
    {

      // Variable Creation
      Scanner sObj = null;
      String FileName = null;


      sObj = new Scanner(System.in);

      System.out.println("Enter the name of packed file : ");
      FileName = sObj.nextLine();

      File fPackObj = new File(FileName);

      if (!fPackObj.exists()) 
      {
        System.out.println("Error : There is no such packed file");
        return;
        
      }
    }
}
