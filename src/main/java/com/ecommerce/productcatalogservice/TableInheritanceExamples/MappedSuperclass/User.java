package com.ecommerce.productcatalogservice.TableInheritanceExamples.MappedSuperclass;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class User {
    private String email;

    @Id
    private Long id;
}
