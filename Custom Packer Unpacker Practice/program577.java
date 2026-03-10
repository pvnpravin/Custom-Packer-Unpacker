import java.io.*;
import java.util.*;

class program577
{   
    public static void main(String A[]) throws Exception
    {
       int iRet = 0;
       String str = null;

       boolean bRet = false;

       String FileNameSRC = null;
       String FileNameDEST = null;

       File fObjSRC = null;
       File fObjDEST = null;

       byte Buffer[] = new byte[1024];

       Scanner sObj = new Scanner(System.in);
        
       System.out.println("Enter the name of source file : ");
       FileNameSRC = sObj.nextLine();

       System.out.println("Enter the name of destination file : ");
       FileNameDEST = sObj.nextLine();
       
       fObjSRC = new File(FileNameSRC);

       if(fObjSRC.exists())
       {
         fObjDEST = new File(FileNameDEST);

         fObjDEST.createNewFile();
         
         FileInputStream fiObj = new FileInputStream(fObjSRC);
         FileOutputStream foObj = new FileOutputStream(fObjDEST);

         while ((iRet = fiObj.read(Buffer)) != -1) 
         {
            // str = new String(Buffer, 0, iRet);
            // System.out.print(str);
            foObj.write(Buffer,0,iRet);
            // str = null;
         }
          
         System.out.println("File copy sucessful");

         fiObj.close();
         foObj.close();
       }
       else
       {
         System.out.println("There is no source file");
       }
        
       

       // Close Resources
   
       sObj.close();
    }
}
