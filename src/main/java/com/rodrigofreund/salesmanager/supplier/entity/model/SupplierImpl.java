package com.rodrigofreund.salesmanager.supplier.entity.model;

import java.util.Collection;

import com.rodrigofreund.salesmanager.domain.Associate;
import com.rodrigofreund.salesmanager.domain.PaymentTerm;
import com.rodrigofreund.salesmanager.domain.ProductCatalog;
import com.rodrigofreund.salesmanager.domain.Representative;
import com.rodrigofreund.salesmanager.domain.Supplier;

public final class SupplierImpl implements Supplier {

    private final Integer id;
    private final String name;
    private final String color;
    private final String image;
    private final Boolean active;

    public static Supplier of(String name, String color, String image) {
        return new SupplierImpl(null, name, color, image);
    }
    
    public static Supplier of(Integer id, String name, String color, String image) {
        return new SupplierImpl(id, name, color, image);
    }

    @Override
    public Integer id() {
        return this.id;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public String color() {
        return this.color;
    }

    @Override
    public String image() {
        return this.image;
    }

    @Override
    public Boolean active() {
        return this.active;
    }

    @Override
    public Collection<PaymentTerm> terms() {
        return null;
    }

    @Override
    public Collection<Associate> associates() {
        return null;
    }

    @Override
    public Collection<ProductCatalog> catalogs() {
        return null;
    }

    @Override
    public Collection<Representative> representations() {
        return null;
    }
    
    private SupplierImpl(Integer id, String name, String color, String image) {
        super();

        this.id = id;

        if(null != name && !name.isBlank() && name.length() <= 80) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Supplier name is invalid.");
        }

        if(null != color && !color.isBlank() && color.matches("^#[0-9A-F]{6}$")) {
            this.color = color;
        } else {
            throw new IllegalArgumentException("Supplier color is invalid.");
        }

        if(null != image && !image.isBlank()) {
            this.image = image;
        } else {
            throw new IllegalArgumentException("Supplier image is invalid.");
        }

        this.active = false;
    }

}
