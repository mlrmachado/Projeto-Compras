package DAO;

import conexao.Conexao;
import model.Material;

import java.sql.PreparedStatement;

public class MaterialDAO {

    public void salvar (Material material) throws  Exception {

        String sql = "INSERT INTO(NR_SEQUENCIA, DS_MATERIAL, CD_MARCA) MATERIAL VALUES (?,?,?)";
        PreparedStatement pst = Conexao.conn.prepareStatement(sql);
        pst.setLong(1, material.getNrSequencia());
        pst.setString(2, material.getDsMaterial());
        pst.setLong(3, material.getCdMarca());

    }
}
