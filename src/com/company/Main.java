package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {1,2,3};
        int[] array2 = {4,5,6};
        int[] sum = new int[array.length+array2.length];
        int k = 0;
        for(int i = 0; i < array.length; i++){
            sum[k] = array[i];
            k++;
        }
        for(int j = 0; j < array2.length; j++){
            sum[k] = array2[j];
            k++;
        }
        for(int l=0; l < sum.length; l++){
            System.out.println(sum[l]);
        }
    }
}
