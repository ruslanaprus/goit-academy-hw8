package Exercises;

import org.apache.commons.lang3.StringUtils;

public class WordCombine {
    public boolean canCombineOne(String sourceWord, String targetWord){
        for(char tw : targetWord.toLowerCase().toCharArray()){
            if(sourceWord.toLowerCase().contains(String.valueOf(tw))){
                return true;
            }
        }
        return false;
    }

    // alternative implementation with StringUtils - have to be imported from apache
    public boolean canCombineTwo(String sourceWord, String targetWord) {
        for(char tw : targetWord.toCharArray()){
            if(StringUtils.containsIgnoreCase(sourceWord, String.valueOf(tw))){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombineOne("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombineOne("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombineOne("War", "Piece"));

        //true
        System.out.println(new WordCombine().canCombineOne("vicxauyr", "XARUVY"));
    }
}
