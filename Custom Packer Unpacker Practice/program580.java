import java.io.*;
import java.util.*;

class program580
{   
    public static void main(String A[]) throws Exception
    {
      Scanner sObj = new Scanner(System.in);

      System.out.println("Enter the name of folder : ");
      String FolderName = sObj.nextLine();
      
      File fObj = new File(FolderName);

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
