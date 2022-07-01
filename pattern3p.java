class pattern3p
{
public static void main(String[]args)
{
  int i,j;
         
         for(i=1; i<=5; i++)
          { 
             for(j=1; j<=i; j++)
                 System.out.print(j+" ");

                     System.out.println();
             }
                    for(i=4; i>=1; i--)
                   {
                     for(j=1; j<=i; j++)
                     {   
                       System.out.print(j+" ");
                        }
                       System.out.println();
}
}
} 
output:
C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>pattern3p.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>java pattern3p.java
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>