package com.rodrigofreund.salesmanager.supplier.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.rodrigofreund.salesmanager.supplier.application.usecase.RetriveSupplierImpl;
import com.rodrigofreund.salesmanager.supplier.entity.gateway.SupplierRepository;

@ExtendWith(MockitoExtension.class)
public class RetrieveSupplierTest implements AbstractSupplierTest {

    @Mock
    private SupplierRepository repository;
    @InjectMocks
    private RetriveSupplierImpl retriveSupplier;

    @Test
    void retrieveSupplier() {

        when(retriveSupplier.list(1, 10, "name")).thenReturn(createDefaultSupplierList());

        var list = retriveSupplier.list(1,  10, "name");

        assertEquals(4, list.size());

    }

    @Test
    void getSupplierById() {

        when(retriveSupplier.getById(DEFAULT_ID)).thenReturn(Optional.of(createPersistedSupplier()));

        var supplier = retriveSupplier.getById(DEFAULT_ID);

        assertNotNull(supplier);
        assertTrue(supplier.isPresent());
    }
}
