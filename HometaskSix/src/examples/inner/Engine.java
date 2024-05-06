package examples.inner;

public class Engine {
    private String name;

    public Engine(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                '}';
    }

    public static class DieselEngine extends Engine{
        public DieselEngine(){
            super("Diesel");
        }
    }

    public static class ElectricEngine extends Engine{
        public ElectricEngine(){
            super("Electric");
        }
    }
}
