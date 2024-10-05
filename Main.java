
public class Main {
   
 public static void main(String[] args) {
       
        Carro meuCarro = new Carro("Chevrolet", "Impala", 1967);
        
        // Exibindo informações sobre o carro
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAno());
        System.out.println("Idade do carro: " + meuCarro.calculoIdade() + " anos");
    }
}