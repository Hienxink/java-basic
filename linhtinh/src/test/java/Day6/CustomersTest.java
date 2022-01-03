package Day6;

public class CustomersTest {
    public static void main(String[] args) {
        Customers cus1 = new Customers();
        cus1.setCustomerID(1);
        cus1.setCustomerName("Alfreds Futterkiste");
        cus1.setContactName("Maria Anders");
        cus1.setAddress("Obere Str. 57");
        cus1.setCity("Berlin");
        cus1.setPostalCode("12209");
        cus1.setCountry("Germany");

        Customers cus2 = new Customers();
        cus2.setCustomerID(2);
        cus2.setCustomerName("Ana Trujillo Emparedados y helados");
        cus2.setContactName("Ana Trujillo");
        cus2.setAddress("Avda. de la Constitución 2222");
        cus2.setCity("México D.F.");
        cus2.setPostalCode("05021");
        cus2.setCountry("Mexico");

        Customers cus3 = new Customers();
        cus3.setCustomerID(3);
        cus3.setCustomerName("Antonio Moreno Taquería");
        cus3.setContactName("Antonio Moreno");
        cus3.setAddress("México D.F.");
        cus3.setCity("México D.F");
        cus3.setPostalCode("05023");
        cus3.setCountry("Mexico");

        System.out.println(cus1.getCustomerID());
        System.out.println(cus1.getCustomerName());
        System.out.println(cus1.getContactName());
        System.out.println(cus1.getAddress());
        System.out.println(cus1.getCity());
        System.out.println(cus1.getPostalCode());
        System.out.println(cus1.getCountry());

        System.out.println(cus1);

    }
}



