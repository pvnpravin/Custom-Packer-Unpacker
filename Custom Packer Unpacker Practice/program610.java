// Unpacking Code

import java.io.*;
import java.util.*;

class program610
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
      String Tokens[] = null;
      File fObj = null;


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

      Header = Header.trim();

      Tokens = Header.split(" ");

      System.out.println("FileName : "+ Tokens[0]);
      System.out.println("FileSize : "+ Tokens[1]);

      fObj = new File(Tokens[0]);

      fObj.createNewFile();
    }
}
