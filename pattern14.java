class pattern14
{
public static void main(String[] args)
{
  int i,j;
   
 for(i=1; i<=5; i++)
 {
 for(j=1; j<=i; j++)
     {
       System.out.print(j+" ");
      }
        for(int k =i-1; k>=1; k--)
{
        System.out.print(k + " ");
}
          System.out.println();
       }
}
}

Output:
C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>javac pattern14.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>java pattern14.java
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>