class pattern26
{
public static void main(String[] args)
{
 int i,j;

             for(i=5; i>=1;i--)
              {
                for(j=i; j<5; j++)
                 {
                    System.out.print(j +" ");
}
          
                for(int k=5-i; k<5; k++)
                {
                   System.out.print(5 + " ");
}
       System.out.println();
}

}
}
Output:

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>javac pattern26.java

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>java pattern26.java
5 5 5 5 5
4 5 5 5 5
3 4 5 5 5
2 3 4 5 5
1 2 3 4 5

C:\Users\AT SYSTEMS\SkyDrive\Documents\patterns>