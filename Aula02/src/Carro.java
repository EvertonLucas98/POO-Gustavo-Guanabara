public class Carro {
    String modelo;
    int ano;
    float kms;
    boolean ligar;

    void ligar() {
        this.ligar = true;
    }

    void acelerar() {
        if (ligar) {
            System.out.println("ACELERANDO!!");
        } else {
            System.out.println("OPS! O CARRO ESTA DESLIGADO!!");
        }
    };
}
