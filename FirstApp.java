/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstapp;

/**
 *
 * @author Mohammed
 */
public class FirstApp {

   

    public static int SumofArayy(int a[]) {

        int sum = 0;
        for (int x = 0; x < a.length; x++) {
            sum = sum + a[x];
        }
        return sum;
    }

    public static int FindmaxNum(int a[]) {
        int max = a[0];
        for (int num = 0; num < a.length; num++) {
            if (max < a[num]) {
                max = a[num];
            }
        }
        return max;

    }

    public static int[] CalculateOfOddEvenNum(int[] arr) {
        int[] sortedarry = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sortedarry[i] = arr[i];
            }
            else if (arr[i] % 2 != 0) {
                sortedarry[i] = arr[i];

            }
        }
        return sortedarry;
    }

    public static void SortArray(int []arr) {
        int temp = 0;
         for (int i = 0; i < arr.length; i++) {        // 0 1 2  3  4  5   6  
            for (int j = i+1; j < arr.length; j++) {  //  5 6 2  10 3  14  1 
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
                   
               }     
            }
            System.out.print(" "+arr[i]); 
             
                    
        }    
        
    }
    
    public static void BubbleSort(int [] arr) {
        int temp = 0;
         for (int i = 0; i < arr.length; i++) {        // 0 1 2  3  4  5   6  
            for (int j = i+1; j < arr.length-1; j++) {  //  5 6 2  10 3  14  1
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
                   
               }     
            }
            System.out.print(" "+arr[i]); 
             
                    
        }    
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        

        int[] a = {5, 6, 2, 10, 3, 14, 1};
        SortArray(a);
        System.out.print("\n");
        BubbleSort(a);
        System.out.print("\n");
       int[] sorted= CalculateOfOddEvenNum(a);
        for (int i = 0; i < sorted.length; i++) {
            if (sorted[i]%2 == 0){
            System.out.println(sorted[i]+ " is an even number");}
            else
                System.out.println(sorted[i]+ " is an odd number");
        }

        System.out.println("even num is " + CalculateOfOddEvenNum(a));
        System.out.println("sum of array num is " + SumofArayy(a));
         System.out.println("max num is  " + FindmaxNum(a));
         
          
    }
}
