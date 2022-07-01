class Equitriangle
{
public static void main(String[]args)
{
int i,j ;
        
      for(i=1; i<=6 ; i++)
{
     for(j=i;j<=6; j++)
         System.out.print(j+" ");

      for(j=1; j<=i; j++)
         System.out.print(j+" ");

System.out.println();
}
}
}
output:

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>javac Equitriangle.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>java Equitriangle.java
1 2 3 4 5 6 1
2 3 4 5 6 1 2
3 4 5 6 1 2 3
4 5 6 1 2 3 4
5 6 1 2 3 4 5
6 1 2 3 4 5 6

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>