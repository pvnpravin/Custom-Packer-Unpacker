import java.io.*;
import java.util.*;

class program583
{   
    public static void main(String A[]) throws Exception
    {
      Scanner sObj = new Scanner(System.in);

      System.out.println("Enter the name of folder : ");
      String FolderName = sObj.nextLine();
      
      File fObj = new File(FolderName);

      if ((fObj.exists()) && (fObj.isDirectory())) 
      {
        System.out.println("Folder is Present");

        File fArr[] = fObj.listFiles();

        System.out.println("Number of files in the folder are : " + fArr.length);
        
        for(int i = 0; i < fArr.length; i++)
        {
          System.out.println("File name : " + fArr[i].getName() + " File size : " + fArr[i].length() + " bytes");
          
        }
      }
      else
      {
        System.out.println("There is no such folder");
      }
    }
}
