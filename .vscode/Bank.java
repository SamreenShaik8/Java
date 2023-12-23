package bank;


class Account{
    public String name;
    protected String email;
    private String password;

    // getters & setters
    public String getPassword(){
        setPassword(randomPass);
        return this.password;
    }
    public String setPassword(String password){
        this.password=pass;
    }
}
public class Bank {
    public static void main(String[] args) {
        Account account1=new Account();
        account1.name="Canara Bank";
        account1.email="canarabank@gmail.com";
        System.out.println(account1.getPassword());
        
    }
}
