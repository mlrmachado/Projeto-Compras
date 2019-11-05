package DAO;

import conexao.Conexao;
import model.CentroCusto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CentroCustoDAO {

    Connection conn = null;
    private final static String CREATE_TABLE = "create table Centro_Custo (\n" +
            "nr_sequencia integer,\n" +
            "ds_centro_custo varchar(25)\n" +
            ")";

    public void createTable() throws SQLException {
        PreparedStatement pst = Conexao.conn.prepareStatement(CREATE_TABLE);
        pst.executeQuery();
    }

    public void salvar (CentroCusto centroCusto) throws Exception {
        String sql = "INSERT INTO CENTRO_CUSTO (NR_SEQUENCIA, DS_CENTRO_CUSTO) VALUES (?,?)";
        PreparedStatement pst = Conexao.conn.prepareStatement(sql);
        pst.setLong(1, centroCusto.getNrSequencia());
        pst.setString(2, centroCusto.getDsCentroCusto());
        pst.executeUpdate();
    }

}
