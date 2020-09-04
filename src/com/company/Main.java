package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int sum = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i = 0;
        do{
            arr.add(sc.nextInt());
            sum += arr.get(i);
            i++;
        } while (i<n);
        /*while (i<n){
            arr.add(sc.nextInt());
            sum += arr.get(i);
            i++;
        }*/
        /*for (int  i = 0; i<n;i++){
            arr.add(sc.nextInt());
            sum += arr.get(i);
        }*/

        System.out.println(sum);
    }
}
