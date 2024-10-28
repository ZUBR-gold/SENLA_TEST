package Zadanie1;

import java.util.Random;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args)
    {
        String[] hangman =
                {
                        """
                 ------
                 |    |
                 |
                 |
                 |
                 |
                 |
                ----------
                """,
                        """
                 ------
                 |    |
                 |    O
                 |
                 |
                 |
                 |
                ----------
                """,
                        """
                 ------
                 |    |
                 |    O
                 |    |
                 |
                 |
                 |
                ----------
                """,
                        """
                 ------
                 |    |
                 |    O
                 |   /|
                 |
                 |
                 |
                ----------
                """,
                        """
                 ------
                 |    |
                 |    O
                 |   /|\\
                 |
                 |
                 |
                ----------
                """,
                        """
                 ------
                 |    |
                 |    O
                 |   /|\\
                 |   /
                 |
                 |
                ----------
                """,
                        """
                 ------
                 |    |
                 |    O
                 |   /|\\
                 |   / \\
                 |
                 |
                ----------
                """
                };

        Scanner sc = new Scanner(System.in);
        Random randomizer = new Random();

        int maxWrong = hangman.length - 1;
        int wrong = 0;
        int counter = 0;
        String new_str;

        String[] WORDS = {"АЛФАВИТ", "ПЯТНИЦА", "СЛОВАРЬ", "АППАРАТ", "СТАТЬЯ", "СВИНКА", "ПАСТУХ", "САЧОК", "КЛЕРК", "СХЕМА"};
        String word = WORDS[randomizer.nextInt(WORDS.length)];

        String slovo = "";
        for (int i = 0; i < (word.length()); i++) {
            slovo += "_";
        }
        char[] used = new char[word.length() + maxWrong];

        while (wrong < maxWrong && !word.equals(slovo))
        {

            System.out.println(hangman[wrong]);
            System.out.println("У вас " + (maxWrong-wrong) + " жизней");
            System.out.println("Слово выглядит так: " + slovo);
            System.out.print("Использованые буквы: ");
            for (int i = 0; i < counter; i++)
            {
                System.out.print("\'" + used[i] + "\' ");
            }
            System.out.println();


            System.out.println("Введите символ: ");
            char imputchar = sc.next().toUpperCase().charAt(0);

            while (in(imputchar,used))
            {
                System.out.println("Вы вводили эту букву");
                System.out.println("Введите символ: ");
                imputchar = sc.next().toUpperCase().charAt(0);
            }

            used[counter] = imputchar;

            if (in(imputchar, word.toCharArray()))
            {
                System.out.println("Буква \'" + imputchar + "\' есть в слове");
                new_str = "";
                for (int i = 0; i < word.length();i++)
                {
                    if (imputchar == word.charAt(i))
                    {
                        new_str += imputchar;
                    } else
                    {
                        new_str += slovo.charAt(i);
                    }
                }
                slovo = new_str;

            } else
            {
                System.out.println("Буквы \'" + imputchar + "\' нет в слове");
                wrong++;
            }
            counter++;
        }

        if (wrong == maxWrong)
        {
            System.out.println(hangman[wrong]);
            System.out.println("Тебя повесили");
        } else
        {
            System.out.println("Вы угадали слово");
        }

    }
    static boolean in(char bukva, char[] charArray)
    {
        boolean bool = false;
        for (char c : charArray) {
            if (bukva == c) {
                bool = true;
                break;
            }
        }
        return bool;
    }
}
