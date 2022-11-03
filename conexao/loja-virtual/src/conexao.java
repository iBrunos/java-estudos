import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class conexao {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/loja_virtual?useTimezone=true&serverTimezone=UTC", "root","1234");


        Statement stm = connection.createStatement();
        stm.execute("CREATE TABLE IF NOT EXISTS tbl_produtos(id INT AUTO_INCREMENT primary key NOT NULL, nome varchar(50) NOT NULL, descricao varchar(2000)) ");



        System.out.println("Fechando conexão!");
        connection.close();
       
    }
}
