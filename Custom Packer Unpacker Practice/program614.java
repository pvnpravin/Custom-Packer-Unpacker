// Unpacking Final Code

import java.io.*;
import java.util.*;

class program614
{   
    public static void main(String A[]) throws Exception
    {

      // Variable Creation
      int FileSize = 0;
      int i = 0;
      int iRet = 0;


      Scanner sObj = null;
      String FileName = null;
      String Header = null;
      String Tokens[] = null;

      File fPackObj = null;
      File fObj = null;
      
      FileInputStream fiObj = null;
      FileOutputStream foObj = null;
      
      byte bHeader[] = new byte[100];
      byte Buffer[] = null;
      byte Key = 0x11;
    


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
      while ((iRet = fiObj.read(bHeader, 0 , 100)) != -1) 
      {
               
        Header = new String(bHeader);

        Header = Header.trim();

        Tokens = Header.split(" ");

        System.out.println("FileName : "+ Tokens[0]);
        System.out.println("FileSize : "+ Tokens[1]);

        fObj = new File(Tokens[0]);

        fObj.createNewFile();

        foObj = new FileOutputStream(fObj);

        FileSize = Integer.parseInt(Tokens[1]);

        // Buffer for reading the data
        Buffer = new byte[FileSize];

        // read from packed file
        fiObj.read(Buffer, 0, FileSize);

        // Decrypt the data
        for (i = 0; i < FileSize; i++) 
        {
          Buffer[i] = (byte)(Buffer[i] ^ Key);
          
        }

        // write into extracted file
        foObj.write(Buffer, 0, FileSize);

      }
      
    }
}
