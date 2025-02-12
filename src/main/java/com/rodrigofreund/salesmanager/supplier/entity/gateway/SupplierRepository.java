package com.rodrigofreund.salesmanager.supplier.entity.gateway;

import java.util.Collection;
import java.util.Optional;

import com.rodrigofreund.salesmanager.domain.Supplier;

public interface SupplierRepository {

    Supplier save(Supplier supplier);

    Collection<Supplier> list(Integer page, Integer size, String sort);

    Optional<Supplier> getById(Integer i);

}
