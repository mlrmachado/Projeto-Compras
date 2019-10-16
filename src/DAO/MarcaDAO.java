package DAO;

import conexao.Conexao;
import model.Marca;

import java.sql.PreparedStatement;

public class MarcaDAO {

    public void salvar (Marca marca) throws Exception {

        String sql = "INSERT INTO(NR_SEQUENCIA, DS_NOME) MARCA VALUES (?,?)";
        PreparedStatement pst = Conexao.conn.prepareStatement(sql);
        pst.setLong(1, marca.getNrSequencia());
        pst.setString(2, marca.getDsNome());
    }
}
