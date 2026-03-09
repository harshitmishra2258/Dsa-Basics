public class Access_specifiers {
    public static void main(String[] args) {
        Bank_account myAcc=new Bank_account();
        myAcc.username="Harshit";
        myAcc.setPassword("Harsjit");
        System.out.println(myAcc.username);
        
    }
    
}

class Bank_account{
    public String username;
    private String password;
     
    void setPassword(String pwd){
        password=pwd;

    }
}