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

    public static String Claculat(int num) {

        int count = 0;
        int digitsum = 0;
        int digitmult;
        int summult = 0;

        do {
            int digit = num % 10;
            digitsum = digitsum + digit;
            digitmult = digit * digit;
            summult = summult + digitmult;
            System.out.println(digit);
            num = num / 10;
            count = count + 1;
        } while (num != 0);

        String output = "sum is\t " + summult;
        output = output + "\ndigit sum is\t " + digitsum;
        output = output + "\ncount is\t " + count;
        return output;
    }

    public static String calculateaangle(int h, int m) {

        //input 
        float angle = 0;
        //processing
        if (h > 12 && h <= 24) {
            h = h - 12;
        }

        if ((m <= 59 && m >= 0) && (h < 12 && h >= 0)) {
            float hoursarg = h * 30 + m * .5F;
            float minarg = m * 6;
            angle = (hoursarg - minarg);
            if (angle < 0) {
                angle = angle * -1;

            }
        }

        //output
        String message = "";
        if (h > 12) {
            message = "please enter corrrect hours less than 12";
        } else if (h < 0) {
            message = "please enter corrrect hours greater than 0 or equl zero";
        } else if (m < 0) {
            message = "please enter corrrect minutes greater than zero or equal zero";
        } else if (m > 60) {
            message = "please enter corrrect minutes less than 60";
        } else {
            message = " angle is " + angle;
        }
        return message;

    }

    public static String calculator(int x, int y) {

        int sum;
        int dis;
        int mult;
        float div;
        sum = x + y;
        dis = y - x;
        mult = x * y;
        div = (float) y / x;

        String opertion = x + "+" + y + " = " + sum + "\n";
        opertion = opertion + x + "-" + y + " = " + dis + "\n";
        opertion = opertion + x + "*" + y + " = " + mult + "\n";
        opertion = opertion + y + "/" + x + " = " + div + "\n";

//        System.out.println(x + y);
//        System.out.println("sum = " + x + y);
//        System.out.println(x + y + "<=sum");
        return opertion;
    }

    public static int calbermamethod() {
        int s = 0;
        for (int i = 60; i < 1000; i = i + 60) {
            if (((i + 1) % 7) == 0) {
                s = i + 1;
                break;

            }
        }
        return s;
    }

    public static String excutemonthdays(int years, int month) {
        //inputs
        int days = 0;

        //proccessing 
        for (int i = 1; i <= 12; i++) {
            if (month == i) {
                if (i == 2) {
                    if (years % 4 == 0) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                } else if (i < 8) {
                    if (i % 2 == 0) {
                        days = 30;
                    } else {
                        days = 31;
                    }
                } else if (i > 8) {
                    if (i % 2 == 0) {
                        days = 31;
                    } else {
                        days = 30;
                    }
                }
            }
        }

        //output
        String message = "";
        if (days == 0) {
            message = " INVALID MONTH !!!!";
        } else {
            message = " the month " + month + " is " + days + " days";
        }
        return message;
        /*
         int number=20;  
         //switch expression with int value  
         switch(number){  
         //switch cases without break statements  
         case 10: System.out.println("10");  
         case 20: System.out.println("20");  
         case 30: System.out.println("30");  
         default:System.out.println("Not in 10, 20 or 30");  
         }   */

    }

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
//       int[] sorted= CalculateOfOddEvenNum(a);
//        for (int i = 0; i < sorted.length; i++) {
//            if (sorted[i]%2 == 0){
//            System.out.println(sorted[i]+ " is an even number");}
//            else
//                System.out.println(sorted[i]+ " is an odd number");
//        }

        //System.out.println("even num is " + CalculateOfOddEvenNum(a));
        //System.out.println("sum of array num is " + SumofArayy(a));
        // System.out.println("max num is  " + FindmaxNum(a));
//        System.out.println(Claculat(23));
//        String result = calculateaangle(3, 0);
//        System.out.println(result);
//        System.out.println(calculator(5, 10));
//        System.out.println("berma " + calbermamethod());
//        System.out.println(excutemonthdays(2021, 2));
    }
}
