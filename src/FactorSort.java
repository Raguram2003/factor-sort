import java.util.Arrays;
import java.util.Scanner;



public class FactorSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size; ");
        int size =sc.nextInt();
        int[] num=new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(findFactorSort(num,size));


    }
    public static String findFactorSort(int[] num,int size){
        int temp;
        for (int i = 0; i < size; i++) {
            for(int j=0;j< size-1;j++){
                if(countFactors(num[j]) == countFactors(num[j+1])){
                    if(num[j]>num[j+1]){
                        temp = num[j+1];
                        num[j+1] = num[j];
                        num[j] = temp;
                    }
                }
                if(countFactors(num[j]) > countFactors(num[j+1]))
                {
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        return Arrays.toString(num);
    }
    public static int countFactors(int num) {
        int count = 1;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }

}


