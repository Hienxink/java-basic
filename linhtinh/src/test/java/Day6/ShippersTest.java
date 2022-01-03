package Day6;

public class ShippersTest {
    public static void main(String[] args){
        Shippers ship1= new Shippers();
        ship1.setShipperID(1);
        ship1.setShipperName("Speedy Express");
        ship1.setPhone("(503) 555-9831");

        Shippers ship2= new Shippers();
        ship2.setShipperID(2);
        ship2.setShipperName("United Package");
        ship2.setPhone("(503) 555-3199");

        Shippers ship3= new Shippers();
        ship3.setShipperID(3);
        ship3.setShipperName("Federal Shipping");
        ship3.setPhone("(503) 555-9931");

        System.out.println(ship1);
        System.out.println(ship2);
        System.out.println(ship3);
    }
}
