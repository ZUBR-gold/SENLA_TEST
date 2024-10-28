package Zadanie2;

import java.util.Scanner;

public class Zadanie2
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите сумму в бел. рублях: ");
        double imputMoney = sc.nextDouble();
        converter(imputMoney);
    }

    static void converter(double imputMoney)
    {

        double usd = 0.3031;
        double eur = 0.2807;
        double pln = 29.1926;
        double rub = 1.2186;
        double cny = 2.1472;

        System.out.println("USD: " + imputMoney * usd);
        System.out.println("EUR: " + imputMoney * eur);
        System.out.println("RUB: " + imputMoney * rub);
        System.out.println("PLN: " + imputMoney * pln);
        System.out.println("CNY: " + imputMoney * cny);
    }
}
