package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.impl.SupplierServiceImplArraylist;
import com.wecp.progressive.service.impl.SupplierServiceImplJpa;

import org.aspectj.lang.annotation.control.CodeGenerationHint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    private SupplierServiceImplArraylist supplierServiceImplArraylist;

    @Autowired 
    private SupplierServiceImplJpa supplierServiceImplJpa;


    @GetMapping
    public ResponseEntity<List<Supplier>> getAllSuppliers() {
        try {
            return new ResponseEntity<List<Supplier>>(supplierServiceImplJpa.getAllSuppliers(),HttpStatus.OK);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    
    @CodeGenerationHint
    public ResponseEntity<Supplier> getSupplierById(int supplierId) {

        try {
            return new ResponseEntity <Supplier> (supplierServiceImplArraylist.getSupplierById(supplierId),HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ResponseEntity<Integer> addSupplier(Supplier supplier) {

        try {
            return new ResponseEntity<Integer>(supplierServiceImplArraylist.addSupplier(supplier),HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return null;
    }

    public ResponseEntity<Void> updateSupplier(Supplier supplier) {
        try {
            
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return null;
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public ResponseEntity<Void> deleteSupplier(int supplierId) {
        return null;
    }

    public ResponseEntity<List<Supplier>> getAllSuppliersFromArrayList() {
        return null;
    }

    public ResponseEntity<Integer> addSupplierToArrayList(Supplier supplier) {
        return null;
    }

    public ResponseEntity<List<Supplier>> getAllSuppliersSortedByNameFromArrayList() {
        return null;
    }
}