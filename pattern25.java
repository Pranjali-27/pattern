class pattern25
{
public static void main(String[] args)
{
 int i,j;

             for(i=1; i<=5;i++)
              {
                for(j=5; j>i; j--)
                 {
                    System.out.print(" ");
}
          
                for(int k=1; k<=i; k++)
                {
                   System.out.print(i + " ");
}
       System.out.println();
}

}
}
output:

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>javac pattern25.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>java pattern25.java
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>