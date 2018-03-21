import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] numbers;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Nhập số lượng mảng: ");
            size = input.nextInt();
            if (size > 20)
                System.out.println("Số lượng phần tử không lớn hơn 20");
        }while(size > 20);

        //Nhập mảng và in mảng ra màn hình
        numbers = new int[size];
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Phần tử " + (i + 1) + " : ");
            numbers[i] = input.nextInt();
        }
        System.out.printf("%-20s%s", "Phần tử trong mảng: ", "");
        for (int element : numbers) {
            System.out.print(numbers[element - 1] + "\t");
        }

        //Đảo ngược các phần tử và in ra mảng đã đảo ngược
        for (int k = 0; k < numbers.length / 2; k++){
            int temp = numbers[k];
            numbers[k] = numbers[size - 1 - k];
            numbers[size - 1 - k] = temp;
        }
        System.out.printf("%-20s%s", "Mảng đảo ngược: ", "");
        for (int element : numbers) {
            System.out.print(numbers[element - 1] + "\t");
        }
    }
}
