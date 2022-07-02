class pattern24
{
public static void main(String[] args)
{
 int i,j;

             for(i=1; i<=5;i++)
              {
                for(j=i; j<=5; j++)
                 {
                    System.out.print(j + " ");
}
          
                for(int k=5-1; k>=i; k--)
                {
                   System.out.print(k + " ");
}
       System.out.println();
}

}
}
output

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>javac pattern24.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>java pattern24.java
1 2 3 4 5 4 3 2 1
2 3 4 5 4 3 2
3 4 5 4 3
4 5 4
5

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>