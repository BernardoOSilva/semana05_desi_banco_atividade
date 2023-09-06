package semana05;

import Models.Conta;
import Models.Pessoa;
import java.util.ArrayList;
import Views.Sistema;
import io.github.cdimascio.dotenv.Dotenv;

public class Semana05 {
    
    // DB FAKE
    public static ArrayList<Conta> banco = new ArrayList<>();
    public static Dotenv dotenv = Dotenv.load();
            
    public static void main(String[] args) {
        new Sistema().setVisible(true);
//        Pessoa p = new Pessoa("Gustavo", "111");
//        Conta c = new Conta(p, "123");
//        Conta d = new Conta(p, "123");
        
//        System.out.println(c.getSenha());
    }
}
