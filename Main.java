

public class Main {
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria("João", 1000.0);

        conta.consultarSaldo();
        
        conta.depositar(200.0);
        
        conta.consultarSaldo();
        
        conta.sacar(300.0);
        
        conta.consultarSaldo();  

        conta.sacar(200.0);
        
        conta.consultarSaldo();
    }
}
