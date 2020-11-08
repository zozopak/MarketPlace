package com.mapsa.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adress {
    private long id;
    private String province;
    private String city;
    private String street;
    private String floor;
    private String unit;
    private long customerId;
    private long vendorId;
    private String remarks;
    private long lockVersion;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PROVINCE")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "CITY")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "STREET")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "FLOOR")
    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Basic
    @Column(name = "UNIT")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "CUSTOMER_ID")
    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "VENDOR_ID")
    public long getVendorId() {
        return vendorId;
    }

    public void setVendorId(long vendorId) {
        this.vendorId = vendorId;
    }

    @Basic
    @Column(name = "REMARKS")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "LOCK_VERSION")
    public long getLockVersion() {
        return lockVersion;
    }

    public void setLockVersion(long lockVersion) {
        this.lockVersion = lockVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Adress adress = (Adress) o;

        if (id != adress.id) return false;
        if (customerId != adress.customerId) return false;
        if (vendorId != adress.vendorId) return false;
        if (lockVersion != adress.lockVersion) return false;
        if (province != null ? !province.equals(adress.province) : adress.province != null) return false;
        if (city != null ? !city.equals(adress.city) : adress.city != null) return false;
        if (street != null ? !street.equals(adress.street) : adress.street != null) return false;
        if (floor != null ? !floor.equals(adress.floor) : adress.floor != null) return false;
        if (unit != null ? !unit.equals(adress.unit) : adress.unit != null) return false;
        if (remarks != null ? !remarks.equals(adress.remarks) : adress.remarks != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (floor != null ? floor.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (int) (customerId ^ (customerId >>> 32));
        result = 31 * result + (int) (vendorId ^ (vendorId >>> 32));
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (int) (lockVersion ^ (lockVersion >>> 32));
        return result;
    }
}
