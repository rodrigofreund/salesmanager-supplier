package com.rodrigofreund.salesmanager.supplier.application.usecase;

import com.rodrigofreund.salesmanager.domain.Supplier;
import com.rodrigofreund.salesmanager.supplier.entity.gateway.SupplierRepository;

public class CreateSupplierImpl implements CreateSupplier {

    private final SupplierRepository repository;

    public CreateSupplierImpl(SupplierRepository repository) {
        this.repository = repository;
    }

    @Override
    public Supplier create(Supplier newSupplier) {
        return repository.save(newSupplier);
    }

}
