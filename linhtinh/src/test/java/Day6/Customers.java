package Day6;

public class Customers {
    int CustomerID;
    String CustomerName;
    String ContactName;
    String Address;
    String City;
    String PostalCode;
    String Country;

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
    @Override
    public String toString() {
        return "CustomerID: " + this.getCustomerID() + " CustomerName: " + this.getCustomerName() + " ContactName:" + this.getContactName() + " Address:" + this.getAddress() + " City:" + this.getCity() + " PostalCode: " + this.getPostalCode() + " Country:" + this.getCountry();
    }

    }





