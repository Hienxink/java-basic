package Day6;

public class Products {
    int ProductID;
    String ProductName;
    int SupplierID;
    int CategoryID;
    String Unit;

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float price) {
        Price = price;
    }

    Float Price;


    public int getProductID() {

        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(int supplierID) {
        SupplierID = supplierID;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    @Override
    public String toString(){
        return "ProductID: "+this.getProductID()+" ProductName:"+this.getProductName()+" CategoryID:"+this.getCategoryID()+" Unit:"+this.getUnit()+ " Price: "+this.getPrice();
    }

}
