package DAO;

import Models.Tipo;
import Models.Transaction;
import java.util.Date;
import java.util.UUID;

public interface ExtratoDAO {
    public UUID id(Transaction id);
    public Date data(Transaction data);
    public Tipo TipoTransacao(Transaction TipoTransacao);
    public double valor(Transaction valor);
    public UUID Conta_id(Transaction Conta_id);
}
