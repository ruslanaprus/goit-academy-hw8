package Exercises;

public class MathDetector {

    public boolean isMath(String text){
        String symbols = "=+-*/";
        int countDigits = 0;
        int countSymbols = 0;
        for(char c : text.toCharArray()) {
            if( c >= '0' && c<= '9') {
                countDigits++;
            } else if(symbols.contains(String.valueOf(c))) {
                countSymbols++;
            }
        }
        return countSymbols > 0 && countDigits > 1;
    }

    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));

        //false
        System.out.println(new MathDetector().isMath("o-a=2"));
    }
}
