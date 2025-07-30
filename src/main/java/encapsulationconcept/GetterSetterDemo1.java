package encapsulationconcept;

public class GetterSetterDemo1 {

    private int accountNumber = 12345678;
    private String accHolderName = "John Doe";

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
