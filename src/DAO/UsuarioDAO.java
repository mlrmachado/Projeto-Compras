package DAO;

import conexao.Conexao;
import model.Usuario;

import java.sql.PreparedStatement;

public class UsuarioDAO {

    public void salvar (Usuario usuario) throws Exception {

        String sql = "INSERT_INTO(NR_SEQUENCIA, DS_USUARIO_, SENHA, CD_PESSOA_FISICA, SETOR) USUARIO VALUES (?,?,?,?,?)";
        PreparedStatement pst = Conexao.conn.prepareStatement(sql);
        pst.setLong(1, usuario.getNrSequencia());
        pst.setString(2, usuario.getDsUsuario());
        pst.setString(3, usuario.getSenha());
        pst.setLong(4, usuario.getCdPessoaFisica());
        pst.setLong(5, usuario.getSetor());
        pst.executeUpdate();
    }
}
