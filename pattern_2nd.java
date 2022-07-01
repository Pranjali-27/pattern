class pattern_2nd
{
public static void main(String[] args)
{
  int i,j;
  
       for(i=1; i<=5; i++)
        {
          
         for(j=1; j<=i; j++)
            System.out.print("");

          for(j=1; j<=i; j++)
                System.out.print(i+" ");

        System.out.println();
}
}
}
output:



C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>javac pattern_2nd.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>java pattern_2nd.java
1
22
333
4444
55555

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>