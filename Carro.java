
public class Carro{

       
        private String Marca;
        private String Modelo;
        private int ano;

    public Carro(String Marca, String Modelo, int ano) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.ano = ano;
    }
        
    public int calculoIdade(){
    int tempo = 2024-ano;
    return tempo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAno() {
        if(ano>2024){
        System.out.println("Ano inválido!");
        return 0;
        }else{
        return ano;
        }
    }
 }