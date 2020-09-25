/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Luan
 */
public class ConexaoSQLite {
    
    private Connection conexao;
    
    public boolean conectar(){
        
        try{
            String url = "jdbc:sqlite:bancoDados/bancoRiceFramework.db";
            
            this.conexao = DriverManager.getConnection(url);
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return false;
        }
        //System.out.println("Conectou!");
        return true;
    }
    
    public boolean desconectar(){
        
        try{
            
            if(this.conexao.isClosed() == false){
                this.conexao.close();
            }
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return false;
        }
        //System.out.println("Desconectou!");
        return true;
    }
    
    public Statement criarStatement(){
        try{
            return this.conexao.createStatement();
        }catch(SQLException e){
            return null;
        }
    }
    
    public PreparedStatement criarPreparedStatement(String sql){
        try{
            return this.conexao.prepareStatement(sql);
        }catch(SQLException e){
            return null;
        }
    }
    
    public Connection getConnection(){
        return this.conexao;
    }
    
    
    
    
    
    
    /*public void insertSQL(String pSQL){
        int status = 0;
        try {
            //createStatement de con para criar o Statement
            this.setStatement(getCon().createStatement());

            // Definido o Statement, executamos a query no banco de dados
            this.getStatement().executeUpdate(pSQL);
            
            //consulta o ultimo id inserido
            this.setResultSet(this.getStatement().executeQuery("SELECT last_insert_id();"));
            
            //recupera o ultimo id inserido
            while(this.resultSet.next()){
                status = this.resultSet.getInt(1);
            }
            
            //retorna o ultimo id inserido
            return status;
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }
    }*/
    
}
