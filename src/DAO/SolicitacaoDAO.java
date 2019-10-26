package DAO;

import conexao.Conexao;
import model.Solicitacao;

import java.sql.Date;
import java.sql.PreparedStatement;

public class SolicitacaoDAO {

    public void salvar ( Solicitacao solicitacao) throws Exception {

        String sql = "INSERT INTO(NR_SEQUENCIA, " +
                "SOLICITANTE_SOLICITACAO, " +
                "CD_MATERIAL, " +
                "NR_QUANTIDADE, " +
                "DT_PEDIDO, " +
                "DT_ENTREGA, " +
                "CD_ESTOQUE, " +
                "CD_CENTRO_CUSTO, " +
                "IE_SITUACAO, " +
                "MARCA, " +
                "OBSERVACAO, " +
                "CD_MOTICO) SOLICITACAO_COMPRA VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst = Conexao.conn.prepareStatement(sql);
        pst.setLong(1, solicitacao.getNrSequencia());
        pst.setString(2, solicitacao.getSolicitanteSolicitacao());
        pst.setLong(3, solicitacao.getCdMaterial());
        pst.setLong(4, solicitacao.getNrQuantidade());
        pst.setDate(5, (Date) solicitacao.getDtPedido());
        pst.setDate(6, (Date) solicitacao.getDtEntrega());
        pst.setLong(7, solicitacao.getCdEstoque());
        pst.setLong(8, solicitacao.getCdCentroCusto());
        pst.setString(9, solicitacao.getIeSituacao().getValor());
        pst.setString(10, solicitacao.getMarca());
        pst.setString(11, solicitacao.getObservacao());
        pst.setLong(12, solicitacao.getCdMotivo());
        pst.executeUpdate();

    }
}
