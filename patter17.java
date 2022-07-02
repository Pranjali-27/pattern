class patter17
{
public static void main(String[] args)
{
   for(i=1; i<=6;i++)
      {
        for(j=1; j<i; j++)
          {
            System.out.print(" ");
          }

            
         for(int k=i; k<=6; k++)
     {
          System.out.print(k);
           }
             System.out.println();
         }
           

          for(i=6;i>=1; i--)
           {
              for(j=1; j<i; j++)
               {
                     System.out.print(" ");
                   }
                 
                for(int k=i; k<=6; k++)
                   {
                     System.out.print(k);
                     }
                        System.out.println();
}
}
}
Output:
C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>javac pattern17.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>java pattern17.java
12345
 2345
  345
   45
    5
    5
   45
  345
 2345
12345

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>


   
   