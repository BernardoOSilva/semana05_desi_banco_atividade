package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.UUID;

public class Transaction {
    
    private UUID id;
    private Date data;
    private Tipo TipoTransacao;
    private double valor;
    private UUID Conta_id;

    public Transaction(Date data, Tipo TipoTransacao, Double valor) {
        this.id = UUID.randomUUID(); 
        this.data = data;
        this.TipoTransacao = TipoTransacao;
        this.valor = valor;
        this.Conta_id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public Tipo getTipoTransacao() {
        return TipoTransacao;
    }

    public double getValor() {
        return valor;
    }

    public UUID getConta_id() {
        return Conta_id;
    }    
}
    