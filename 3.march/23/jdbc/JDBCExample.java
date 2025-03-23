import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

package jdbc;

public class jdbc {
    public static void main(String[] args) {
        System.out.println("Hello, JDBC!");
    }
}
try {
    // Load the JDBC driver
    Class.forName("com.mysql.cj.jdbc.Driver");

    // Establish the connection
    String url = "jdbc:mysql://localhost:3306/your_database";
    String username = "your_username";
    String password = "your_password";
    Connection connection = DriverManager.getConnection(url, username, password);

    System.out.println("Connection established successfully!");

    // Close the connection
    connection.close();
} catch (ClassNotFoundException e) {
    System.out.println("JDBC Driver not found: " + e.getMessage());
} catch (SQLException e) {
    System.out.println("SQL Exception: " + e.getMessage());
}
Here’s a basic JDBC (Java Database Connectivity) tutorial to help you get started:

### What is JDBC?
JDBC is an API that allows Java applications to interact with databases. It provides a standard interface for connecting to relational databases, executing SQL queries, and processing results.

### Step 1: Set Up the Environment
1. **Install JDK**: Make sure you have the Java Development Kit (JDK) installed on your system. You can download it from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
   
2. **Set Up a Database**: You’ll need a database for connecting via JDBC. You can use databases like MySQL, PostgreSQL, or H2 for testing.

   - Download and install [MySQL](https://dev.mysql.com/downloads/installer/).
   - Alternatively, you can use an in-memory database like H2 for easier setup.

3. **Add JDBC Driver**: To connect to a specific database, you'll need the respective JDBC driver. For MySQL, you can use the MySQL Connector/J, and for PostgreSQL, use the PostgreSQL JDBC driver. These are typically JAR files that need to be added to your project.

### Step 2: Basic JDBC Steps

1. **Import JDBC Packages**:
   You need to import the necessary packages in your Java code.
   ```java
   import java.sql.*;
   ```

2. **Establish a Connection**:
   You can establish a connection to the database using the `DriverManager` class.
   ```java
   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourDatabase", "username", "password");
   ```

   - Replace `localhost` with your database host.
   - Replace `yourDatabase` with the name of the database you want to connect to.
   - Replace `username` and `password` with your database credentials.

3. **Create a Statement Object**:
   To send SQL commands to the database, you need to create a `Statement` object.
   ```java
   Statement stmt = conn.createStatement();
   ```

4. **Execute Queries**:
   You can execute SQL queries using the `executeQuery` (for SELECT statements) or `executeUpdate` (for INSERT, UPDATE, DELETE) methods.
   - For SELECT:
     ```java
     ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
     ```
   - For INSERT:
     ```java
     int rowsAffected = stmt.executeUpdate("INSERT INTO employees (name, age) VALUES ('John', 30)");
     ```

5. **Process the Result Set** (for SELECT queries):
   After executing a SELECT query, you will receive a `ResultSet` object. You can loop through it to fetch results.
   ```java
   while (rs.next()) {
       int id = rs.getInt("id");
       String name = rs.getString("name");
       int age = rs.getInt("age");
       System.out.println(id + " " + name + " " + age);
   }
   ```

6. **Close the Connection**:
   It's essential to close your database resources (connection, statement, result set) after use to avoid memory leaks.
   ```java
   rs.close();
   stmt.close();
   conn.close();
   ```

### Example: Complete Code
```java
import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        // Step 1: Establish a connection
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password")) {
            // Step 2: Create a Statement
            Statement stmt = conn.createStatement();
            
            // Step 3: Execute a Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
            
            // Step 4: Process the Result Set
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println(id + " " + name + " " + age);
            }
            
            // Step 5: Close resources (this happens automatically with try-with-resources)
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```

### Step 3: Error Handling
JDBC operations might throw `SQLException`. Be sure to handle it properly:
```java
catch (SQLException e) {
    System.out.println("Database error: " + e.getMessage());
}
```

### Step 4: Using PreparedStatement for Safety (Optional but Recommended)
To avoid SQL injection and make the code more efficient, you can use `PreparedStatement` instead of `Statement`.

Example with `PreparedStatement`:
```java
String query = "INSERT INTO employees (name, age) VALUES (?, ?)";
PreparedStatement pstmt = conn.prepareStatement(query);
pstmt.setString(1, "John");
pstmt.setInt(2, 30);
int rowsAffected = pstmt.executeUpdate();
```

### Final Notes:
- Always handle exceptions to ensure that your program doesn’t crash unexpectedly.
- Always close database resources (connections, statements, result sets) to prevent resource leaks.

This should get you started with JDBC. Feel free to ask if you need further clarification!
