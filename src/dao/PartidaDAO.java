package dao;

import model.Partida;

import java.sql.CallableStatement;
import java.sql.Connection;

public class PartidaDAO {

    public void guardarPartida(Partida p) {
        String sql = "{ call SP_GUARDAR_PARTIDA(?,?,?,?) }";

        try ( Connection con = ConexionOracle.getConexion();
            CallableStatement cs = con.prepareCall(sql)) {

                cs.setInt(1, p.getJugadorId());
                cs.setInt(2, p.getPuntaje());
                cs.setInt(3, p.getDisparos());
                cs.setLong(4,p.getDuracionSeg());

                cs.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}   
