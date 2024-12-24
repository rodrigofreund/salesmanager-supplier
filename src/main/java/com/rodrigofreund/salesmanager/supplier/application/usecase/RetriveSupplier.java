package com.rodrigofreund.salesmanager.supplier.application.usecase;

import java.util.Collection;
import java.util.Optional;

import com.rodrigofreund.salesmanager.domain.Supplier;

public interface RetriveSupplier {

    Collection<Supplier> list(Integer page, Integer size, String sort);

    Optional<Supplier> getById(Integer i);

}
