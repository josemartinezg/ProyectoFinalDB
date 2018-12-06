package logical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class MySQLAccess {
	
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public void readDataBase() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connect = DriverManager.getConnection("jdbc:mysql://localhost/trabajofinaldb", "chema", "Nom@sde16");
            statement = connect.createStatement();

            resultSet = statement
                    .executeQuery("select * from trabajofinaldb.persona");
            writeResultSet(resultSet);
            preparedStatement = connect
            		.prepareStatement("insert into trabajofinaldb.persona values (?, ?, ?, ?, ? , ?, ?, ?, ?)");

            preparedStatement.setString(1, "PER00006");
            preparedStatement.setString(2, "Jose");
            preparedStatement.setString(3, "Manuel");
            preparedStatement.setString(4, "Martinez");
            preparedStatement.setString(5, "Garcia");
            preparedStatement.setString(6, "1996-12-03");
            preparedStatement.setString(7, "M");
            preparedStatement.setString(8, "RepDom");
            preparedStatement.setString(9, "40224697957");
            preparedStatement.executeUpdate();

            preparedStatement = connect
                    .prepareStatement("SELECT ID_Persona, P_Nombre, S_Nombre, P_Apellido, S_Apellido, Fecha_Nacimiento, Genero, Pais, Cedula from trabajofinaldb.persona");
            resultSet = preparedStatement.executeQuery();
            writeResultSet(resultSet);

            /*// Remove again the insert comment
            preparedStatement = connect
            .prepareStatement("delete from feedback.comments where myuser= ? ; ");
            preparedStatement.setString(1, "Test");
            preparedStatement.executeUpdate();*/

            resultSet = statement
            .executeQuery("select * from trabajofinaldb.persona");
            writeMetaData(resultSet);

        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }

    }

    private void writeMetaData(ResultSet resultSet) throws SQLException {
        //  Now get some metadata from the database
        // Result set get the result of the SQL query

        System.out.println("The columns in the table are: ");

        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
            System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
        }
    }

    private void writeResultSet(ResultSet resultSet) throws SQLException {
        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            // It is possible to get the columns via name
            // also possible to get the columns via the column number
            // which starts at 1
            // e.g. resultSet.getSTring(2);
            String ID_Persona = resultSet.getString("ID_Persona");
            String P_Nombre = resultSet.getString("P_Nombre");
            String S_Nombre = resultSet.getString("S_Nombre");
            String P_Apellido = resultSet.getString("P_Apellido");
            String S_Apellido = resultSet.getString("S_Apellido");
            String Fecha_Nacimiento = resultSet.getString("Fecha_Nacimiento");
            String Genero = resultSet.getString("Genero");
            System.out.println("ID_Persona" + ID_Persona);
            System.out.println("P_Nombre: " + P_Nombre);
            System.out.println("P_Apellido: " + P_Apellido);
            System.out.println("Fecha_Nacimiento: " + Fecha_Nacimiento);
            System.out.println("Genero: " + Genero);
        }
    }

    // You need to close the resultSet
    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }

}
