package org.mohammed.ecommerce.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.mohammed.ecommerce.repos.CategoryRepo;

import java.beans.ConstructorProperties;

@Entity
public class Category {

    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    private String categoryName;

    public Category()
    {

    }

    public Category(Integer categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }
    public Integer getCategoryId() {
        return categoryId;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName)
    {
        this.categoryName=categoryName;
    }


}
