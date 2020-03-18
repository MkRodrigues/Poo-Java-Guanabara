/*
 * Regras: 
1) Tipo de Conta aceita Poupança PP, ou Conta Corrente CC.
2) Abrir conta deve mudar o Status para verdadeiro e definir o tipo, se Conta Corrente inserir + 50,00 reais, se Poupança + 150,00.
3) Ao fechar a conta a mesma não deve estar negativa ou possuir dinheiro.
4) Para que haja depósito na conta a mesma deve estar com status Verdadeiro.
5) Para que haja saque a conta deve possuir dinheiro disponível para saque.
6) O método pagarMensalidade ao acionado deve subtrair CC -15,00, CP -20,00
7) O Construtor deve iniciar a conta com Status Falso (Conta Fechada), e saldo negativo.
 */
package banco;

/**
 * @author mikael
 */
public class ContaBanco {

    public ContaBanco(int numConta, String tipo, String dono) {
//     Construtor
        this.setSaldo(0);
        this.setStatus(false);
        setNumConta(numConta);
        setTipo(tipo);
        setDono(dono);
        abrirConta(tipo);
    }

//    Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

//    Métodos
    public void statusConta() {
        System.out.println("-----------------");
        System.out.println("Status da Conta: " + this.getStatus());
        System.out.println("Número da Conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo de Conta: " + this.getTipo());
        System.out.println("Saldo R$: " + this.getSaldo());
        System.out.println("-----------------");

    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);

        if ("CC".equals(tipo)) {
            this.setSaldo(50.00);

        } else if ("PP".equals(tipo)) {
            this.setSaldo(150.00);
        } else {
            System.out.println("ERRO! \n Insira um tipo de conta para continuar!");
        }
        System.out.println("Conta aberta com Sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Saque todo o dinheiro da conta para poder fechá-la \n O saldo da conta é de R$: " + this.getSaldo());

        } else if (this.getSaldo() < 0) {
            System.out.println("Conta negativa: " + this.getSaldo());

        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com Sucesso!");
        }
    }

    public void depositar(double deposito) {
        if (this.getStatus()) {
//            this.saldo += deposito;
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("Depósito efetuado com Sucesso, para a conta de:  " + getDono() + " no valor de R$: " + deposito);
        } else {
            System.out.println("Esta conta esta fechada, abra-a primeiro!");
        }
    }

    public void sacar(double saque) {
        if (getStatus()) {
            if (this.getSaldo() >= saque) {
                this.setSaldo(getSaldo() - saque);
                System.out.println("Valor sacado: R$ " + saque + "\n O valor restante é de: R$ " + this.getSaldo());
            } else {
                System.out.println("Saldo Insuficiente!");
            }
        } else {
            System.out.println("A conta solicitada encontra-se Desabilitada!");
        }
    }

    public void pagarMensalidade() {

//        Correção Guanabara
        int valor = 0;
        if (this.getTipo() == "CC") {
            valor = 12;
        } else if (this.getTipo() == "PP") {
            valor = 20;
        }
        if (this.getStatus()) {
            if (this.getSaldo() > valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Tarifa cobrada com Sucesso!");
            } else {
                System.out.println("Saldo Insuficiente!");
            }
        } else {
            System.out.println("A Conta solicitada encontra-se Desabilitada!");
        }

//        Meu Código
//        if (this.getStatus()) {
//            if (this.getSaldo() > 0) {
//                if (getTipo().equals("CC")) {
//                    this.setSaldo(this.getSaldo() - 15);
//                    System.out.println("Mensalidade paga com Sucesso!");
//                } else if (getTipo().equals("PP")) {
//                    this.setSaldo(this.getSaldo() - 20);
//                    System.out.println("Mensalidade paga com Sucesso!");
//
//                }
//            } else {
//                System.out.println("Saldo Insuficiente!");
//            }
//        } else {
//            System.out.println("A conta solicitada encontra-se Desabilitada!");
//        }
    }

//        Getters and Setters
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
