/* 1. Command-Line Arguments */
public class CommandLineExample {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("Argument: " + arg);
        }
    }
}

/* 2. Lambda Expressions */
import java.util.*;
public class LambdaExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        list.forEach(s -> System.out.println(s));
    }
}

/* 3. Sending Email (Requires JavaMail API) */
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail {
    public static void main(String[] args) {
        String to = "receiver@example.com";
        String from = "sender@example.com";
        String host = "smtp.example.com";
        
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        Session session = Session.getDefaultInstance(properties);
        
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Test Mail");
            message.setText("Hello, this is a test email.");
            Transport.send(message);
            System.out.println("Email sent successfully.");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}

/* 4. Applet Basics */
import java.applet.Applet;
import java.awt.Graphics;

public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, Applet!", 50, 50);
    }
}
/* To run this, create an HTML file: */
/* <applet code="SimpleApplet.class" width="300" height="300"></applet> */

/* 5. Javadoc Comments */
/**
 * This class demonstrates Javadoc comments.
 */
public class JavadocExample {
    /**
     * Adds two numbers.
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }
}

/* 6. Autoboxing and Unboxing */
public class AutoBoxingExample {
    public static void main(String[] args) {
        Integer i = 10; // Autoboxing
        int j = i; // Unboxing
        System.out.println("Value: " + j);
    }
}

/* 7. File Mismatch Method (Java 12) */
import java.nio.file.*;
import java.io.*;

public class FileMismatchExample {
    public static void main(String[] args) throws IOException {
        Path file1 = Paths.get("file1.txt");
        Path file2 = Paths.get("file2.txt");
        long mismatch = Files.mismatch(file1, file2);
        System.out.println(mismatch == -1 ? "Files are identical" : "Files differ at byte position " + mismatch);
    }
}

/* 8. REPL (JShell) - Run these commands in JShell */
// jshell
// int x = 10;
// System.out.println(x);

/* 9. Multi-Release JAR Files (Java 9) */
// Use the `jar` tool to create different versions of classes for different Java versions

/* 10. Private Interface Methods (Java 9) */
interface MyInterface {
    private void privateMethod() {
        System.out.println("Private Method");
    }
    default void callPrivateMethod() {
        privateMethod();
    }
}

/* 11. Optional Class */
import java.util.Optional;
public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        System.out.println(optional.orElse("Default Value"));
    }
}

/* 12. Pattern Matching (Java 16) */
public class PatternMatchingExample {
    public static void main(String[] args) {
        Object obj = "Hello";
        if (obj instanceof String s) {
            System.out.println("String length: " + s.length());
        }
    }
}

/* 13. Garbage Collection */
public class GarbageCollectionExample {
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected!");
    }
    public static void main(String[] args) {
        GarbageCollectionExample obj = new GarbageCollectionExample();
        obj = null;
        System.gc();
    }
}

/* 14. JIT Compiler */
// Java Just-In-Time (JIT) compiler optimizes bytecode at runtime to improve performance.
// No direct code for it; JVM handles it internally.

/* 15. Sealed Classes (Java 17) */
sealed class Animal permits Dog, Cat {}
final class Dog extends Animal {}
final class Cat extends Animal {}

/* 16. Record Classes (Java 14) */
public record Person(String name, int age) {}

/* 17. Hidden Classes (Java 15) */
// Used internally in frameworks; loaded dynamically using Lookup API.

/* 18. Compact Number Formatting (Java 12) */
import java.text.NumberFormat;
import java.util.Locale;
public class CompactNumberExample {
    public static void main(String[] args) {
        NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        System.out.println(fmt.format(1000)); // Output: 1K
    }
}

/* 19. Text Blocks (Java 13) */
public class TextBlockExample {
    public static void main(String[] args) {
        String text = """
            Hello,
            This is a text block.
            """;
        System.out.println(text);
    }
}
