package org.notrew.movie.catalog.infrastructure;

import org.notrew.movie.catalog.application.UseCase;
import org.notrew.movie.catalog.domain.category.Category;

public class Main {
    public Category handle() {
        return new UseCase().execute();
    }
}