public class Aula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f;
        c1.carga = 80;
        // c1.tampada = true;
        // Não é possível fazer a modificação de forma externa de um atributo privado, mas utilizando um método que faz a modificação de forma interna por meio de um método é possível modificar um atributo privado
        c1.tampar();
        c1.status();
    }
}
