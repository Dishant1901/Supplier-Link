// package com.wecp.progressive;

// public class SupplyLinkApplication {
//     public static void main(String[] args) {
//         System.out.println("Welcome to SupplyLink Project!");
//     }
// }


package com.wecp.progressive;
 
import java.sql.SQLException;
 
import com.wecp.progressive.dao.ProductDAOImpl;
import com.wecp.progressive.entity.Product;
 
public class SupplyLinkApplication {
    public static void main(String[] args) throws SQLException {
        System.out.println("Welcome to SupplyLink Project!");
 
        ProductDAOImpl pimpl = new ProductDAOImpl();
 
       // INSERT INTO product (warehouse_id,product_name,product_decription,quantity,price) VALUES (?,?,?,?,?)
       Product p1 =  new Product();
       p1.setWarehouseId(1);
       p1.setProductName("Apple Laptop");
       p1.setProductDescription("Apple Lap");
       p1.setQuantity(1);
       p1.setPrice(5000L);
       pimpl.addProduct(p1);
       Product p = pimpl.getProductById(1);
       System.out.println(p.getProductName());
    }
}
 
// has context menu