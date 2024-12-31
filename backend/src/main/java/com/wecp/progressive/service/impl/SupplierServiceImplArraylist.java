package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

public class SupplierServiceImplArraylist implements SupplierService  {
    private List<Supplier> suppliers = new ArrayList<>();

    @Override
    public int addSupplier(Supplier supplier) {
        suppliers.add(supplier);
        return suppliers.size();
    }

    @Override
    public void emptyArrayList() {
        
        SupplierService.super.emptyArrayList();
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        
        return suppliers;
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
      
        List <Supplier> sortedList = new ArrayList<>(suppliers);
        Collections.sort(sortedList);
        return sortedList;

    }

}