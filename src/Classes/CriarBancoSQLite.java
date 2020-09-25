/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Luan
 */
public class CriarBancoSQLite {
    
    final ConexaoSQLite conexaoSQLite;
    
    public CriarBancoSQLite(ConexaoSQLite pConexaoSQLite){
        this.conexaoSQLite = pConexaoSQLite;
    }
    
    
    public void criarTabelaCliente(){
        String sql = "CREATE TABLE IF NOT EXISTS tbl_cliente("
                + "id_cliente integer PRIMARY KEY AUTOINCREMENT, "
                + "nome VARCHAR(50) NOT NULL, "
                + "email VARCHAR(50) NOT NULL"
                + ");";
        
       boolean conectou = false;
       
       try{
           //SE CONECTOU CORRETAMENTE
           conectou = this.conexaoSQLite.conectar();
           //SE CONECTOU, CRIARA O STATEMENT
           Statement stmt = this.conexaoSQLite.criarStatement();
           //O STATEMENT EXECUTA O SQL
           stmt.execute(sql);
           
           System.out.println("Tabela cliente criada.");
           
       }catch(SQLException e){
           
       } finally{
           if(conectou){
               //SE A CONEXÃO FOI FEITA, A FECHA
               this.conexaoSQLite.desconectar();
           }
       }
    }

    
public void criarTabelaFuncionario(){
        String sql = "CREATE TABLE IF NOT EXISTS tbl_funcionarios("
                + "id_funcionario integer PRIMARY KEY AUTOINCREMENT, "
                + "nome VARCHAR(50) NOT NULL, "
                + "cpf VARCHAR(11) NOT NULL, "
                + "fone VARCHAR(11),"
                + "email VARCHAR(50) NOT NULL,"
                + "cargo VARCHAR(30) NOT NULL,"
                + "anoNascimento VARCHAR(20) NOT NULL"
                + ");";
        
       boolean conectou = false;
       
       try{
           //SE CONECTOU CORRETAMENTE
           conectou = this.conexaoSQLite.conectar();
           //SE CONECTOU, CRIARA O STATEMENT
           Statement stmt = this.conexaoSQLite.criarStatement();
           //O STATEMENT EXECUTA O SQL
           stmt.execute(sql);
           
           System.out.println("Tabela funcionario criada.");
           
       }catch(SQLException e){
           
       } finally{
           if(conectou){
               //SE A CONEXÃO FOI FEITA, A FECHA
               this.conexaoSQLite.desconectar();
           }
       }
}    
    
public void criarTabelaProduto(){
        String sql = "CREATE TABLE IF NOT EXISTS tbl_produto("
                + "id_produto integer PRIMARY KEY AUTOINCREMENT, "
                + "descricao VARCHAR(50) NOT NULL, "
                + "estoque integer, "
                + "valor double,"
                + "cnpj_fornecedor VARCHAR(14)"
                + ");";
        
       boolean conectou = false;
       
       try{
           //SE CONECTOU CORRETAMENTE
           conectou = this.conexaoSQLite.conectar();
           //SE CONECTOU, CRIARA O STATEMENT
           Statement stmt = this.conexaoSQLite.criarStatement();
           //O STATEMENT EXECUTA O SQL
           stmt.execute(sql);
           
           System.out.println("Tabela produto criada.");
           
       }catch(SQLException e){
           
       } finally{
           if(conectou){
               //SE A CONEXÃO FOI FEITA, A FECHA
               this.conexaoSQLite.desconectar();
           }
       }
}

public void criarTabelaFornecedor(){
        String sql = "CREATE TABLE IF NOT EXISTS tbl_fornecedor("
                + "cnpj_fornnecedor VARCHAR(14) NOT NULL, "
                + "razao_social VARCHAR(50) NOT NULL, "
                + "endereco VARCHAR(50) NOT NULL, "
                + "cidade VARCHAR(50) NOT NULL"
                + ");";
        
       boolean conectou = false;
       
       try{
           //SE CONECTOU CORRETAMENTE
           conectou = this.conexaoSQLite.conectar();
           //SE CONECTOU, CRIARA O STATEMENT
           Statement stmt = this.conexaoSQLite.criarStatement();
           //O STATEMENT EXECUTA O SQL
           stmt.execute(sql);
           
         System.out.println("Tabela fornecedor criada.");
           
       }catch(SQLException e){
           
       } finally{
           if(conectou){
               //SE A CONEXÃO FOI FEITA, A FECHA
               this.conexaoSQLite.desconectar();
           }
       }
    }
    
    

    
}
