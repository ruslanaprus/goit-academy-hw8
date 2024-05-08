package Exercises;

public class DigitText {

    public boolean detect(String text){
       for (char c : text.toCharArray()){
           if (!Character.isDigit(c) && !Character.isWhitespace(c)) {
               return false;
           }
       }
       return true;
    }

//    public boolean detect(String text){
//        return text.matches("[0-9 ]*");
//    }

    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }

}
