class Bankaccount {
    static String bankname;
    static String branch;
    static String ifsc;
    long accnum;
    String accHname;
    double balance;

    void deposite(double dep) {
        double totalAmmount = balance + dep;
        System.out.println(dep + "totalAmmount deposited");
        balance = totalAmmount;
        System.out.println(totalAmmount + "avaliable balance");

    }

    void with(double with) {
        double totalAmmount = balance - with;
        System.out.println(with + "ammount withdrwan");
        balance = totalAmmount;
        System.out.println(totalAmmount + "withdrawn balance");
    }

    void Avlbalance(String s) {
        System.out.println("balance:" + balance);

    }

}
