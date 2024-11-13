public class ContaBanco {
    // ATTRIBUTES
    public int numConta;    // Número da conta
    protected String tipo;  // Tipo da conta: Conta Corrente (CC) ou Conta Poupança (CP)
    private String dono;    // Dono da conta
    private float saldo;    // Saldo da conta
    private boolean status; // Status da conta

    // CONSTRUCTOR
    public ContaBanco() {
        setStatus(false);
        setSaldo(0.0f);
    }

    // SETTERS
    public void setNumConta(int numConta) {
        this.numConta = numConta;
        System.out.println("Número da conta criado com sucesso!");
    }

    public void setTipo(String tipo) {
        if(this.status == true) {
            if(tipo == "CC" || tipo == "CP") {
                this.tipo = tipo;
                
    
                if(tipo == "CC") {
                    setSaldo(50);
                    System.out.println("Parabéns! Você acabou de abrir uma Conta Corrente!");
                } else {
                    setSaldo(150);
                    System.out.println("Parabéns! Você acabou de abrir uma Conta Poupança!");
                }
            } else {
                System.out.println("ERRO! DIGITE CC PARA CRIAR UMA CONTA CORRENTE OU CP PARA CRIAR UMA CONTA POUPANÇA!");
            }
        } else {
            System.out.println("ERRO! É NECESSÁRIO CRIAR UMA CONTA PRIMEIRO!");
        }
        
    }

    public void setDono(String dono) {
        this.dono = dono;
        System.out.println("Nome do dono criado com sucesso!");
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // GETTERS
    public int getNumConta() {
        return this.numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    // MÉTODOS
    public void abrirConta(String tipo) {
        if(getStatus() == false) {
            setStatus(true);
            setTipo(tipo);
        } else {
            System.out.println("A CONTA JÁ ESTÁ ABERTA!");
        }
    }

    public void fecharConta() {
        if(getSaldo() == 0.0f) {
            System.out.println("A conta foi fechada com sucesso!");
        } else {
            System.out.println("ERRO! ZERE SUA CONTA PRIMEIRO!");
        }
    }

    public void depositar(float saldo) {
        if(getStatus() == true) {
            setSaldo(this.saldo + saldo);
            System.out.println("Deposito realizado com sucesso! Agora você tem R$" + getSaldo() + " de saldo!");
        } else {
            System.out.println("VOCÊ NÃO TEM UMA CONTA ATIVA! CRIE UMA NOVA CONTA AGORA, DIGITE: (blablabla)");
        }
    }

    public void sacar(float sacar) {
        if(getStatus() == true) {
            if(getSaldo() - sacar >= 0) {
                setSaldo(getSaldo() - sacar);
                System.out.println("Saque realizado com sucesso! Agora você tem R$"+getSaldo()+" de saldo!");
            } else {
                System.out.println("ERRO! SAQUE IRREGULAR!");
            }
        } else {
            System.out.println("VOCÊ NÃO TEM UMA CONTA ATIVA! CRIE UMA NOVA CONTA AGORA, DIGITE: (blablabla)");
        }
    }

    public void pagarMensal() {
        if(getTipo() == "CC") {
            setSaldo(this.saldo - 12);
            System.out.println("Pagamento da mensalidade realizado com sucesso!");
        } else {
            setSaldo(this.saldo - 20);
            System.out.println("Pagamento da mensalidade realizado com sucesso!");
        }
    }
}
