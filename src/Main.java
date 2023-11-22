// อ้างอิงค์แลป : https://www.youtube.com/watch?v=86B5U15c88w
//            https://www.youtube.com/watch?v=RJZIJdYMsYg&t=26839s
//            https://www.youtube.com/watch?v=AOZNmiUhduM
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nonnegative number: ");
        int nonnegative = sc.nextInt();

        if(nonnegative>0){
            // สร้าง array มารับ
            int[] numbers = new int[nonnegative];
            for (int i = 0; i < nonnegative; i++) {
                System.out.print("Enter number" + (i + 1) + " : ");
                numbers[i] = sc.nextInt();
            }
            //เรียกใช้ methods swap
            swap(numbers);
            System.out.print("Sorted numbers: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        }else{
            System.out.println("Only nonnegative number !!!");
        }

    }
    public static void swap(int[] arr) {
        int n = arr.length;
        int temp ;
        for(int i = 0; i< n; i++){
            for(int j=i+1; j < n; j++){
                if(arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
