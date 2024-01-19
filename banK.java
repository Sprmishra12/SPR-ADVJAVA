import java.util.Scanner;

class banK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bankaccount.bankname = "UCO ";
        Bankaccount.branch = "orti";
        Bankaccount.ifsc = "UCBA166600";
        Bankaccount b1 = new Bankaccount();
        b1.accnum = 16660110053492L;
        b1.accHname = "suman priyaranjan mishra";
        b1.balance = 0.09;
        Bankaccount b2 = new Bankaccount();
        b2.accnum = 1666011080937L;
        b2.accHname = "sipra dash ";
        b2.balance = 2000000;
        String s = "yes";
        System.out.println("suman account details");
        System.out.println(b1.balance);
        System.out.println("enter the ammount to deposite");
        b1.deposite(sc.nextDouble());
        System.out.println("enter teh ammmount to withdraw");
        b1.with(sc.nextDouble());
        System.out.println("enter yes to show your balance");
        b1.Avlbalance(sc.next(s));
        System.out.println("Sipra account details");
        System.out.println(b1.balance);
        System.out.println("enter the ammount to deposite");
        b2.deposite(sc.nextDouble());
        System.out.println("enter teh ammmount to withdraw");
        b2.with(sc.nextDouble());
        System.out.println("enter yes to show your balance");
        b2.Avlbalance(sc.next(s));
    }

}
