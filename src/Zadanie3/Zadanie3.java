package Zadanie3;

import java.util.Random;
import java.util.Scanner;

public class Zadanie3
{
    public static void main(String[] args)
    {
        int len = 0;
        Scanner sc = new Scanner(System.in);

        while (len < 8 || len > 12)
        {
            System.out.print("Введите желаемое количество символов от 8 до 12: ");
            len = sc.nextInt();
        }
        System.out.println(PasswordGenerator(len));
    }

    static char[] PasswordGenerator(int len)
    {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*_=+-/.?<>)";
        Random randomizer = new Random();

        char[] password = new char[len];

        for (int i = 0; i < len; i++)
        {
            password[i] = chars.charAt(randomizer.nextInt(chars.length()));
        }

        System.out.print("Ваш пароль: ");

        return password;
    }
}
