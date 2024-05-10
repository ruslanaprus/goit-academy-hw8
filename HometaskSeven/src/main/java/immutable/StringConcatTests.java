package immutable;

public class StringConcatTests {
    public static void main(String[] args) {
        StringBuilder sb;
        CustomStringBuilder result = new CustomStringBuilder();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            result.append(i);
        }

        String str = result.toString();

        long end = System.currentTimeMillis();

        System.out.println("(end - start) = " + (end - start));
        System.out.println("str.length() = " + str.length()/1024/1024);

    }
}