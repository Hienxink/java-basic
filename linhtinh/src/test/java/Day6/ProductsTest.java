package Day6;

public class ProductsTest {
    public static void main(String[] args){
        Products pro1= new Products();
        pro1.setProductID(1);
        pro1.setProductName("Chais");
        pro1.setSupplierID(1);
        pro1.setCategoryID(1);
        pro1.setUnit("10 boxes x 20 bags");
        pro1.setPrice(18.0f);

        Products pro2= new Products();
        pro2.setProductID(2);
        pro2.setProductName("Chang");
        pro2.setSupplierID(1);
        pro2.setCategoryID(1);
        pro2.setUnit("24 - 12 oz bottles");
        pro2.setPrice(19.0f);

        Products pro3= new Products();
        pro3.setProductID(3);
        pro3.setProductName("Aniseed Syrup");
        pro3.setSupplierID(1);
        pro3.setCategoryID(2);
        pro3.setUnit("12 - 550 ml bottles");
        pro3.setPrice(10.0f);

        System.out.println(pro1);
        System.out.println(pro2);
        System.out.println(pro3);


    }

}
