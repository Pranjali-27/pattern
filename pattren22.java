class pattren22
{
public static void main(String[] args)
{
 int i,j;

             for(i=1; i<=5;i++)
              {
                for(j=1; j<=i; j++)
                 {
                    System.out.print("0 ");
}
          System.out.print(i +" ");
                
                for(int k=i; k<5; k++)
                {
                   System.out.print("0 ");
}
       System.out.println();
}

}
}

    output:
C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>javac pattren22.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>java pattren22.java
0 1 0 0 0 0
0 0 2 0 0 0
0 0 0 3 0 0
0 0 0 0 4 0
0 0 0 0 0 5

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>
           

