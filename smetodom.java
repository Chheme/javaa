import java.util.Scanner;

public class smetodom {

    public static float m(int n){
        Scanner sc=new Scanner(System.in,"cp1251");
        int k=0; float s=0;
        System.out.println("Введите элементы массива: ");
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextInt();
            if (mas[i]<0) {
                s = s + mas[i];
                k=k+1;
            }
            if (s<0) s=s/k; else s=0;
        }
   return s;
}



    public static  int m2(float s){
        if (s==0) {
            throw new IllegalArgumentException();
        } else  System.out.println("Среднее значение отрицательных чисел: " + s);
        return (int) s;
    }



    public static void main(String[] args) {
        try {
        Scanner sc=new Scanner(System.in,"cp1251");
        System.out.println("Введите длину массива: ");
        int n = sc.nextInt();
        float s;
        s=m(n);
            m2(s);
    } catch (NumberFormatException e) {
            System.out.println("Ввод строки вместо числа");
        }catch (ArrayStoreException e) {
            System.out.println("Несоответствие числового типа данных");
        } catch (IllegalArgumentException e) {
            System.out.println("В массиве нет отрицательных чисел");
        }
    }
}
