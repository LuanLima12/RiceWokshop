/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Formularios.frmLogin;

/**
 *
 * @author Luan
 */
public class riceframework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
        CriarBancoSQLite criarBancoSQLite = new CriarBancoSQLite(conexaoSQLite);
        
        conexaoSQLite.conectar();
        criarBancoSQLite.criarTabelaFuncionario();
        criarBancoSQLite.criarTabelaProduto();
        criarBancoSQLite.criarTabelaCliente();
        criarBancoSQLite.criarTabelaFornecedor();
        
        
        
        
        frmLogin Login = new frmLogin();
        Login.setLocationRelativeTo(null);
        Login.setVisible(true);
    }
    
}
