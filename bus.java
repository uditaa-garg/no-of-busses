import java.util.*;
import java.util.Scanner;

public class bus {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of stops: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n];
        System.out.println("enter the no of busses at each stop: ");

        for(int i=0;i<n;i++){
          arr[i] = sc.nextInt();

        }

        result[0] = arr[0];

        for(int i=1;i<n;i++){
          result[i] = arr[i]-arr[0];
        }



        for(int i=0;i<n;i++){

        System.out.print(result[i]+" ");

    }
}

    
}
