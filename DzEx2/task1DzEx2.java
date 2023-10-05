package DzEx2;

import java.util.Scanner;

public class  task1DzEx2 {
    public static void main(String[] args) {
        float a = ConsoleInput();
        System.out.println(a);
    }

    private static float ConsoleInput() {
        Scanner scanner = new Scanner(System.in);
        float a = 0f;
        boolean flag = true;
        while (flag){
            System.out.println("Введите дробное число");
            if(scanner.hasNextFloat()){
                a = scanner.nextFloat();
                flag = false;
            } else {
                System.out.println("Вы ввели не дробное число!");
                scanner.next();
            }
        }
        return a;
    }

}
