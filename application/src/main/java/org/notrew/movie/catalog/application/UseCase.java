package org.notrew.movie.catalog.application;


import org.notrew.movie.catalog.domain.category.Category;

public class UseCase {
    public Category execute() {
        return Category.newCategory("hi", "hello", true);
    }

}