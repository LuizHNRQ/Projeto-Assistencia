/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.assistencia.dal;

import java.sql.*;

/**
 *
 * @author LZX
 */
public class ModuloConexao {

    //METODO RESPONSAVEL POR ESTABELECER A CONEXÃO COM BANCO DE DADOS
    public static Connection conector() {
        java.sql.Connection conexao = null;

        //A linha a baixo chama o driver
        //String driver = "com.mysql.jdbc.Driver";
        String driver = "com.mysql.cj.jdbc.Driver";

        String url = "jdbc:mysql://localhost:3306/dbloja"+"?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "";
        
        //Estabelecendo conexao com banco de dados
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            
            //linha abaixo serve de apoio para ERRO de conexao
            //System.out.println(e);
            return null;
        }
    }

}
