package com.wecp.progressive.dao;

import java.util.List;
import java.sql.*;

import com.wecp.progressive.config.DatabaseConnectionManager;
import com.wecp.progressive.entity.Warehouse;

public class WarehouseDAOImpl implements WarehouseDAO {
    private Connection connection = null;


    @Override
    public int addWarehouse(Warehouse warehouse) throws SQLException{
        connection = DatabaseConnectionManager.getConnection();

        int generatedID = -1;
        // String q = "insert into warehouse ()"

        // try(PreparedStatement pt = connection.prepareStatement(q,Statement.RETURN_GENERATED_KEYS))
        return generatedID;
        
    }

    @Override
    public void deleteWarehouse(int warehouseId) {
       
        
    }

    @Override
    public List<Warehouse> getAllWarehouse() {

        return null;
    }

    @Override
    public Warehouse getWarehouseById(int warehouseId) {
      
        return null;
    }

    @Override
    public void updateWarehouse(Warehouse warehouse) {
        
        
    }

}
