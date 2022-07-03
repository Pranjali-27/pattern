class pattern27
{
public static void main(String[] args)
{
  int i,j;
for(i=1; i<=5; i++)
{
        int k=i;
   for(j=1;j<=i;j++)
     {
       System.out.print(k +" ");
          k= k+i-j;
}
  System.out.println();
}
}
}
Output:

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>javac pattern27.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>java pattern27.java
1
2 3
3 5 6
4 7 9 10
5 9 12 14 15

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>