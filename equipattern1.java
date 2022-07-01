   


class equipattern1
{
public static void main(String[]args)
{
int i,j;
 
      for(i=1; i<=6; i++)
      {
       for(j=1; j<=6; j++)
         System.out.print(" ");

        for(j=1; j<=i; j++)
              System.out.print(j+" ");
          

    System.out.println();
}
}
}
output:

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>javac equipattern1.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>java equipattern1.java
      1
      1 2
      1 2 3
      1 2 3 4
      1 2 3 4 5
      1 2 3 4 5 6

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>