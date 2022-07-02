class pattern23
{
public static void main(String[] args)
{
 int i,j;

             for(i=1; i<=5;i++)
              {
                for(j=5; j>i; j--)
                 {
                    System.out.print(1 + " ");
}
          
                for(int k=1; k<=i; k++)
                {
                   System.out.print(i + " ");
}
       System.out.println();
}

}
}
Output:
C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>javac pattern23.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>java pattern23.java
1 1 1 1 1
1 1 1 2 2
1 1 3 3 3
1 4 4 4 4
5 5 5 5 5

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>


