class pattern4p
{
public static void main(String[]args)
{
   int i,j;
for(i=5;i>=1;i--)
{
   for(j=1;j<=i;j++)
        System.out.print(j+" ");
 
          System.out.println();
}
     
        for(i=1;i<=5;i++)
          {
         for(j=1;j<=i;j++)
            System.out.print(j+" ");
  
              System.out.println();
}
}
}
Output:

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>javac pattern4p.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>java pattern4p.java
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>