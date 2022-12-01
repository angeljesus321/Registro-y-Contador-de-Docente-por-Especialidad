package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidad.docente;
import entidad.especialidad;
import entidad.sede;
import interfaces.interfacesDocentesDAO;
import utils.MysqlDBConexion;

public class ModelDocente implements interfacesDocentesDAO{

	@Override
	public int registrarDocente(docente d) {
		int estado = 0;
		Connection cn = null;
		PreparedStatement pstm = null;
		try {
			cn = MysqlDBConexion.getConexion();
			String sql = "insert into tb_docente values(null,?,?,?,?,?,?)";
			pstm = cn.prepareStatement(sql);
			
			pstm.setString(1, d.getNom_docente());
			pstm.setString(2, d.getApe_docente());
			pstm.setInt(3, d.getDni_docente());
			pstm.setDouble(4, d.getSueldo());
			pstm.setInt(5, d.getCod_sede());
			pstm.setInt(6, d.getCod_especialidad());
			estado = pstm.executeUpdate();
		}
		catch (Exception e) {
			System.out.println("ERROR EN EL REGISTRO " + e.getMessage());
		}
		return estado;
		}




	@Override
	public ArrayList<sede> listarSedes() {
		sede s = null ;
		ArrayList<sede> data = new ArrayList<sede>();
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			cn = MysqlDBConexion.getConexion();
			String sql = "select * from tb_sede";
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				s = new sede();		
				s.setCod_sede(rs.getInt(1));
				s.setNom_sede(rs.getString(2));
				
				data.add(s);
			}
		}
		catch (Exception e) {
			System.out.println(">>>>> ERROR EN LA INSTRUCCION SQL - Listar " + e.getMessage());
		}
		finally {
			try{
				if(pstm != null) pstm.close();
				if(pstm != null) pstm.close();
				if(rs != null) rs.close();
			}catch (SQLException e2) {
				System.out.println(">>>>> ERROR AL CERRAR LA BD " + e2.getMessage());			
			}
			
		}
		return data;
	}

	@Override
	public ArrayList<especialidad> listarEspecialidades() {
		especialidad es = null ;
		ArrayList<especialidad> data = new ArrayList<especialidad>();
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			cn = MysqlDBConexion.getConexion();
			String sql = "select * from tb_especialidad";
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				es = new especialidad();		
				es.setCod_especialidad(rs.getInt(1));
				es.setNom_especialidad(rs.getString(2));
				
				data.add(es);
			}
		}
		catch (Exception e) {
			System.out.println(">>>>> ERROR EN LA INSTRUCCION SQL - Listar " + e.getMessage());
		}
		finally {
			try{
				if(pstm != null) pstm.close();
				if(pstm != null) pstm.close();
				if(rs != null) rs.close();
			}catch (SQLException e2) {
				System.out.println(">>>>> ERROR AL CERRAR LA BD " + e2.getMessage());			
			}
			
		}
		return data;
	}




	@Override
	public ArrayList<docente> listarDocente() {
		ArrayList<docente> lista = new ArrayList<docente>();
		// PLANTILLA DE BD
				Connection con = null;
				PreparedStatement pst = null;
				ResultSet rs = null;
				try {
					con = MysqlDBConexion.getConexion();
					String sql = "Select d.cod_docente, d.nom_docente, d.ape_docente, d.dni_docente,"
							+ " d.sueldo,se.nom_sede, es.nom_especialidad\r\n" + 
							"from tb_docente as d inner join tb_especialidad as es\r\n" + 
							"on es.cod_especialidad = d.cod_especialidad\r\n" + 
							"inner join tb_sede as se\r\n" + 
							"on d.cod_sede = se.cod_sede";
					pst = con.prepareStatement(sql);

					rs = pst.executeQuery();

					while (rs.next()) {
						docente d = new docente();
						
						d.setCod_docente(rs.getInt(1));
						d.setNom_docente(rs.getString(2));				
						d.setApe_docente(rs.getString(3));
						d.setDni_docente(rs.getInt(4));
						d.setSueldo(rs.getDouble(5));
						d.setNombre_sede(rs.getString(6));
						d.setNombre_especialidad(rs.getString(7));

						lista.add(d);
					}
				
				} catch (Exception e) {
					System.out.println("ERROR EN EL LISTADO DE DATOS" + e.getMessage());
				} finally {
					MysqlDBConexion.closeConexion(con);
				}

				return lista;
	}

}




