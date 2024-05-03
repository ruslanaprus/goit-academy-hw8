package examples;

public class InitialisingClass {
    public static void main(String[] args) {
        Cat cat = new Cat();
    }
}


class Animal {
    private Integer paws = 4;
    // Solution 2
    // public Integer paws = 4;

    public Animal() {
        System.out.println("Animal constructor");
        howManyPaws();
    }

    public void howManyPaws() {
        System.out.println(paws);
    }
}

class Cat extends Animal {
    private Integer paws = 4;
    //Solution 1
    // private static Integer paws = 4;

    public Cat() {
        System.out.println("Cat constructor");
    }

    /*
    Initialising of parent class goes first.
    Method howManyPaws() is overriden, so when we call howManyPaws() from parent constructor.
    we are actually calling method from the child class,
    and at his moment non-static field paws is not initialised yet,
    that's why method returns null
    Solution 1 - to make the field paws in child class static
    Solution 2 - to make the field paws in parent class public and
    use this field in method howManyPaws()
    Solution 3 - not to call from parent constructor method overriden in child class
     */
    @Override
    public void howManyPaws() {
        System.out.println("Cat howManyPaws method");
        System.out.println(paws);
        // Solution 2
        // System.out.println(super.paws);
    }
}

