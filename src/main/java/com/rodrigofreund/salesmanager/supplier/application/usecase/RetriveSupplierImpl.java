package com.rodrigofreund.salesmanager.supplier.application.usecase;

import java.util.Collection;
import java.util.Optional;

import com.rodrigofreund.salesmanager.domain.Supplier;
import com.rodrigofreund.salesmanager.supplier.entity.gateway.SupplierRepository;

public class RetriveSupplierImpl implements RetriveSupplier {

    private SupplierRepository repository;

    public RetriveSupplierImpl(SupplierRepository repository) {
        this.repository = repository;
    }

    @Override
    public Collection<Supplier> list(Integer page, Integer size, String sort) {
        return this.repository.list(page, size, sort);
    }

    @Override
    public Optional<Supplier> getById(Integer i) {
        return this.repository.getById(i);
    }
}
