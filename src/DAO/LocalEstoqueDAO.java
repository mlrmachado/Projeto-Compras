package DAO;

import conexao.Conexao;
import model.LocalEstoque;

import java.sql.PreparedStatement;

public class LocalEstoqueDAO {

    public void salvar (LocalEstoque localEstoque) throws Exception {

        String sql = "INSERT INTO(NR_SEQUENCIA, DS_LOCAL_ESTOQUE, CD_CENTRO_CUSTO) LOCAL_ESTOQUE VALUES (?,?,?)";
        PreparedStatement pst = Conexao.conn.prepareStatement(sql);
        pst.setLong(1, localEstoque.getNrSequencia());
        pst.setString(2, localEstoque.getDsLocalEstoque());
        pst.setLong(3, localEstoque.getCdCentroCusto());
    }

}
