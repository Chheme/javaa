	import java.util.Scanner;

public class bezmetoda {
    //Вариант 8
    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in,"cp1251");
            System.out.println("Введите длину массива: ");
            int n = sc.nextInt();
            float s=0;
            int k=0;
            System.out.println("Введите элементы массива: ");
            int[] mas = new int[n];
        try {
            
            for (int i = 0; i < n; i++) {
                mas[i] = sc.nextInt();
                if (mas[i]<0) {
                    s = s + mas[i];
                    k=k+1;
                }
            }
            if (s<0) s=s/k; else s=0;
            if (s==0) {
                throw new IllegalArgumentException();
            } else  System.out.println("Среднее значение отрицательных чисел: " + s);

        } catch (ArrayStoreException e) {
            System.out.println("Несоответствие числового типа данных");
        } catch (NumberFormatException e) {
            System.out.println("Ввод строки вместо числа");
        }   catch (IllegalArgumentException e) {
            System.out.println("В массиве нет отрицательных чисел");
        }

    }
}
