package org.mohammed.ecommerce.repos;
import jakarta.transaction.Transactional;
import org.mohammed.ecommerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface CategoryRepo extends JpaRepository<Category,Integer> {
//get category creator by id of category
@Query("SELECT x.categoryInfo.createdBy FROM Category x WHERE x.id = :id")
String showCategoryByCreator(Integer id);

//get category by category creator
@Query("SELECT x FROM Category x WHERE x.categoryInfo.createdBy = :createdBy")
Category showCategoryByCreatorName(String createdBy);
    //update category name by modify
    @Modifying
    @Transactional
    @Query("UPDATE Category c SET c.categoryName = :categoryName WHERE c.categoryId = :categoryId")
    void updateCategoryNameByCategoryId(
            @Param("categoryName") String categoryName,
            @Param("categoryId") Integer categoryId
    );


}
