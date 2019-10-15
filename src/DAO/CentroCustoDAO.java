package DAO;

import conexao.Conexao;
import model.CentroCusto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class CentroCustoDAO {

    Connection conn = null;

    public void salvar (CentroCusto centroCusto) throws Exception{

        String sql = "INSERT INTO(NR_SEQUENCIA, DS_CENTRO_CUSTO) CENTRO_CUSTO VALUES (?,?)";
        PreparedStatement pst = Conexao.conn.prepareStatement(sql);
        pst.setLong(1, centroCusto.getNrSequencia());
        pst.setString(2, centroCusto.getDsCentroCusto());
        pst.executeUpdate();


    }

}
