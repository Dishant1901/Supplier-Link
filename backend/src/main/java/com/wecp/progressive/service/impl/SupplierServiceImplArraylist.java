package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

public class SupplierServiceImplArraylist implements SupplierService  {
    private List<Supplier> suppliers = new ArrayList<>();
    
    @Override
    public int addSupplier(Supplier supplier) {
        
        return 0;
    }

    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
        SupplierService.super.emptyArrayList();
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
        // TODO Auto-generated method stub
        return null;
    }

}