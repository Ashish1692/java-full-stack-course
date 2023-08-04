package workjavapkg;


import java.sql.*;

public class Mysql {

    public static void main(String[] args) throws SQLException{
        // JDBC URL, user_name, and password
        String jdbcUrl = "jdbc:mysql://localhost:3306/mysql_learn";
        String username = "root";
        String password = "mysqlashish";

        Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
        try {
            // Register the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

         // Create a statement object
            Statement statement = connection.createStatement();

            // Execute the SELECT query
            String sqlQuery = "SELECT * FROM test";
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            // Process the result set
            while (resultSet.next()) {
                // Assuming your_table_name has columns 'column1' and 'column2'
                String column1Value = resultSet.getString("id");
                String column2Value = resultSet.getString("name");
                System.out.println("id: " + column1Value + ", name: " + column2Value);
            }

            // Close the resources
            resultSet.close();
            statement.close();

            System.out.println("Connected to MySQL database!");
			// Perform database operations here

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found!");
            e.printStackTrace();
        } finally {
            connection.close();

        }
    }
}
