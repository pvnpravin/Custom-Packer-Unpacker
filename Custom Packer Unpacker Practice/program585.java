import java.io.*;
import java.util.*;

class program585
{   
    public static void main(String A[]) throws Exception
    {
      int iRet =0;
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
        
        for(int i = 0; i < fArr.length; i++)
        {
          fiObj = new FileInputStream(fArr[i]);
          
          System.out.println("File name : " + fArr[i].getName() + " File size : " + fArr[i].length() + " bytes");
          
          while ((iRet = fiObj.read(Buffer)) != -1) 
          {
            foObj.write(Buffer, 0, iRet);
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
