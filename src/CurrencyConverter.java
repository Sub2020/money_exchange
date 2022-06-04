import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter
{
    public static void main(String[] args)
    {
        double amount;
        double dollar, euro, pound, canadianDollar, swissFranc, jordanianDinar, omaniRial, kuwaitiDinar, nepaliRupee;
        int choice;
        int answer;

        DecimalFormat f = new DecimalFormat("##.##");
        Scanner sc = new Scanner(System.in);

        System.out.println(". . . . . . . . . . . .Commission Free Money Exchange . . . . . . . . . . ");
        System.out.println(". . . . . . . . . . . . .Welcome to money Exchange . . . . . . . . . . ");

        do{
            System.out.println("Following are the Choices:");
            System.out.println("Please Enter 1: Dollar");
            System.out.println("Please Enter 2: Euro");
            System.out.println("Please Enter 3: Pound");
            System.out.println("Please Enter 4: CanadianDollar");
            System.out.println("Please Enter 5: SwissFranc");
            System.out.println("Please Enter 6: JordanianDinar");
            System.out.println("Please Enter 7: OmaniRial");
            System.out.println("Please Enter 8: KuwaitiDinar");
            System.out.println("Please Enter 9: NepaliRupee");

            System.out.println("\n Please choose from above given options: ");
            choice = sc.nextInt();

            System.out.println("Enter the amount you want to convert?");
            amount = sc.nextFloat();


            switch (choice)
            {
                case 1: // dollar conversion
                    euro = amount * 0.93;
                    System.out.println(amount + "Dollar = " + f.format(euro) + " Euro");

                    pound = amount * 0.79;
                    System.out.println(amount + "Dollar = " + f.format(pound) + " Pound");

                    canadianDollar = amount * 1.27;
                    System.out.println(amount + "Dollar = " + f.format(canadianDollar) + " CanadianDollar");

                    swissFranc = amount * 0.96;
                    System.out.println(amount + "Dollar = " + f.format(swissFranc) + " SwissFranc");

                    jordanianDinar = amount * 0.71;
                    System.out.println(amount + "Dollar = " + f.format(jordanianDinar) + " JordanianDinar");

                    omaniRial = amount * 0.38;
                    System.out.println(amount + "Dollar = " + f.format(omaniRial) + " OmaniRial");

                    kuwaitiDinar = amount * 0.31;
                    System.out.println(amount + "Dollar = " + f.format(kuwaitiDinar) + " KuwaitiDinar");

                    nepaliRupee = amount * 123.81;
                    System.out.println(amount + "Dollar = " + f.format(nepaliRupee) + " NepaliRupee");
                    break;


                case 2: // Euro conversion
                    dollar = amount * 1.07;
                    System.out.println(amount + "euro = " + f.format(dollar) + " Dollar");

                    pound = amount * 0.85;
                    System.out.println(amount + "euro = " + f.format(pound) + " Pound");

                    canadianDollar = amount * 1.37;
                    System.out.println(amount + "euro = " + f.format(canadianDollar) + " CanadianDollar");

                    swissFranc = amount * 1.03;
                    System.out.println(amount + "euro = " + f.format(swissFranc) + " SwissFranc");

                    jordanianDinar = amount * 0.76;
                    System.out.println(amount + "euro = " + f.format(jordanianDinar) + " JordanianDinar");

                    omaniRial = amount * 0.41;
                    System.out.println(amount + "euro = " + f.format(omaniRial) + " OmaniRial");

                    kuwaitiDinar = amount * 0.33;
                    System.out.println(amount + "euro = " + f.format(kuwaitiDinar) + " KuwaitiDinar");

                    nepaliRupee = amount * 133.12;
                    System.out.println(amount + "euro = " + f.format(nepaliRupee) + " NepaliRupee");
                    break;

                case 3: //pound conversion
                    dollar = amount * 1.27;
                    System.out.println(amount + "pound = " + f.format(dollar) + " Dollar");

                    euro = amount * 1.18;
                    System.out.println(amount + "pound = " + f.format(euro) + " Euro");

                    canadianDollar = amount * 1.61;
                    System.out.println(amount + "pound = " + f.format(canadianDollar) + " CanadianDollar");

                    swissFranc = amount * 1.21;
                    System.out.println(amount + "pound = " + f.format(swissFranc) + " SwissFranc");

                    jordanianDinar = amount * 0.90;
                    System.out.println(amount + "pound = " + f.format(jordanianDinar) + " JordanianDinar");

                    omaniRial = amount * 0.49;
                    System.out.println(amount + "pound = " + f.format(omaniRial) + " OmaniRial");

                    kuwaitiDinar = amount * 0.39;
                    System.out.println(amount + "pound = " + f.format(kuwaitiDinar) + " KuwaitiDinar");

                    nepaliRupee = amount * 156.59;
                    System.out.println(amount + "pound = " + f.format(nepaliRupee) + " NepaliRupee");
                    break;

                case 4: // candianDollar
                    dollar = amount * 0.79;
                    System.out.println(amount + "candianDollar = " + f.format(dollar) + " Dollar");

                    euro = amount * 0.73;
                    System.out.println(amount + "candianDollar = " + f.format(euro) + " Euro");

                    pound = amount * 0.62;
                    System.out.println(amount + "candianDollar = " + f.format(pound) + " Pound");

                    swissFranc = amount * 0.75;
                    System.out.println(amount + "candianDollar = " + f.format(swissFranc) + " SwissFranc");

                    jordanianDinar = amount * 0.56;
                    System.out.println(amount + "candianDollar = " + f.format(jordanianDinar) + " JordanianDinar");

                    omaniRial = amount * 0.30;
                    System.out.println(amount + "candianDollar = " + f.format(omaniRial) + " OmaniRial");

                    kuwaitiDinar = amount * 0.24;
                    System.out.println(amount + "candianDollar = " + f.format(kuwaitiDinar) + " KuwaitiDinar");

                    nepaliRupee = amount * 97.48;
                    System.out.println(amount + "candianDollar = " + f.format(nepaliRupee) + " NepaliRupee");
                    break;

                case 5: // swissFranc conversion
                    dollar = amount * 0.79;
                    System.out.println(amount + "swissFranc = " + f.format(dollar) + " Dollar");

                    euro = amount * 0.73;
                    System.out.println(amount + "swissFranc = " + f.format(euro) + " Euro");

                    pound = amount * 0.62;
                    System.out.println(amount + "swissFranc = " + f.format(pound) + " Pound");

                    canadianDollar = amount * 1.33;
                    System.out.println(amount + "pound = " + f.format(canadianDollar) + " CanadianDollar");

                    jordanianDinar = amount * 0.56;
                    System.out.println(amount + "swissFranc = " + f.format(jordanianDinar) + " JordanianDinar");

                    omaniRial = amount * 0.30;
                    System.out.println(amount + "swissFranc = " + f.format(omaniRial) + " OmaniRial");

                    kuwaitiDinar = amount * 0.24;
                    System.out.println(amount + "swissFranc = " + f.format(kuwaitiDinar) + " KuwaitiDinar");

                    nepaliRupee = amount * 97.48;
                    System.out.println(amount + "swissFranc = " + f.format(nepaliRupee) + " NepaliRupee");
                    break;

                case 6: // jordoniDinar
                    dollar = amount * 1.41;
                    System.out.println(amount + "jordoniDinar = " + f.format(dollar) + " Dollar");

                    euro = amount * 1.31;
                    System.out.println(amount + "jordoniDinar = " + f.format(euro) + " Euro");

                    pound = amount * 1.12;
                    System.out.println(amount + "jordoniDinar = " + f.format(pound) + " Pound");

                    canadianDollar = amount * 1.79;
                    System.out.println(amount + "jordoniDinar = " + f.format(canadianDollar) + " CanadianDollar");

                    swissFranc = amount * 1.35;
                    System.out.println(amount + "jordoniDinar = " + f.format(swissFranc) + " SwissFranc");

                    omaniRial = amount * 0.54;
                    System.out.println(amount + "jordoniDinar = " + f.format(omaniRial) + " OmaniRial");

                    kuwaitiDinar = amount * 0.43;
                    System.out.println(amount + "jordoniDinar = " + f.format(kuwaitiDinar) + " KuwaitiDinar");

                    nepaliRupee = amount * 174.63;
                    System.out.println(amount + "jordoniDinar = " + f.format(nepaliRupee) + " NepaliRupee");
                    break;

                case 7: // omanRial
                    dollar = amount * 2.60;
                    System.out.println(amount + "omanRial = " + f.format(dollar) + " Dollar");

                    euro = amount * 2.42;
                    System.out.println(amount + "omanRial = " + f.format(euro) + " Euro");

                    pound = amount * 2.05;
                    System.out.println(amount + "omanRial = " + f.format(pound) + " Pound");

                    canadianDollar = amount * 3.30;
                    System.out.println(amount + "omanRial = " + f.format(canadianDollar) + " CanadianDollar");

                    swissFranc = amount * 2.48;
                    System.out.println(amount + "omanRial = " + f.format(swissFranc) + " SwissFranc");

                    jordanianDinar = amount * 1.84;
                    System.out.println(amount + "omanRial = " + f.format(jordanianDinar) + "JordanianDinar");

                    kuwaitiDinar = amount * 0.79;
                    System.out.println(amount + "omanRial = " + f.format(kuwaitiDinar) + " KuwaitiDinar");

                    nepaliRupee = amount * 321.58;
                    System.out.println(amount + "omanRial = " + f.format(nepaliRupee) + " NepaliRupee");
                    break;

                case 8: //kuwaitiDinar
                    dollar = amount * 3.27;
                    System.out.println(amount + "kuwaitiDinar = " + f.format(dollar) + " Dollar");

                    euro = amount * 3.04;
                    System.out.println(amount + "kuwaitiDinar = " + f.format(euro) + " Euro");

                    pound = amount * 2.59;
                    System.out.println(amount + "kuwaitiDinar = " + f.format(pound) + " Pound");

                    canadianDollar = amount * 4.15;
                    System.out.println(amount + "kuwaitiDinar = " + f.format(canadianDollar) + " CanadianDollar");

                    swissFranc = amount * 3.13;
                    System.out.println(amount + "kuwaitiDinar = " + f.format(swissFranc) + " SwissFranc");

                    jordanianDinar = amount * 2.32;
                    System.out.println(amount + "kuwaitiDinar = " + f.format(jordanianDinar) + "JordanianDinar");

                    omaniRial = amount * 1.26;
                    System.out.println(amount + "kuwaitiDinar = " + f.format(omaniRial) + "OmaniRial");

                    nepaliRupee = amount * 404.95;
                    System.out.println(amount + "kuwaitiDinar = " + f.format(nepaliRupee) + " NepaliRupess");
                    break;

                case 9: //nepaliRupeee conversion
                    dollar = amount * 0.0081;
                    System.out.println(amount + "nepaliRupeee = " + f.format(dollar) + " Dollar");

                    euro = amount * 0.0075;
                    System.out.println(amount + "nepaliRupeee = " + f.format(euro) + " Euro");

                    pound = amount * 0.0064;
                    System.out.println(amount + "nepaliRupeee = " + f.format(pound) + " Pound");

                    canadianDollar = amount * 0.010;
                    System.out.println(amount + "nepaliRupeee = " + f.format(canadianDollar) + " CanadianDollar");

                    swissFranc = amount * 0.0077;
                    System.out.println(amount + "nepaliRupeee = " + f.format(swissFranc) + " SwissFranc");

                    jordanianDinar = amount * 0.0057;
                    System.out.println(amount + "nepaliRupeee = " + f.format(jordanianDinar) + "JordanianDinar");

                    omaniRial = amount * 0.0031;
                    System.out.println(amount + "kuwaitiDinar = " + f.format(omaniRial) + "OmaniRial");

                    kuwaitiDinar = amount * 0.0025;
                    System.out.println(amount + "nepaliRupeee = " + f.format(kuwaitiDinar) + " KuwaitiDinar");
                    break;

                default:
                    System.out.println("Invalid Input");


            }
            System.out.println("do you want to convert other amount? 1- Yes, 2- No");
            answer = sc.nextInt();
        }while (answer == 1);

        System.out.println("see you");
    }
}