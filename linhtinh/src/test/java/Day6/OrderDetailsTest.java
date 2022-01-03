package Day6;

public class OrderDetailsTest {
    public static void main(String[] args){
        OrderDetails sub1= new OrderDetails();
        sub1.setOrderDetailID(1);
        sub1.setOrderID(10248);
        sub1.setProductID(11);
        sub1.setQuantity(12);

        OrderDetails sub2= new OrderDetails();
        sub2.setOrderDetailID(2);
        sub2.setOrderID(10248);
        sub2.setProductID(42);
        sub2.setQuantity(10);

        OrderDetails sub3= new OrderDetails();
        sub3.setOrderDetailID(1);
        sub3.setOrderID(10248);
        sub3.setProductID(72);
        sub3.setQuantity(5);

        System.out.println(sub1);
        System.out.println(sub2);
        System.out.println(sub3);

    }
}
