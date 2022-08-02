package org.message_app;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        DbConnection connection = new DbConnection();

        try{
            connection.getConnection();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}