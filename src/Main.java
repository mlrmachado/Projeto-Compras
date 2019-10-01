import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo");
        try {
            String driver = "oracle.jdbc.OracleDriver";
            String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
            String user = "buysystem";
            String senha = "admin";

            Class.forName(driver);
            System.out.println("Driver carregado");

            Connection conn = DriverManager.getConnection(url, user, senha);

            Statement stmt = conn.createStatement();

            String sql = "SELECT NR_SEQUENCIA, NM_ITEM FROM ITEM ";

            ResultSet res = stmt.executeQuery(sql);

            //res.next();
            System.out.println(res);

            long nrSequencia;
            String nmItem;

            res.getMetaData();

            List list = retornaBancoAsList(res);
            while (res.next()) {
                nrSequencia = res.getLong("NR_SEQUENCIA");
                nmItem = res.getString("NM_ITEM");
                System.out.println("ROW = " + nrSequencia + ": " + nmItem);
            }

            System.out.println("Conectou ao banco");
       }catch (Exception e) {
            System.out.println("Erro ao carregar driver" +e);
        }
    }

    public static List<HashMap<String,Object>> retornaBancoAsList(ResultSet rs) throws SQLException {
        ResultSetMetaData md = rs.getMetaData();
        int columns = md.getColumnCount();
        List<HashMap<String,Object>> list = new ArrayList<HashMap<String,Object>>();

        while (rs.next()) {
            HashMap<String,Object> row = new HashMap<String, Object>(columns);
            for(int i=1; i<=columns; ++i) {
                row.put(md.getColumnName(i),rs.getObject(i));
            }
            list.add(row);
        }

        return list;
    }


}

