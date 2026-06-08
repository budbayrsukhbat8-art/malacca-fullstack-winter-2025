package month02.week10.session46.backend.session46.src.main.java.mn.icode;

public class Payment {
    public static void main(String[] args) {
        QPay qpay = new QPay();
        qpay.processPayment(10000);
    }
}


 interface PaymentMethod {
void processPayment (double amount);
   
    
}
class SocialPay implements PaymentMethod  {
@Override
    public void processPayment(double amount){
        System.out.println("Swiping Social Pay for" + amount + "$.");
    }
}
class QPay implements PaymentMethod {
    @Override 
    public void processPayment (double amount) {
        System.out.println("Swiping Social Pay for" + amount + "$.");
    }
}
