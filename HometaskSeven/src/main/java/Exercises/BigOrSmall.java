package Exercises;

public class BigOrSmall {

    public String calculate(String text){
        int count = 0;
        for (char c : text.toCharArray()){
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        if (count == text.length()/2){
            return "Same";
        } else if (count <= text.length()/2){
            return "Small";
        } else
        return "Big";
    }

    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}
