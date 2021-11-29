/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author AfonsoeAna
 */
public class Dados {
        public Connection conn;
        private String Driver_MySQL = "com.mysql.jdbc.Driver";
        private String Local_Server = "localhost";
        private String BCD = "Projetopoo";
        private String Porta = "3306";
        private String Usuario = "root";
        private String Senha = "";
        
        public void abrirConexao() throws Exception
        {
            Class.forName(Driver_MySQL).newInstance();

            String url = "jdbc:mysql://" + Local_Server + ":" + Porta + "/" + BCD;

            conn =  (Connection) DriverManager.getConnection(url, Usuario, Senha);
        }
        public void fecharConexao() throws Exception
        {
            conn.close();
        }
}
