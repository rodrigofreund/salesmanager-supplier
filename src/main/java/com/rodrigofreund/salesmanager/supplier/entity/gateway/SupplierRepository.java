package com.rodrigofreund.salesmanager.supplier.entity.gateway;

import com.rodrigofreund.salesmanager.domain.Supplier;

public interface SupplierRepository {

    Supplier save(Supplier supplier);
}
