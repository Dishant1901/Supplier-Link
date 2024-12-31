package com.wecp.progressive.entity;

public class Supplier implements Comparable<Supplier> {
private int supplierId;
private String supplierName;
private String email;
private String phone;
private String address;

private String role;

public Supplier() {
}

public Supplier(int supplierId, String supplierName, String email, String phone, String address,
        String role) {
    this.supplierId = supplierId;
    this.supplierName = supplierName;
    this.email = email;
    this.phone = phone;
    this.address = address;
    this.role = role;
}

public int getSupplierId() {
    return supplierId;
}

public void setSupplierId(int supplierId) {
    this.supplierId = supplierId;
}

public String getSupplierName() {
    return supplierName;
}

public void getSupplierNamename(String supplierName) {
    this.supplierName= supplierName;
}

public String getemail() {
    return email;
}

public void setemail(String email) {
    this.email = email;
}

public String getphone() {
    return phone;
}

public void setphone(String phone) {
    this.phone = phone;
}

public String getAddress() {
    return address;
}

public void setAddress(String address) {
    this.address = address;
}

public String getRole() {
    return role;
}

public void setRole(String role) {
    this.role = role;
}


@Override
public int compareTo(Supplier s){
    return this.supplierName.compareTo(s.getSupplierName());
}

}