package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection conn = null;

    public static void Conectar() {

        try {
            String driver = "oracle.jdbc.OracleDriver";
            String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
            String user = "buysystem";
            String senha = "admin";

            Class.forName(driver);
            System.out.println("Driver carregado");

            conn = DriverManager.getConnection(url, user, senha);
        } catch (Exception e) {
            System.out.println("Erro ao carregar driver" + e);

        }

    }

}
