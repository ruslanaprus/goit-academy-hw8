package examples.inner;

public class FruitBasket {
    private int appleCount;
    private int orangeCount;
    private int strawberryCount;

    @Override
    public String toString() {
        return "FruitBasket{" +
                "appleCount=" + appleCount +
                ", orangeCount=" + orangeCount +
                ", strawberryCount=" + strawberryCount +
                '}';
    }

    public class FruitBasketSetup{
        public FruitBasketSetup(int appleCount, int orangeCount, int strawberryCount){
            FruitBasket.this.appleCount = appleCount;
            FruitBasket.this.orangeCount = orangeCount;
            FruitBasket.this.strawberryCount = strawberryCount;
        }
    }

    public class Number1Setup extends FruitBasketSetup{
        public Number1Setup(){
            super(5, 7, 9);
        }
    }

    public class Number2Setup extends FruitBasketSetup{
        public Number2Setup(){
            super(10, 15, 20);
        }
    }

    public void number1(){
        new Number1Setup();
    }

    public void number2(){
        new Number2Setup();
    }

    public static void main(String[] args) {
        FruitBasket fruitCase = new FruitBasket();
        System.out.println("fruitCase = " + fruitCase);

        fruitCase.number1();

        System.out.println("fruitCase = " + fruitCase);
    }

}
