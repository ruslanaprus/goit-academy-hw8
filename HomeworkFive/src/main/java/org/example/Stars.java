package org.example;

class Stars {
    private int count;

    public void setCount(int count){
        this.count = count;
    }

    public int getCount(){
        return count;
    }

    @Override
    public String toString(){
        int[] digitArray = new int[4];
        int counter = 3;

        while (count > 0) {
            digitArray[counter] = (count % 10);
            count = count / 10;
            counter--;
        }
        String res = "";
        for(int i = 0; i < digitArray.length; i++){
            if(i == 0 && digitArray[i] != 0) res += "X".repeat(digitArray[i]);
            if(i == 1 && digitArray[i] != 0) res += "Y".repeat(digitArray[i]);
            if(i == 2 && digitArray[i] != 0) res += "Z".repeat(digitArray[i]);
            if(i == 3 && digitArray[i] != 0) res += "*".repeat(digitArray[i]);
        }
        return res;
    }
}

