import java.sql.*;

public class Atividade4JDBC {

    private static final String URL = "jdbc:mysql://localhost:3306/poo_db";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void buscarEExibirUsuarios() {
        String sql = "SELECT id, nome, email FROM usuarios";

        try (Connection conn = conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("Resultados da consulta:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + 
                                   ", Nome: " + rs.getString("nome") + 
                                   ", Email: " + rs.getString("email"));
            }
        } catch (SQLException e) {
            System.err.println("Erro na conexão ou consulta: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Atividade4JDBC().buscarEExibirUsuarios();
    }
}
