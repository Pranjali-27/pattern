class pattern_8th
{
 public static void main(String[]args)
{
   int i,j;
 for(i=5; i>=1; i--)
{

   for(j=5; j>=i; j--)
{ 
   
         System.out.print(j+" ");
}

System.out.println();
}
}
}
output:

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>javac pattern_8th.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>java pattern_8th.java
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>