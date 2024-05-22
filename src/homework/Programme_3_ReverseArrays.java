package homework;

import java.util.Arrays;

//Write a Java program to reverse an array of integer values
public class Programme_3_ReverseArrays {
    public static void main(String[] args) {
        int[] array = new int[]{23,45,67,78,};//single dimension array
        System.out.println("Original array is " + Arrays.toString(array));
        Programme_3_ReverseArrays obj = new Programme_3_ReverseArrays();
        System.out.println("Reverse array : ");
        obj.reverseArray(array);
    }

    //Method to reverse array
    public void reverseArray(int[] list){
        for (int i = 0 ; i < (list.length) / 2; i++){
            int temp = list[i];
            list[i] = list[list.length-1-i];
            list[list.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(list));
    }}
