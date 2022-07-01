class pattern_7
{
  public static void main(String[]args)
{
    int i,j;
       
      for(i=1; i<=5; i++)
{   
      for(j=5; j>=i; j--)
{
         System.out.print(j);

}
   
System.out.println();
}
}
}
output:

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>javac pattern_7.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>java pattern_7.java
54321
5432
543
54
5

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>