package Day6;

public class Suppliers {
    int SupplierID;
    String SupplierName;
    String ContactName;
    String Address;
    String City;
    String Postalcode;

    public int getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(int supplierID) {
        SupplierID = supplierID;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String supplierName) {
        SupplierName = supplierName;
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

    public String getPostalcode() {
        return Postalcode;
    }

    public void setPostalcode(String postalcode) {
        Postalcode = postalcode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    String Country;
    String Phone;



 @Override
    public String toString(){
        return "SupplierID: "+this.getSupplierID()+" SupplierName: "+this.getSupplierName()+"Contactname:"+this.getContactName()+" Address:" +this.getAddress()+ " City:"+this.getCity()+" PostalCode:"+this.getPostalcode()+" Country:"+this.getCountry();

 }


}
