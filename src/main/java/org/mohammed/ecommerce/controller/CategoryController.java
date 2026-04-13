package org.mohammed.ecommerce.controller;

import org.mohammed.ecommerce.model.Category;
import org.mohammed.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;


@RestController
public class CategoryController {
    CategoryService categories;
    @Autowired
    public CategoryController (CategoryService categoryService)
                       {
       this.categories = categoryService;

    }
    @GetMapping("/api/public/categories")
    public ResponseEntity<List<Category>>getAllCategory()
    {
        List<Category>category=categories.getAllCategory();
        return new ResponseEntity<>(category,HttpStatus.OK);
    }

    @PostMapping("/api/public/categories")
    public ResponseEntity<String> addCategory(@RequestBody Category category)
    {
        categories.addCategory(category);
        return new ResponseEntity<>("Category Added Successfully",HttpStatus.CREATED);
    }

    @DeleteMapping("/api/admin/categories/{categoryId}")
     public ResponseEntity<String> deleteCategory(@PathVariable Integer categoryId)
    {
        try{
            String status=categories.deleteCategory(categoryId);
            return new ResponseEntity<>(status, HttpStatus.OK);
        }
        catch (ResponseStatusException e)
        {
         return new ResponseEntity<>(e.getReason(),e.getStatusCode());
        }

    }
    @PutMapping("/api/admin/categories/{categoryId}")
    public ResponseEntity<Category> upadteCategory(@RequestBody Category category,@PathVariable Integer categoryId)
    {
        try{
          Category updatedCategory= categories.updateCategory(category,categoryId);
            return new ResponseEntity<>(updatedCategory, HttpStatus.OK);
        }
        catch(ResponseStatusException e)
        {
           return new ResponseEntity<>(e.getStatusCode());
        }
    }

}
