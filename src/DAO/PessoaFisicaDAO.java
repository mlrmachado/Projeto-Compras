package DAO;

import conexao.Conexao;
import model.PessoaFisica;

import java.sql.Date;
import java.sql.PreparedStatement;

public class PessoaFisicaDAO {

    public void salvar (PessoaFisica pessoaFisica) throws Exception {

        String sql = "INSERT INTO (NR_SEQUENCIA, " +
                "DS_PESSOA_FISICA, " +
                "DT_NASCIMENTO, " +
                "CPF, " +
                "RG, " +
                "CD_CIDADE, " +
                "ENDERECO, " +
                "BAIRRO, " +
                "NUMERO) PESSOA_FISICA VALUES (?,?,?,?,?,?,?,?,?) ";
        PreparedStatement pst = Conexao.conn.prepareStatement(sql);
        pst.setLong(1, pessoaFisica.getNrSequencia());
        pst.setString(2, pessoaFisica.getDsPessoaFisica());
        pst.setDate(3, (Date) pessoaFisica.getDtNascimento());
        pst.setString(4, pessoaFisica.getCpf());
        pst.setString(5, pessoaFisica.getRg());
        pst.setLong(6, pessoaFisica.getCdCidade());
        pst.setString(7, pessoaFisica.getEndereco());
        pst.setString(8, pessoaFisica.getBairro());
        pst.setString(9, pessoaFisica.getNumero());
        pst.executeUpdate();
    }
}
