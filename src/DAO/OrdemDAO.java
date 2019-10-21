package DAO;

import conexao.Conexao;
import model.Ordem;

import java.sql.PreparedStatement;

public class OrdemDAO {

    public void salvar (Ordem ordem) throws Exception {

        String sql = "INSERT INTO(NR_SEQUENCIA, " +
                "CD_COMPRADOR, " +
                "CD_FORNECEDOR, " +
                "CD_MATERIAL, " +
                "NR_QUANTIDADE, " +
                "PRECO_MATERIAL, " +
                "DT_ENTREGA, " +
                "CD_MARCA, " +
                "CD_ESTOQUE, " +
                "CD_CENTRO_CUSTO, " +
                "OBSERVACAO, " +
                "CD_MOTIVO ) ORDEM VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst = Conexao.conn.prepareStatement(sql);
        pst.setLong(1, ordem.getNrSequencia());
        pst.setLong(2, ordem.getCdComprador());
        pst.setLong(3, ordem.getCdFornecedor());
        pst.setLong(4, ordem.getCdMaterial());
        pst.setLong(5, ordem.getNrQuantidade());
        pst.setDouble(6, ordem.getPrecoMaterial());
        pst.setDate(7, ordem.setDtEntrega(););
        pst.setLong(8, ordem.getCdMarca());
        pst.setLong(9, ordem.getCdEstoque());
        pst.setLong(10, ordem.getCdCentroCusto());
        pst.setString(11, ordem.getObservacao());
        pst.setLong(12, ordem.getCdMotivo());
        pst.executeUpdate();

    }
}
