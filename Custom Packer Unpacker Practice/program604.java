import java.io.*;
import java.util.*;

class program604
{   
    public static void main(String A[]) throws Exception
    {
      String Header = null;

      byte Key = 0x11;

      int iRet = 0;
      int i =0, j = 0;

      byte Buffer[] = new byte[1024];

      Scanner sObj = new Scanner(System.in);

      System.out.println("Enter the name of folder : ");
      String FolderName = sObj.nextLine();

      System.out.println("Enter the name of packed file : ");
      String PackName = sObj.nextLine();
      
      File fObj = new File(FolderName);

      if ((fObj.exists()) && (fObj.isDirectory())) 
      {
        File PackObj = new File(PackName);
        PackObj.createNewFile();

        FileOutputStream foObj = new FileOutputStream(PackObj);

        FileInputStream fiObj = null;

        System.out.println("Folder is Present");

        File fArr[] = fObj.listFiles();

        System.out.println("Number of files in the folder are : " + fArr.length);
        
        for(i = 0; i < fArr.length; i++)
        {
          fiObj = new FileInputStream(fArr[i]);
                    
          if(fArr[i].getName().endsWith(".txt"))
          {
            // Creating Header : <File_name><space><file_size>
            Header = fArr[i].getName() + " "+ fArr[i].length();

            // Adding WhiteSpace to meet file name size
            for(j = Header.length(); j < 100; j++)
            {
              Header = Header + " ";
            }

            System.out.println("Header : " +Header + "Length : "+Header.length());
            
            // while ((iRet = fiObj.read(Buffer)) != -1) 
            // {
            //   // Encryption Logic
            //   for (j = 0; j < iRet; j++) 
            //   {
            //     Buffer[j] = (byte)(Buffer[j] ^ Key);
                
            //   }

            //   foObj.write(Buffer, 0, iRet);
            // }
          }


          fiObj.close();
        }

        foObj.close();
      }
      else
      {
        System.out.println("There is no such folder");
      }
    }
}
