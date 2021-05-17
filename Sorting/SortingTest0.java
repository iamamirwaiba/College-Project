package Sorting;

import java.util.Scanner;

public class SortingTest0 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter how many numbers:?");
        int n=s.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("enter "+i+1+" number");

            a[i]=s.nextInt();
        }
        int greatest=a[0];
        for(int i=1;i<n;i++){
            if(greatest<a[i]){
                greatest=a[i];
                System.out.println("The greates number in the array is "+ greatest);
            }
        }
    }
}
