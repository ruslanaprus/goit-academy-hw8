package Exercises;
import org.apache.commons.validator.routines.EmailValidator;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.StringTokenizer;

public class EmailDetector {

    public boolean isPresentOne(String text) {
        String[] words = text.split("\\s+");
        for (String word : words) {
            int atIndex = word.indexOf("@");
            if (atIndex > 2 && word.length() >= 5) {
                return true;
            }
        }
        return false;
    }

    // trying to use StringTokenizer as alternative to regex, and it is 3 times quicker than previous solution
    public boolean isPresentTwo(String text) {
        StringTokenizer strTokenizer = new StringTokenizer(text);
        while (strTokenizer.hasMoreTokens()) {
            String word = strTokenizer.nextToken();
            int atIndex = word.indexOf("@");
            if (atIndex > 2 && word.length() >= 5) {
                return true;
            }
        }
        return false;
    }

    public boolean isPresentThree(String text) {
        String[] words = text.split("\\s+");
        for (String word : words) {
            if (EmailValidator.getInstance().isValid(word)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPresentFour(String text) {
        String[] words = text.split("\\s+");
        for (String word : words) {
            InternetAddress emailAddr = null;
            try {
                emailAddr = new InternetAddress(word);
                emailAddr.validate();
                return true;
            } catch (AddressException e) {
                //do nothing
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresentOne("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresentOne("No email present, but @ there"));

        //true
        System.out.println(new EmailDetector().isPresentTwo("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresentTwo("No email present, but @ there"));

        //true
        System.out.println(new EmailDetector().isPresentThree("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresentThree("No email present, but @ there"));

        //true
        System.out.println(new EmailDetector().isPresentFour("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresentFour("No email present, but @ there"));

    }
}
