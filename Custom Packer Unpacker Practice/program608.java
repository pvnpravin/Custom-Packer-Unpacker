// Unpacking Code

import java.io.*;
import java.util.*;

class program608
{   
    public static void main(String A[]) throws Exception
    {

      // Variable Creation
      Scanner sObj = null;
      String FileName = null;
      File fPackObj = null;
      FileInputStream fiObj = null;
      byte bHeader[] = new byte[100];
      String Header = null;


      sObj = new Scanner(System.in);

      System.out.println("Enter the name of packed file : ");
      FileName = sObj.nextLine();

      fPackObj = new File(FileName);

      if (!fPackObj.exists()) 
      {
        System.out.println("Error : There is no such packed file");
        return;
        
      }

      // create object to read the file
      fiObj = new FileInputStream(fPackObj);

      // read the header
      fiObj.read(bHeader, 0 , 100);

      Header = new String(bHeader);
      System.out.println("Header : "+Header);

    }
}
