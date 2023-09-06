package DAO.Postgres;

import Models.Pessoa;
import Models.PessoaFisica;
import Models.Transaction;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExtratoDAOPostegres {
    
    private final Connection conexao;
    
    public ExtratoDAOPostegres(Connection conexao) {
        this.conexao = conexao;
    }

    public void inserirExtrato(Extrato extrato) {
        String sql = "SELECT extrato (id, data, tipo, valor, pessoa_id) VALUES (?, ?, CAST(? as tipo_extrato), ?, ?)";
        
        try {
            PreparedStatement stm = this.Transaction.prepareStatement(sql);
            stm.setObject(1, Transaction.getId());
            stm.setString(2, pessoa.getNome());
            stm.setString(3, pessoa.getDocumento());
            stm.setString(4, tipoPessoa);

            stm.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }
}
