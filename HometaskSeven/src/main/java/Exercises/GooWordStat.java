package Exercises;

public class GooWordStat {
    private final String word;
    private final int freq;

    public GooWordStat(String word, int freq){
        this.word = word;
        this.freq = freq;
    }

    public String getWord(){
        return word;
    }

    public int getFreq(){
        return freq;
    }

    @Override
    public String toString(){
        String frequency = "";
        if (freq < 1000) frequency = "LOW";
        else if (freq < 100000) frequency = "MEDIUM";
        else if (freq < 10000000) frequency = "HIGH";
        else if (freq >= 10000000) frequency = "EXTRA HIGH";
        return "Word is [" + word + "], search freq is " + frequency + " " + freq;
    }

    public static void main(String[] args) {
        //Word is [human], search freq is LOW
        System.out.println(new GooWordStat("human", 10));

        //Word is [mars], search freq is MEDIUM
        System.out.println(new GooWordStat("mars", 10000));

        //Word is [mars], search freq is MEDIUM
        System.out.println(new GooWordStat("mars", 7149638));

        //Word is [space], search freq is HIGH
        System.out.println(new GooWordStat("space", 9965499));

        //Word is [life], search freq is EXTRA HIGH
        System.out.println(new GooWordStat("life", 564785654));
    }
}

