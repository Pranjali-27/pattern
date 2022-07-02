class pattern32
{
public static void main(String[] args)
{
 int i,j;

             for(i=1; i<=5;i++)
              {
                int a=0;
                int b=1;
                 
             for(j=1; j<=i; j++)
                 {
                    int c=a + b;

System.out.print(c +" ");

                     a=b;
                     b=c;
                
                 }
       System.out.println();
}

}
}
Output:

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>javac pattern32.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>java pattern32.java
1
1 2
1 2 3
1 2 3 5
1 2 3 5 8

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>