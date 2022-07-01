class pattern6p
{
public static void main(String[] args)
{
    int i,j;
    for(i=1; i<=5; i++)
     {
       

            for(j=i; j<=5; j++)
          System.out.print(" ");

            for(j=1; j<=i; j++)
               System.out.print(j+" ");

           System.out.println();
           }
}

   }

Output:
C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>javac pattern6p.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>java pattern6p.java
     1
    1 2
   1 2 3
  1 2 3 4
 1 2 3 4 5

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>
         
              