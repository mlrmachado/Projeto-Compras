package DAO;

import conexao.Conexao;
import model.PessoaJuridica;

import java.sql.PreparedStatement;

public class PessoaJuridicaDAO {

    public void salvar (PessoaJuridica pessoaJuridica) throws Exception {

        String sql = "INSERT INTO(NR_SEQUENCIA, " +
                "CNPJ, " +
                "DS_RAZAO_SOCIAL, " +
                "DS_NOME_FANTASIA, " +
                "CD_CIDADE, " +
                "ENDERECO, " +
                "BAIRRO, " +
                "NUMERO, " +
                "CD_INSCRICAO_ESTADUAL) PESSOA_JURIDICA VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst = Conexao.conn.prepareStatement(sql);
        pst.setLong(1, pessoaJuridica.getNrSequencia());
        pst.setString(2, pessoaJuridica.getCnpj());
        pst.setString(3, pessoaJuridica.getDsRazaoSocial());
        pst.setString(4, pessoaJuridica.getDsNomeFantasia());
        pst.setLong(5, pessoaJuridica.getCdCidade());
        pst.setString(6, pessoaJuridica.getEndereco());
        pst.setString(7, pessoaJuridica.getBairro());
        pst.setString(8, pessoaJuridica.getNumero());
        pst.setString(9, pessoaJuridica.getCdInscricacaoEstadual());
        pst.executeUpdate();
    }
}
