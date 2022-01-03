package Day6;

public class Orders {
    int OrderID;
    int CustomerID;
    int EmployeeID;
    String OrderDate;
    int ShipperID;


    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String orderDate) {
        OrderDate = orderDate;
    }

    public int getShipperID() {
        return ShipperID;
    }

    public void setShipperID(int shipperID) {
        ShipperID = shipperID;
    }

 @Override
    public String toString(){
        return "OrderID:"+this.getOrderID()+ " CustomerID:"+this.getCustomerID()+ " EmployeeID:"+this.getEmployeeID()+" OrderDate:"+this.getOrderDate()+" ShipperID:"+this.getShipperID();

 }


}
