import java.util.InputMismatchException;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int n;
        while (true)
        {
            System.out.print("Введите число строк: ");
            Scanner sc1 = new Scanner(System.in);
            try
            {
                n = sc1.nextInt();
                break;
            }
            catch(InputMismatchException fg)
            {
                System.out.print("Вы ввели не число. ");
            }
        }
        String[] str = new String[n];
        Scanner sc2 = new Scanner(System.in);
        for (int i = 0; i < n; i++)
        {
            System. out.print( "Введите строку №" + (i+1) + ": ");
            str[i] = sc2.nextLine();
        }
        for ( int i = 0; i < str.length - 1; i++)
        {
            for (int j = i+1; j < str.length; j++)
            {
                if (str[i].length() < str[j].length())
                {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        int maxlength = str[0].length();
        System.out.println("Строки в порядке убывания длины:");
        for (String s : str) {
            System.out.print(s);
            for (int j = 0; j < maxlength - s.length(); j++)
                System.out.print(" ");
            System.out.println(" её длина = " + s.length());
        }
    }
}