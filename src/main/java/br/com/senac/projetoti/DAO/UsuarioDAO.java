
package br.com.senac.projetoti.DAO;

import br.com.senac.projetoti.persistencia.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    
    public static Usuario validarUsuarioSeguro(Usuario usuario) {
            // Criando consulta parametrizada
            String sql = "SELECT * FROM usuario WHERE loginUsuario = ? AND senhaUsuario = ?";
            
            Usuario usuarioEncontrado = null;

            try {
                Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/gerenciadorti", "root", "admin");
                PreparedStatement statement = conexao.prepareStatement(sql);

                // Atribuindo os valores na consulta
                statement.setString(1, usuario.getLoginUsuario());
                statement.setString(2, usuario.getSenhaUsuario());
                
                ResultSet rs = statement.executeQuery();

                while (rs.next()) {
                    usuarioEncontrado = new Usuario();
                    usuarioEncontrado.setIdUsuario(rs.getInt("idUsuario"));
                    usuarioEncontrado.setNomeUsuario(rs.getString("nomeUsuario"));
                    usuarioEncontrado.setLoginUsuario(rs.getString("loginUsuario"));
                    usuarioEncontrado.setSenhaUsuario(rs.getString("senhaUsuario"));
                }
            } catch (SQLException ex) {
                System.out.println("Sintaxe de comando invalida");
            }

            return usuarioEncontrado;
        }
}
