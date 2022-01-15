package task1;

public class Main {
    public static void main(String[] args) {
             String lines = "\"Your time is limited,?so don’t waste it ?living someone else’s life\"?Steve Jobs";
     String []words= lines.split("\\?");
     int a =0;
         for(String w :words)
         {
             for(int i=0; i<a; i++)
             {
                 System.out.print("\t");
             }
             a++;
             System.out.println(w);
         }
    }
}
