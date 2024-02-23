import java.util.Scanner;

public class ex1 {

    private static int n1[] = {1,2,3,4,5,6,7,8,9,10};
    private static int soma=0;
    private static int i=0;
    public static void main(String[] args) {

        for (int ic=0; ic<n1.length;ic++ ) {
            ex1();
        }
        System.out.println(soma);
    }

    public static void ex1(){

        if (i<n1.length){

            soma += n1[i];
            i++;
            ex1();

    }

        }




}
