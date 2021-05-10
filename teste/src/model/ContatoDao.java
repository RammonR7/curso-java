package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDao {
private static Connection con;

public ContatoDao () {

	con = ConnectionFactory.getConnection();
}
public void salvarDao(Contato contato) {
	String sql = "insert into contato(nome, sobrenome, idade, telefone) values(?, ?, ?, ?)";
	try {
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, contato.getNome());
		ps.setString(2, contato.getSobrenome());
		ps.setInt(3, contato.getidade());
		ps.setString(4, contato.getTelefone());
		
		ps.execute();
		ps.close();
		
		System.out.println("Contato salvo");
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
}
public void editarDao(Contato contato) {
	String sql = "update contato set nome=?, sobrenome=?, idade=?, telefone=? where id=?";
	try {
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, contato.getNome());
		ps.setString(2, contato.getSobrenome());
		ps.setInt(3, contato.getidade());
		ps.setString(4, contato.getTelefone());
		ps.setLong(5, contato.getId());
		
		ps.execute();
		ps.close();
		
		System.out.println("Contato editado");
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
}
	
public void deletarDao(Long id) {
	String sql = "delete from contato where id=?";
	try {
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setLong(1, id);
		
		ps.execute();
		ps.close();
	}
	catch (SQLException e) {
		e.printStackTrace();
		
		System.out.println("Contato deletado");
	}
}
public List<Contato> consultarDao () {
	List<Contato> contatos = new ArrayList<>();
	try {
		
		String sql = "select * from contato";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			
			Contato contato = new Contato();
			
			contato.setId(rs.getLong("id"));
			contato.setNome(rs.getString("nome"));
			contato.setSobrenome(rs.getString("sobrenome"));
			contato.setIdade(rs.getInt("idade"));
			contato.setTelefone(rs.getString("telefone"));
			
			contatos.add(contato);
		}
		
		rs.close();
	}
	catch (SQLException e1) {
		e1.printStackTrace();
	}
	
	return contatos;
}
}

