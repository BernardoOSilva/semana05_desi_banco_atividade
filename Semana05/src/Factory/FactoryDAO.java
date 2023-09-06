package Factory;

import DAO.ContaDAO;
import DAO.PessoaDAO;
import DAO.Postgres.ContaDAOPostegres;
import DAO.Postgres.PessoaDAOPostgres;
import Util.GerenciadorConexao;
import java.sql.Connection;

public class FactoryDAO {
    public static ContaDAO makeContaDAO(){
        Connection conexao = GerenciadorConexao.getConexao();
        ContaDAOPostegres ContaDAO = new ContaDAOPostegres(conexao);
        return new ContaDAOPostegres(GerenciadorConexao.getConexao());
    }
    
    public static PessoaDAO makePessoaDAO() {
        Connection conexao = GerenciadorConexao.getConexao();
        PessoaDAOPostgres pessoaDao = new PessoaDAOPostgres(conexao);
        return pessoaDao;
    }
    
}
