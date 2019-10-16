package DAO;

        import conexao.Conexao;
        import model.Comprador;

        import java.sql.Connection;
        import java.sql.PreparedStatement;

public class CompradorDAO {

    Connection conn = null;

    public void salvar (Comprador comprador)  throws Exception {

        String sql = "INSERT INTO(NR_SEQUENCIA, DS_COMPRADOR, CD_USUARIO) COMPRADOR VALUES (?,?,?)";
        PreparedStatement pst = Conexao.conn.prepareStatement(sql);
        pst.setLong(1, comprador.getNrSequencia());
        pst.setString(2, comprador.getDsComprador());
        pst.setLong(3, comprador.getCdUsuario());
        pst.executeUpdate();
    }
}
