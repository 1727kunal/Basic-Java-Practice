package encapsulationconcept;

public class GetterSetterDemo2 {
    public static void main(String[] args) {
        GetterSetterDemo1 gs1 = new GetterSetterDemo1();
        gs1.setAccHolderName("Kunal Waghamare");
        gs1.setAccountNumber(1727172717);
        System.out.println(gs1.getAccHolderName());
        System.out.println(gs1.getAccountNumber());
    }
}
