package org.example;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        System.out.println("DigitSplitter.getFirstDigit(42) = " + DigitSplitter.getFirstDigit(42));
        System.out.println("DigitSplitter.getSecondDigit(42) = " + DigitSplitter.getSecondDigit(42));
        System.out.println("getNameCode() = " + getNameCode("Ruslana"));
    }

    /*
    Коли житель планети Ексон хоче отримати код свого імені,
    він бере перший і останній символи зі свого імені,
    робить із них рядок, і наводить їх у верхній регістр.
    Отриманий рядок - це і є код імені.
     */
    public static String getNameCode(String name){
        return name.length() == 1 ? "" + name.toUpperCase().charAt(0) : "" + name.toUpperCase().charAt(0) + name.toUpperCase().charAt(name.length() - 1);
    }

    /*
    Деякі жителі Ексона беруть імена з невидимих на друку символів - пробіли (' '),
    перенесення рядка ('\n'), табуляції ('\t').
    Далі вони беруть кредити у банках, а оскільки ім'я невидиме –
    то банк потім не знає, з кого стягувати борг.
    Напиши програму, яка прийматиме ім'я, та повертатиме true,
    якщо ім'я формально не порожнє (довжина length() не дорівнює 0),
    але це ім'я складається лише з невидимих символів.
     */
    public boolean isInvisibleName(String name){
        return name.length() == 0 | name.contains(" ") | name.contains("'\u005c'");
    }

    /*
    Якщо в імені жителя Ексона є дві літери поспіль - 'n' та 'o',
    то таке ім'я вважається негативним і привертає надмірну увагу поліцейських.
    Тому ексонці часто роблять своє ім'я позитивним, замінюючи всі входження "no" на "yes".
    Враховується будь-який регістр літер 'n' та 'o'.
    Наприклад, імена Nomad, Henot, NORAK - це всі негативні імена.
     */
    public String makeNamePositive(String name){
        return name.replaceAll("(?i)no", "yes");
    }

    /*
    Напиши метод, який повертатиме половину імені.
    Якщо в імені непарна кількість букв, то остання літера не повертається.
     */
    public String makeHalfOfName(String name){
        return name.substring(0, name.length()/2);
    }
}

//class DigitSplitter{
//    public static int getFirstDigit(int number){
//        String a = Integer.toString(number);
//        return Character.getNumericValue(a.charAt(0));
//    }
//    public static int getSecondDigit(int number){
//        return number % 10;
//    }
//}

 class DigitSplitter{
     public static int getFirstDigit(int number){
         return (number - getSecondDigit(number)) / 10;
     }
     public static int getSecondDigit(int number){
         return number % 10;
     }
 }

// class DigitSplitter{
//     public static int getFirstDigit(int number){
//         String a = Integer.toString(number);
//         return (int)a.charAt(0) - '0';
//     }
//     public static int getSecondDigit(int number){
//         return number % 10;
//     }
// }

//class DigitSplitter {
//    public static int getFirstDigit(int number) {
//        return Stream.of(String.valueOf(number).split(""))
//                .mapToInt(Integer::parseInt)
//                .findFirst()
//                .orElse(-1);
//    }
//}