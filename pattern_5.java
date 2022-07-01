class pattern_5
{
public static void main(String[]args)
{
    int i,j;
   for(i=5;i<=1;i--)
{  
   for(j=i;j<=1;j--)
             System.out.print(j+" ");
       System.out.println();
}
    

   for(i=1;i<=5;i++)
{
    for(j=i;j>=1;j--)
            System.out.print(j+" ");
                System.out.println();
}
}
}
Output:
C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>javac pattern_5.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>java pattern_5.java
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>

