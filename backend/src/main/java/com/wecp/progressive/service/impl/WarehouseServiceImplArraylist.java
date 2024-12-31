package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.WarehouseService;

public class WarehouseServiceImplArraylist implements WarehouseService  {

    private List<Warehouse> warehouseList = new ArrayList<>();

    @Override
    public int addWarehouse(Warehouse warehouse) {
       warehouseList.add(warehouse);
       return warehouseList.size();
    }

    @Override
    public List<Warehouse> getAllWarehouses() {
        
        return warehouseList;
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() {
       
        List<Warehouse> sortedList = new ArrayList<>(warehouseList);
        Collections.sort(sortedList);
        return sortedList;


    }

}