package org.mohammed.ecommerce.service;

import org.mohammed.ecommerce.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class CategoryServiceMobile  {

    private List<Category>categories= new ArrayList();

    public List<Category> getAllCategory()
    {
        return categories;
    }

    public void addCategory(Category category) {
        categories.add(category);
    }
}
