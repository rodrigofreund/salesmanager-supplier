package com.rodrigofreund.salesmanager.supplier.unit;

import java.util.Collection;
import java.util.List;

import com.rodrigofreund.salesmanager.domain.Supplier;
import com.rodrigofreund.salesmanager.supplier.entity.model.SupplierImpl;

public interface AbstractSupplierTest {

    public static final int DEFAULT_ID = 1;
    public static final String DEFAULT_FILENAME = "keldrinLogo.png";
    public static final String DEFAULT_NAME = "Keldrin";
    public static final String DEFAULT_COLOR = "#18BC18";

    default Supplier createPersistedSupplier() {
        return SupplierImpl.of(DEFAULT_ID, DEFAULT_NAME, DEFAULT_COLOR, DEFAULT_FILENAME);
    }

    default Supplier createSupplier() {
        return SupplierImpl.of(DEFAULT_NAME, DEFAULT_COLOR, DEFAULT_FILENAME);
    }
    
    default Supplier createSupplierNullName() {
        return SupplierImpl.of(null, DEFAULT_COLOR, DEFAULT_FILENAME);
    }
    
    default Supplier createSupplierEmptyName() {
        return SupplierImpl.of("   ", DEFAULT_COLOR, DEFAULT_FILENAME);
    }
    
    default Supplier createSupplierWithInvalidName() {
        return SupplierImpl.of("Dorha AnlaDorha Anla Dorha Anla Dorha Anla Dorha Anla " +
                "Dorha Anla Dorha Anla Dorha Anla Dorha Anla", DEFAULT_COLOR, DEFAULT_FILENAME);
    }
    
    default Supplier createSupplierEmptyColor() {
        return SupplierImpl.of(DEFAULT_NAME, "", DEFAULT_FILENAME);
    }
    
    default Supplier createSupplierNullColor() {
        return SupplierImpl.of(DEFAULT_NAME, null, DEFAULT_FILENAME);
    }
    
    default Supplier createSupplierNullImage() {
        return SupplierImpl.of(DEFAULT_NAME, DEFAULT_COLOR, null);
    }
    
    default Supplier createSupplierEmptyImage() {
        return SupplierImpl.of(DEFAULT_NAME, DEFAULT_COLOR, "");
    }
    
    default Collection<Supplier> createDefaultSupplierList() {
        return List.of(
                createPersistedSupplier(),
                createPersistedSupplier(),
                createPersistedSupplier(),
                createPersistedSupplier());
    }

}
