package DAO;

import conexao.Conexao;
import model.Setor;

import java.sql.PreparedStatement;

public class SetorDAO {

    public void salvar (Setor setor) throws Exception {

        String sql = "INSERT INTO(NR_SEQUENCIA, DS_SETOR, CD_CENTRO_CUSTO, CD_LOCAL_ESTOQUE) SETOR VALUES (?,?,?,?)";
        PreparedStatement pst = Conexao.conn.prepareStatement(sql);
        pst.setLong(1, setor.getNrSequencia());
        pst.setString(2, setor.getDsSetor());
        pst.setLong(3, setor.getCdCentroCusto());
        pst.setLong(4, setor.getCdLocalEstoque());
        pst.executeUpdate();
    }
}
