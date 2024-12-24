package com.rodrigofreund.salesmanager.supplier.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class SupplierEntityTest  implements AbstractSupplierTest {

    @Test
    void createPersistedSupplier_thenCorrect() {
        var supplier = createPersistedSupplier();
        assertEquals(DEFAULT_ID, supplier.id());
        assertEquals(DEFAULT_NAME, supplier.name());
        assertEquals(DEFAULT_COLOR, supplier.color());
        assertEquals(DEFAULT_FILENAME, supplier.image());
    }
    
    @Test
    void createSupplier_thenCorrect() {
        var supplier = createSupplier();
        assertNull(supplier.id());
        assertEquals(DEFAULT_NAME, supplier.name());
        assertEquals(DEFAULT_COLOR, supplier.color());
        assertEquals(DEFAULT_FILENAME, supplier.image());

    }

    @Test
    void createSupplierWithoutName_thenFail() {
        assertThrows(IllegalArgumentException.class, () -> createSupplierEmptyName());
    }
    
    @Test
    void createSupplierWithNullName_thenFail() {
        assertThrows(IllegalArgumentException.class, () -> createSupplierNullName());
    }
    
    @Test
    void createSupplierWithInvalidName_thenFail() {
        assertThrows(IllegalArgumentException.class, () -> createSupplierWithInvalidName());
    }
    
    @Test
    void createSupplierWithoutColor_thenFail() {
        assertThrows(IllegalArgumentException.class, () -> createSupplierEmptyColor());
    }
    
    @Test
    void createSupplierWithNullColor_thenFail() {
        assertThrows(IllegalArgumentException.class, () -> createSupplierNullColor());
    }
    
    @Test
    void createSupplierWithoutImage_thenFail() {
        assertThrows(IllegalArgumentException.class, () -> createSupplierEmptyImage());
    }
    
    @Test
    void createSupplierWithNullImage_thenFail() {
        assertThrows(IllegalArgumentException.class, () -> createSupplierNullImage());
    }

}
