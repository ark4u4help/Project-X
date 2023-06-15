// Target interface
interface PaymentGateway {
    void processPayment(double amount);
}

// Adaptee interface for Payment Gateway A
interface PaymentGatewayA {
    void initiatePayment(double amount);
}

// Adaptee interface for Payment Gateway B
interface PaymentGatewayB {
    void makePayment(double amount);
}

// Adapter for Payment Gateway A
class PaymentGatewayAAdapter implements PaymentGateway {
    private PaymentGatewayA gatewayA;

    public PaymentGatewayAAdapter(PaymentGatewayA gatewayA) {
        this.gatewayA = gatewayA;
    }

    public void processPayment(double amount) {
        gatewayA.initiatePayment(amount);
    }
}

// Adapter for Payment Gateway B
class PaymentGatewayBAdapter implements PaymentGateway {
    private PaymentGatewayB gatewayB;

    public PaymentGatewayBAdapter(PaymentGatewayB gatewayB) {
        this.gatewayB = gatewayB;
    }

    public void processPayment(double amount) {
        gatewayB.makePayment(amount);
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        // Payment Gateway A
        PaymentGatewayA gatewayA = new PaymentGatewayA() {
            public void initiatePayment(double amount) {
                System.out.println("Payment Gateway A: Initiating payment of $" + amount);
            }
        };

        // Payment Gateway B
        PaymentGatewayB gatewayB = new PaymentGatewayB() {
            public void makePayment(double amount) {
                System.out.println("Payment Gateway B: Making payment of $" + amount);
            }
        };

        // Payment through Adapter for Gateway A
        PaymentGateway adapterA = new PaymentGatewayAAdapter(gatewayA);
        adapterA.processPayment(100.0);

        // Payment through Adapter for Gateway B
        PaymentGateway adapterB = new PaymentGatewayBAdapter(gatewayB);
        adapterB.processPayment(200.0);
    }
}
