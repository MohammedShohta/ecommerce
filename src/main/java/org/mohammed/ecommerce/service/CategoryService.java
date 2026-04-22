package org.mohammed.ecommerce.service;

import org.mohammed.ecommerce.model.Category;

import java.util.List;

public interface CategoryService {

     List<Category> getAllCategory();
     void addCategory(Category category);
     String deleteCategory(Integer categoryId);
     Category updateCategory(Category category,Integer categoryId);
     String getCategoryCreator(Integer id);
     Category showCategoryByCreatorName(String creatorName);
     void updateCategoryNameByCategoryId (String categoryName,Integer id);

}
