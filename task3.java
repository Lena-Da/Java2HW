//Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

import java.util.Scanner;
public class task3 {

    public static boolean palindrom(String text){
        StringBuffer newText = new StringBuffer(text).reverse();
        boolean result = true;
        for (int i=0; i<newText.length(); i++){
            if (newText.charAt(i) != text.charAt(i)){
                result = false;
            }
        } return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку для проверки на палиндром: ");
        String text =sc.nextLine();
        System.out.println(palindrom(text));
        sc.close();
    }

}


