package com.wecp.progressive.dao;

import java.beans.Statement;
import java.util.ArrayList;
// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.SQLException;
import java.util.List;
// import java.sql.Statement;
import java.sql.*;

import com.wecp.progressive.config.DatabaseConnectionManager;
import com.wecp.progressive.entity.Product;

public class ProductDAOImpl implements ProductDAO {

    private Connection connection =  null;
// consturctier 


    @Override
    public int addProduct(Product product)  throws SQLException{
         connection = DatabaseConnectionManager.getConnection();
        // PreparedStatement pt = null;
        int generatedID = -1;
        String q = "insert into product (warehouse_id, product_name,product_description,quantity,price) values (?,?,?,?,?)";

        try(PreparedStatement pt = connection.prepareStatement(q,java.sql.Statement.RETURN_GENERATED_KEYS)) {

            pt.setInt(1,product.getWarehouseId());
            pt.setString(2, product.getProductName());
            pt.setString(3, product.getProductDescription());
            pt.setInt(4,product.getQuantity());
            pt.setDouble(5, product.getPrice());

            int rows = pt.executeUpdate();
            

            ResultSet rs = pt.getGeneratedKeys();

            if(rs.next()){
                product.setProductId(rs.getInt(1));
            }
             generatedID = rs.getInt(1);
            //  

             System.out.println("======= INSIDE ADD PRODUCT =============");

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally{
            if(!connection.isClosed()){
                connection.close();
            }
        }
        return generatedID;
    }

    @Override
    public void deleteProduct(int productId) throws SQLException {
        //
        connection = DatabaseConnectionManager.getConnection();
        String q = "delete product where product_id = ? ";

        try(PreparedStatement pt  = connection.prepareStatement(q)){
            pt.setInt(1,productId);

            pt.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
            throw e;
        } finally{
            if(!connection.isClosed()){
                connection.close();
            }
        }
        
    }

    @Override
    public List<Product> getAllProducts() throws SQLException {
        String q = "select * from product";
        List<Product> products = new ArrayList<>();

        connection = DatabaseConnectionManager.getConnection();

        try(PreparedStatement pt  = connection.prepareStatement(q)){
            ResultSet rs = pt.executeQuery();

            // List<Product> products = new ArrayList<>();

            while(rs.next()){
                Product product = new Product();

                product.setProductId(rs.getInt("product_id"));
                product.setPrice(rs.getLong("price"));
                product.setProductDescription(rs.getString("product_description"));
                product.setProductName(rs.getString("product_name"));
                product.setQuantity(rs.getInt("quantity"));
                product.setWarehouseId(rs.getInt("warehouse_id"));

                products.add(product);
            }

            // return products;
        } catch(SQLException e){
            e.printStackTrace();
            throw e;
        } finally{
            if(!connection.isClosed()){
                connection.close();
            }
        }
        return products;
    }

    @Override
    public Product getProductById(int productId) throws SQLException {
        connection = DatabaseConnectionManager.getConnection();
        Product product = new Product();

        String q  = "select * from product where product_id = ?";

        try(PreparedStatement pt = connection.prepareStatement(q)){
            pt.setInt(1,productId);

            ResultSet rs = pt.executeQuery();

            
            if(rs.next()){

                product.setProductId(rs.getInt("product_id"));
                product.setPrice(rs.getLong("price"));
                product.setProductDescription(rs.getString("product_description"));
                product.setProductName(rs.getString("product_name"));
                product.setQuantity(rs.getInt("quantity"));
                product.setWarehouseId(rs.getInt("warehouse_id"));

            }
            // return product;
        } catch(SQLException e){
            e.printStackTrace();
            throw e;
        }finally{
            if(!connection.isClosed()){
                connection.close();
            }
        }
        return product;
    }

    @Override
    public void updateProduct(Product product) throws SQLException {
        connection = DatabaseConnectionManager.getConnection();
        String q = "UPDATE product SET warehouse_id =?,product_name =?,product_description = ? ,quantity = ?,price=? where product_id = ? ";

        try(PreparedStatement pt = connection.prepareStatement(q)){
            pt.setInt(1,product.getWarehouseId());
            pt.setString(2, product.getProductName());
            pt.setString(3, product.getProductDescription());
            pt.setInt(4,product.getQuantity());
            pt.setDouble(5, product.getPrice());
            pt.setInt(6,product.getProductId());

            pt.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
            throw e;
        } finally{
            if(!connection.isClosed()){
                connection.close();
            }
        }
        
    }

}
