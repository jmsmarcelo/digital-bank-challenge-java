import model.*;

public class Bank {
    public static void main(String[] args) {
        Client maria = new NaturalPerson("Maria");

        Account cc = new CurrentAccount(maria, 50.00);
        Account cp = new SavingsAccount(maria, 20.00);

        System.out.println("-------Testando Informações da Conta-------");
        System.out.println("Agência: " + cc.getBranch());
        System.out.println("Conta Corrente: " + cc.getACCOUNT_ID());
        System.out.println("Conta Poupança: " + cp.getACCOUNT_ID());
        System.out.println("Cliente: " + maria.getName());

        System.out.println("-------Testando Saldo-------");
        System.out.println("Saldo da Conta Corrente da " + cc.getCLIENT().getName() + ": " + cc.getBalance());
        System.out.println("Saldo da Conta Poupança da " + cp.getCLIENT().getName() + ": " + cp.getBalance());

        System.out.println("-------Testando Deposito-------");
        System.out.println("Deposito na Conta Corrente da " + cc.getCLIENT().getName() + ": " + cc.deposit(50.00));
        System.out.println("Deposito na Conta Poupança da " + cp.getCLIENT().getName() + ": " + cp.deposit(20.00));

        System.out.println("-------Testando Saldo-------");
        System.out.println("Saldo da Conta Corrente da " + cc.getCLIENT().getName() + ": " + cc.getBalance());
        System.out.println("Saldo da Conta Poupança da " + cp.getCLIENT().getName() + ": " + cp.getBalance());

        System.out.println("-------Testando Transferência-------");
        System.out.println("Transferindo da Conta Poupança para a Conta Corrente da " + cc.getCLIENT().getName() + ": " + cp.transfer(30.00, cc));

        System.out.println("-------Testando Saldo-------");
        System.out.println("Saldo da Conta Corrente da " + cc.getCLIENT().getName() + ": " + cc.getBalance());
        System.out.println("Saldo da Conta Poupança da " + cp.getCLIENT().getName() + ": " + cp.getBalance());

        System.out.println("-------Testando Transferência-------");
        System.out.println("Transferindo da Conta Corrente para a Conta Poupança da " + cc.getCLIENT().getName() + ": " + cc.transfer(20.00, cp));

        System.out.println("-------Testando Saldo-------");
        System.out.println("Saldo da Conta Corrente da " + cc.getCLIENT().getName() + ": " + cc.getBalance());
        System.out.println("Saldo da Conta Poupança da " + cp.getCLIENT().getName() + ": " + cp.getBalance());

        System.out.println("-------Testando Saque-------");
        System.out.println("Saque na Conta Corrente da " + cc.getCLIENT().getName() + ": " + cc.withdraw(10.00));
        System.out.println("Saque na Conta Poupança da " + cp.getCLIENT().getName() + ": " + cp.withdraw(10.00));

        System.out.println("-------Testando Saldo-------");
        System.out.println("Saldo da Conta Corrente da " + cc.getCLIENT().getName() + ": " + cc.getBalance());
        System.out.println("Saldo da Conta Poupança da " + cp.getCLIENT().getName() + ": " + cp.getBalance());
    }
}