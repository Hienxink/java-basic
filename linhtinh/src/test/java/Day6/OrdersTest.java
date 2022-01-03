package Day6;

public class OrdersTest {
    public static void main(String[] args) {
        Orders od1= new Orders();
        od1.setOrderID(10248);
        od1.setCustomerID(90);
        od1.setEmployeeID(5);
        od1.setOrderDate("1996-07-04");
        od1.setShipperID(3);

        Orders od2= new Orders();
        od2.setOrderID(10249);
        od2.setCustomerID(81);
        od2.setEmployeeID(6);
        od2.setOrderDate("1996-07-05");
        od2.setShipperID(1);

        Orders od3= new Orders();
        od3.setOrderID(10250);
        od3.setCustomerID(34);
        od3.setEmployeeID(4);
        od3.setOrderDate("1996-07-08");
        od3.setShipperID(2);

        System.out.println(od1);
        System.out.println(od2);
        System.out.println(od3);
    }
}
