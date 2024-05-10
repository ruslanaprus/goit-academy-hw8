package immutable;

public class CustomStringBuilder {
    public static int MAX_SIZE = 16; //1024 * 1024 * 1024;

    private byte[] bytes = new byte[MAX_SIZE];

    private int length;

    public void append(int value) {
        append(Integer.toString(value));
    }

    public void append(String text) {
        byte[] textBytes = text.getBytes();

        if (length + textBytes.length > bytes.length) {
            System.out.println("Extend memory from " + bytes.length + " to " + (bytes.length * 2));

            byte[] copy = new byte[bytes.length * 2];

            System.arraycopy(bytes, 0, copy, 0, length);

            bytes = copy;
        }

        System.arraycopy(textBytes, 0, bytes, length, textBytes.length);
        length += textBytes.length;
    }

    @Override
    public String toString() {
        return new String(bytes, 0, length);
    }

    public static void main(String[] args) {
        CustomStringBuilder csb = new CustomStringBuilder();
        csb.append("kfhj1234fht6!");
        csb.append("jkgjj65");
        csb.append(987);

        System.out.println("csb = " + csb);
    }
}