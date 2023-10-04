package src;
import java.util.Scanner;

public class ZodiacSigns
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("What month is your birthday in? ");
        String month = scan.nextLine().toLowerCase();

        System.out.println("What day of the month is your birthday? ");
        int day = scan.nextInt();

        String ZodiacSign;

        if (((month.equals("january")) && (day <= 19)) || ((month.equals("december")) && (day >= 22)))
        {
            System.out.println("Your Zodiac sign is: Capricorn")
        }
        else if (((month.equals("february")) && (day <= 19)) || ((month.equals("january")) && (day >= 20)))
        {
            System.out.println("Your Zodiac sign is: Aquarius")
        }
        else if (((month.equals("march")) && (day <= 19)) || ((month.equals("february")) && (day >= 19)))
        {
            System.out.println("Your Zodiac sign is: Pisces")
        }
        else if (((month.equals("april")) && (day <= 19)) || ((month.equals("march")) && (day >= 21)))
        {
            System.out.println("Your Zodiac sign is: Aries")
        }
        else if (((month.equals("may")) && (day <= 19)) || ((month.equals("april")) && (day >= 20)))
        {
            System.out.println("Your Zodiac sign is: Taurus")
        }
        else if (((month.equals("june")) && (day <= 19)) || ((month.equals("may")) && (day >= 21)))
        {
            System.out.println("Your Zodiac sign is: Gemini")
        }
        else if (((month.equals("july")) && (day <= 19)) || ((month.equals("june")) && (day >= 21)))
        {
            System.out.println("Your Zodiac sign is: Cancer")
        }
        else if (((month.equals("august")) && (day <= 19)) || ((month.equals("july")) && (day >= 23)))
        {
            System.out.println("Your Zodiac sign is: Leo")
        }
        else if (((month.equals("september")) && (day <= 19)) || ((month.equals("august")) && (day >= 23)))
        {
            System.out.println("Your Zodiac sign is: Virgo")
        }
        else if (((month.equals("october")) && (day <= 19)) || ((month.equals("september")) && (day >= 23)))
        {
            System.out.println("Your Zodiac sign is: Libra")
        }
        else if (((month.equals("november")) && (day <= 19)) || ((month.equals("october")) && (day >= 23)))
        {
            System.out.println("Your Zodiac sign is: Scorpio")
        }
        else if (((month.equals("december")) && (day <= 19)) || ((month.equals("november")) && (day >= 22)))
        {
            System.out.println("Your Zodiac sign is: Sagittarius")
        }
        else if (day <= 32)
        {
            "ERROR: No month has more than 31 days."
        }
        else
        {
            System.out.print("ERROR: System does not recognize inputted values.")
        }
    }
}
