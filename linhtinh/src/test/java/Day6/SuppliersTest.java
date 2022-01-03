package Day6;

public class SuppliersTest {
    public static void main(String[] args) {
        Suppliers sup1=new Suppliers();
        sup1.setSupplierID(1);
        sup1.setSupplierName("Exotic Liquid");
        sup1.setContactName("Charlotte Cooper");
        sup1.setAddress("49 Gilbert St.");
        sup1.setCity("Londona");
        sup1.setPostalcode("EC1 4SD");
        sup1.setCountry("UK");
        sup1.setPhone("(171) 555-2222");

        Suppliers sup2=new Suppliers();
        sup2.setSupplierID(2);
        sup2.setSupplierName("New Orleans Cajun Delights");
        sup2.setContactName("Shelley Burke");
        sup2.setAddress("P.O. Box 78934");
        sup2.setCity("New Orleans");
        sup2.setPostalcode("70117");
        sup2.setCountry("USA");
        sup2.setPhone("(100) 555-4822");

        Suppliers sup3=new Suppliers();
        sup3.setSupplierID(3);
        sup3.setSupplierName("Grandma Kelly's Homestead");
        sup3.setContactName("Regina Murphy");
        sup3.setAddress("707 Oxford Rd.");
        sup3.setCity("Ann Arbor");
        sup3.setPostalcode("48104");
        sup3.setCountry("USA");
        sup3.setPhone("(313) 555-5735");

        System.out.println(sup1);
        System.out.println(sup2);
        System.out.println(sup3);

    }
}
