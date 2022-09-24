package Task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the size of Array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum=0;
        System.out.println("Insert the numbers of the array : ");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        boolean flag = false;
        if(sum%2 == 0){
            flag = true;
        }else {
            for (int j = 3; j <= sum / 2; j = j + 2) {
                if (sum % j == 0) {
                    flag = true;
                    break;
                }
            }
        }
        if (!flag) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
