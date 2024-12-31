package com.wecp.progressive.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.wecp.progressive.dao.ProductDAO;
import com.wecp.progressive.dao.ProductDAOImpl;
import com.wecp.progressive.entity.Product;
import com.wecp.progressive.service.ProductService;

public class ProductServiceImplJdbc implements ProductService {
     ProductDAO productDAO;

    public ProductServiceImplJdbc(ProductDAO productDAO){
        this.productDAO = productDAO;
    }


    @Override
    public int addProduct(Product product) throws SQLException {
        return productDAO.addProduct(product);
        // return 0;
    }

    @Override
    public void deleteProduct(int productId) throws SQLException {
        productDAO.deleteProduct(productId);
        
    }

    @Override
    public List<Product> getAllProducts() throws SQLException {
        return productDAO.getAllProducts();
        // return null;
    }

    @Override
    public Product getProductById(int productId) throws SQLException {
        return productDAO.getProductById(productId);
        // return null;
    }

    @Override
    public void updateProduct(Product product) throws SQLException {
        productDAO.updateProduct(product);
        
    }
    
}