class pattern_13
{
public static void main(String[]args)
{

     for(int i=1; i<=5; i++)
{
    for(int j=5; j>i; j--)
{
     System.out.print(" ");
}
   int A = 1;
for(int k =1; k<=i; k++)
{
   System.out.print(A+ " ");
     A = A *(i-k)/(k);  
}
  System.out.println();
}
}
}
output:

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>javac pattern_13.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>java pattern_13.java
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>