package DzEx2;

import java.util.Scanner;

public class task4DzEx2 {
    public static void main(String[] args) {
    ExceptionEmptyString.emptyString();
    }
}

class ExceptionEmptyString{
    public static void emptyString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сообщение: ");
        String str = scanner.nextLine();
        if(str.length() <= 0){
            throw new RuntimeException("Вы ввели пустую строку.");
        }
    }
}

