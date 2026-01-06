public class VIPCustomer extends Person {

    private double discount;

    public VIPCustomer(int id, String name, double discount) {
        super(id, name);
        setDiscount(discount);
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        if (discount >= 0) {
            this.discount = discount;
        } else {
            this.discount = 0;
        }
    }

    @Override
    public void showInfo() {
        System.out.println("VIP Customer: " + name + ", discount = " + discount + "%");
    }
}
