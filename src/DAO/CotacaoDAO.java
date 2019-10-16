package DAO;

import conexao.Conexao;
import model.Cotacao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class CotacaoDAO {

    Connection conn = null;

    public void salvar (Cotacao cotacao) throws Exception {

        String sql = "INSERT INTO(NR_SEQUENCIA, " +
                "FORNECEDOR, " +
                "COMPRADOR, " +
                "CD_MATERIAL, " +
                "NR_QUANTIDADE, " +
                "MARCA, " +
                "PRECO, " +
                "CD_ESTOQUE, " +
                "TIPO_PAGAMENTO, " +
                "CD_CENTRO_CUSTO, " +
                "DT_ENTREGA_SOLIC, " +
                "DT_ENTREGA_FORNEC, " +
                "IE_FRETE, " +
                "OBSERVACAO, " +
                "CD_TENS_VENCEDORES) " +
                "COTACAO VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst = Conexao.conn.prepareStatement(sql);
        pst.setLong(1, cotacao.getNrSequencia());
        pst.setLong(2, cotacao.getFornecedor());
        pst.setLong(3, cotacao.getComprador());
        pst.setLong(4, cotacao.getCdMaterial());
        pst.setLong(5, cotacao.getNrQuantidade());
        pst.setString(6, cotacao.getMarca());
        pst.setDouble(7, cotacao.getPreco());
        pst.setLong(8, cotacao.getCdEstoque());
        pst.setLong(9, cotacao.getTipoPagamento());
        pst.setLong(10, cotacao.getCdCentroCusto());
        pst.setDate(11, (Date) cotacao.getDtEntregaSolic());
        pst.setDate(12, (Date) cotacao.getDtEntregaFornec());
        pst.setString(13, cotacao.getIeFrete().getValor());
        pst.setString(14, cotacao.getObservacao());
        pst.setLong(15, cotacao.getCdItensVencedores());
    }
}
