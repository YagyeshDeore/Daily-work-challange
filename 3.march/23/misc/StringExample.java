/* 1. Strings in Java */
public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("World");
        String str3 = str1 + " " + str2;
        System.out.println(str3);
    }
}

/* 2. Recursion in Java */
public class RecursionExample {
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
    }
}

/* 3. Regular Expressions */
import java.util.regex.*;
public class RegexExample {
    public static void main(String[] args) {
        String text = "Hello, my number is 12345";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Found number: " + matcher.group());
        }
    }
}

/* 4. Serialization in Java */
import java.io.*;
class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class SerializationExample {
    public static void main(String[] args) {
        try {
            // Serialization
            Person p = new Person("Alice", 25);
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(p);
            out.close();
            fileOut.close();
            System.out.println("Object serialized");
            
            // Deserialization
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Person newPerson = (Person) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Deserialized Person: " + newPerson.name + ", Age: " + newPerson.age);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/* 8. Java 8 Features */
import java.util.*;
import java.util.stream.*;
public class Java8Features {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
    }
}

/* 9. Java 9 Features */
import java.util.*;
public class Java9Features {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Cherry");
        list.forEach(System.out::println);
    }
}

/* 16. Java 17 Features */
public class Java17Features {
    public static void main(String[] args) {
        System.out.println("Java 17 - Sealed classes, Pattern Matching for switch");
    }
}

/* 17. Java 18 Features */
public class Java18Features {
    public static void main(String[] args) {
        System.out.println("Java 18 - UTF-8 as default, Simple Web Server");
    }
}

/* 18. Java 19 Features */
public class Java19Features {
    public static void main(String[] args) {
        System.out.println("Java 19 - Virtual Threads, Structured Concurrency");
    }
}

/* 19. Java 20 Features */
public class Java20Features {
    public static void main(String[] args) {
        System.out.println("Java 20 - Scoped Values, Record Patterns");
    }
}

/* 20. Java 21 Features */
public class Java21Features {
    public static void main(String[] args) {
        System.out.println("Java 21 - Unnamed Classes and Instance Main Methods");
    
    }
}
