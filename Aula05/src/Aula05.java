public class Aula05 {
    public static void main(String[] args) throws Exception {
        ContaBanco conta01 = new ContaBanco();
        conta01.setNumConta(123456789);
        conta01.setDono("Everton Lucas");
        conta01.abrirConta("CP");
        conta01.depositar(1000);
        conta01.depositar(0.5f);
        conta01.sacar(1100);
        conta01.sacar(0.5f);
        conta01.fecharConta();
        conta01.sacar(30);
        conta01.fecharConta();
        conta01.pagarMensal();
        conta01.fecharConta();
    }
}
