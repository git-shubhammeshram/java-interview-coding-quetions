package InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTotalAndAvg {

    private String productID;
    private int productQty;
    private double productPrice;

    public FindTotalAndAvg(String productID, int productQty, double productPrice) {
        this.productID = productID;
        this.productQty = productQty;
        this.productPrice = productPrice;
    }

    public String getProductID() {
        return productID;
    }

    public int getProductQty() {
        return productQty;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setProductQty(int productQty) {
        this.productQty = productQty;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "FindTotalAndAvg{" +
                "productID='" + productID + '\'' +
                ", productQty=" + productQty +
                ", productPrice=" + productPrice +
                '}';
    }

    public static void main(String[] args) {
        List<FindTotalAndAvg> products= Arrays.asList(
                new FindTotalAndAvg("P1",10,15.50),
                new FindTotalAndAvg("P2",5,20.00),
                new FindTotalAndAvg("P1",7,15.50),
                new FindTotalAndAvg("P3",3,10.00),
                new FindTotalAndAvg("P1",4,15.50)
        );

        double sum = products.stream()
                .filter(p -> p.getProductID().equals("P1"))
                .mapToDouble(p -> p.getProductQty() * p.getProductPrice())
                .sum();
        System.out.println(sum);

        Double average = products.stream()
                .filter(p -> p.getProductID().equals("P1"))
                .collect(Collectors.averagingDouble(FindTotalAndAvg::getProductQty));

        System.out.println(average);

    }
}
