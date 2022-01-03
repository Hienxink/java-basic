package Day6;

public class CategoriesTest {
    public static void main(String[] args){
        Categories cat1 = new Categories();
        cat1.setCategoryID(1);
        cat1.setCategoryName("Beverages");
        cat1.setDescription("Soft drinks, coffees, teas, beers, and ales");

        Categories cat2 = new Categories();
        cat2.setCategoryID(2);
        cat2.setCategoryName("Condiments");
        cat2.setDescription("Sweet and savory sauces, relishes, spreads, and seasonings");

        Categories cat3 = new Categories();
        cat3.setCategoryID(3);
        cat3.setCategoryName("Confections");
        cat3.setDescription("Desserts, candies, and sweet breads");

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);


    }



}
