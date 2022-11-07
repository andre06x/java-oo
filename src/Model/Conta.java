package Model;

public class Conta {
    private String tipoconta;
    private String tipocliente;
    private String nomecliente;
    private String dataabertura;
    private double taxa;
    private double saldo;

    public String getTipoconta() {
        return tipoconta;
    }

    public void setTipoconta(String tipoconta) {
        this.tipoconta = tipoconta;
    }

    public String getTipocliente() {
        return tipocliente;
    }

    public void setTipocliente(String tipocliente) {
        this.tipocliente = tipocliente;
    }

    public String getDataabertura() {
        return dataabertura;
    }

    public void setDataabertura(String dataabertura) {
        this.dataabertura = dataabertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String sacar(double valor){
        if(valor < saldo){
         saldo = saldo - valor;
         return "Saque de " + valor + " realizado com sucesso!";
        } else {
            return "Saldo insuficiente, realize um depósito.";
        }
    }

    public double depositar(double valor){
        saldo = saldo + valor;
        return saldo;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
