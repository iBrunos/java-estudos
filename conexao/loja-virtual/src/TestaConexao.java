import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


import java.sql.ResultSet;

public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/loja_virtual?useTimezone=true&serverTimezone=UTC", "root","");


        Statement stm = connection.createStatement();
        stm.execute("CREATE TABLE IF NOT EXISTS tbl_produtos(id int NOT NULL AUTO_INCREMENT, nome varchar(50) NOT NULL, descricao varchar(2000))");


        stm.execute("INSERT INTO tbl_produtos, ");
        
        stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");

        ResultSet rst = stm.getResultSet();

            while(rst.next()){
                Integer id = rst.getInt("id");
                System.out.println(id);
                String nome = rst.getString("nome");
                System.out.println(nome);
                String descricao = rst.getString("decricao");
                System.out.println(descricao);

            }


        System.out.println("Fechando conexão!");

        connection.close();
       
    }
}
