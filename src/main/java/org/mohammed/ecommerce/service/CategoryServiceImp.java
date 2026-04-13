package org.mohammed.ecommerce.service;
import org.mohammed.ecommerce.model.Category;
import org.mohammed.ecommerce.repos.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;


@Service("category")
public class CategoryServiceImp  implements CategoryService{

    @Autowired
    private CategoryRepo categoryRepo;
    private Integer generateId;
    public List<Category> getAllCategory()
    {
        return categoryRepo.findAll();
    }
    public void addCategory(Category category)
    {
        categoryRepo.save(category);

    }
    public String deleteCategory(Integer categoryId)
    {
        List<Category> categories=categoryRepo.findAll();

        Category category=categories.stream()
                .filter(c->c.getCategoryId().equals(categoryId))
                .findFirst()
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Category Not Found"));
        categoryRepo.delete(category);
        return "Category Deleted Succssfuly";
    }
    public Category updateCategory(Category category ,Integer categoryId)
    {
                Category category1=categoryRepo.findById(categoryId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "NOT FOUND RESOURCE"));
               category1.setCategoryName(category.getCategoryName());
               Category savedCategory=categoryRepo.save(category1);
               return savedCategory;

    }
}
