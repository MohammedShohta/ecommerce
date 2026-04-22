package org.mohammed.ecommerce.model;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="categories",
uniqueConstraints =@UniqueConstraint(name="categoryUniqueName",columnNames = "category_name"))
public class Category {
    @Id
    @SequenceGenerator(name="sequence"
    ,sequenceName = "category_sequence"
    ,allocationSize = 1)
    @GeneratedValue(strategy =GenerationType.SEQUENCE,generator = "sequence")
    private Integer categoryId;
    @Column(name="category_name",
    nullable=false)
    private String categoryName;
    @Embedded
    private CategoryInfo categoryInfo;
}
