import DAO.CentroCustoDAO;
import conexao.Conexao;
import model.CentroCusto;
import model.Solicitacao;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo");
        try {

            Conexao.Conectar();

            Statement stmt = Conexao.conn.createStatement();

            String sql = "SELECT NR_SEQUENCIA, NM_ITEM FROM ITEM ";

            ResultSet res = stmt.executeQuery(sql);

            //res.next();
            System.out.println(res);

            long nrSequencia;
            String nmItem;

            res.getMetaData();

            CentroCusto centroCusto = new CentroCusto();
            centroCusto.setNrSequencia(1);
            centroCusto.setDsCentroCusto("Compras");
            centroCusto.salvar();

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

