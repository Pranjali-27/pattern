class patternp10
{
public static void main(String[] args)
{
  int i,j;
  int k=1;

  
 for(i=1; i<=5; i++)
{
  for(j=1; j<=i; j++)
{

   System.out.print(k + " ");
    k++;
}
    System.out.println();
}
}
}
Output:

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>javac patternp10.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>java patternp10.java
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>