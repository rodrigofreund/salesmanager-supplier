package com.rodrigofreund.salesmanager.supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.rodrigofreund.salesmanager.domain.Supplier;
import com.rodrigofreund.salesmanager.supplier.application.usecase.CreateSupplierImpl;
import com.rodrigofreund.salesmanager.supplier.entity.gateway.SupplierRepository;
import com.rodrigofreund.salesmanager.supplier.entity.model.SupplierImpl;

@ExtendWith(MockitoExtension.class)
public class CreateSupplierTest {

    @Mock
    private SupplierRepository repository;

    @InjectMocks
    private CreateSupplierImpl createSupplier;

    @Test
    void createBasicSupplierThenCorrect() {
        
        when(repository.save(any())).thenReturn(createPersistedSupplier());

        Supplier newSupplier = createSupplier();

        Supplier supplier = createSupplier.create(newSupplier);

        assertNotNull(supplier.id());
        assertEquals(newSupplier.name(), supplier.name());
        assertEquals(newSupplier.color(), supplier.color());
        assertEquals(newSupplier.image(), supplier.image());
        assertFalse(supplier.active());
    }
    
    private Supplier createPersistedSupplier() {
        return SupplierImpl.of(1, "Keldrin", "#18BC18", "keldrinLogo.png");
    }

    private Supplier createSupplier() {
        return SupplierImpl.of("Keldrin", "#18BC18", "keldrinLogo.png");
    }
}
