package org.mohammed.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryInfo {

    @Column(nullable = false)
    private String createdBy="Mohammed";
}
