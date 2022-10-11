public class Conta {
    
    double saldo;
    int agencia = 42;
    int numero;
    Cliente titular; 
    

    void deposita(double valor){
        this.saldo = this.saldo + valor;

    };

    public boolean saca(double valor) {

        if (this.saldo >= valor){
                this.saldo = this.saldo - valor;
                return true;
        } else {
            return false;
        }
    };

    public boolean tranfere(double valor, Conta destino){
        if (this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        };
        return false;
    }


};
