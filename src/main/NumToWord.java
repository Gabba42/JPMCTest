
import java.util.Scanner;

public class NumToWord {

        public static final String[] twoDigit = {
                "",
                "Ten",
                "Twenty",
                "Thirty",
                "Forty",
                "Fifty",
                "Sixty",
                "Seventy",
                "Eighty",
                "Ninety"
        };

        public static final String[] oneDigit = {
                "",
                "One",
                "Two",
                "Three",
                "Four",
                "Five",
                "Six",
                "Seven",
                "Eight",
                "Nine",
                "Ten",
                "Eleven",
                "Twelve",
                "Thirteen",
                "Fourteen",
                "Fifteen",
                "Sixteen",
                "Seventeen",
                "Eighteen",
                "Nineteen"
        };

        public static StringBuilder stringRepOfNumber = new StringBuilder();

        public static String convertNumberToStringEquivalent(int number) {
            String input = Integer.toString(number);
            int numberLength = input.length();
            if (numberLength == 1) {
                stringRepOfNumber.append(oneDigit[number] + "Dollar");
            }

            if (numberLength == 2) {
                if(number < 20)
                    stringRepOfNumber.append(oneDigit[number] + "Dollars");
                else
                {
                    stringRepOfNumber.append(twoDigit[number/10]);
                    stringRepOfNumber.append(oneDigit[number%10] + "Dollars");
                }
            }

            if (numberLength == 3) {
                stringRepOfNumber.append(oneDigit[number/100]);
                stringRepOfNumber.append("Hundred");
                number= number%100;
                if(number < 20) {
                    stringRepOfNumber.append(oneDigit[number] + "Dollars");
                }
                else {
                    stringRepOfNumber.append(twoDigit[number/10]);
                    stringRepOfNumber.append(oneDigit[number%10] + "Dollars");
                }
            }

            if (numberLength > 3 && numberLength <= 6) {
                    //thousand
                    stringRepOfNumber.append(oneDigit[number/1000]);
                    stringRepOfNumber.append("Thousand");
                    number= number%1000;

                    //hundred
                    stringRepOfNumber.append(oneDigit[number/100]);
                    stringRepOfNumber.append("Hundred");
                    number= number%100;

                    if(number < 20) {
                        stringRepOfNumber.append(oneDigit[number] + "Dollars");
                    }
                    else {
                        stringRepOfNumber.append(twoDigit[number/10]);
                        stringRepOfNumber.append(oneDigit[number%10] + "Dollars");
                    }
            }

            if (numberLength > 6 && numberLength <= 9)  {
                convertNumberToStringEquivalent(number/1000000);
                stringRepOfNumber.append(" million");
                convertNumberToStringEquivalent(number%1000000);
            }

            if (numberLength > 9 && numberLength <= 12) {
                convertNumberToStringEquivalent(number/1000000000);
                stringRepOfNumber.append(" billion");
                convertNumberToStringEquivalent(number%1000000000);
            }
            return stringRepOfNumber.toString();
        }
        public static void main (String[] args) {
            Scanner sc =new Scanner(System.in);

            System.out.println("Enter up to 12 digit num: ");
            int num= sc.nextInt();
            System.out.println(num);

            convertNumberToStringEquivalent(num);
            System.out.println(stringRepOfNumber);
        }
    }