package examples.singleton;

public class StorageWorker {
    public static void main(String[] args) {
        NumberStorage storage = NumberStorage.getInstance();

        storage.add(1);
        storage.add(5);
        storage.add(20);

        System.out.println("storage.getNumbers() = " + storage.getNumbers());

    }

}
