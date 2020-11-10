package com.mapsa.domain;

import javax.persistence.*;

@Entity
public class Product {
    private long id;
    private String productNumber;
    private String name;
    private String color;
    private String photo;
    private String remarks;
    private long lockVersion;
    private Category categoryByCategoryId;
    private Lineitem lineitemByLineitemId;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PRODUCT_NUMBER")
    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "COLOR")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "PHOTO")
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
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

        Product product = (Product) o;

        if (id != product.id) return false;
        if (lockVersion != product.lockVersion) return false;
        if (productNumber != null ? !productNumber.equals(product.productNumber) : product.productNumber != null)
            return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        if (color != null ? !color.equals(product.color) : product.color != null) return false;
        if (photo != null ? !photo.equals(product.photo) : product.photo != null) return false;
        if (remarks != null ? !remarks.equals(product.remarks) : product.remarks != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (productNumber != null ? productNumber.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (int) (lockVersion ^ (lockVersion >>> 32));
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID", referencedColumnName = "ID", nullable = false)
    public Category getCategoryByCategoryId() {
        return categoryByCategoryId;
    }

    public void setCategoryByCategoryId(Category categoryByCategoryId) {
        this.categoryByCategoryId = categoryByCategoryId;
    }

    @ManyToOne
    @JoinColumn(name = "LINEITEM_ID", referencedColumnName = "ID", nullable = false)
    public Lineitem getLineitemByLineitemId() {
        return lineitemByLineitemId;
    }

    public void setLineitemByLineitemId(Lineitem lineitemByLineitemId) {
        this.lineitemByLineitemId = lineitemByLineitemId;
    }
}
