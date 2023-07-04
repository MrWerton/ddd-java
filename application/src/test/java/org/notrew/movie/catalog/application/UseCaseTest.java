package org.notrew.movie.catalog.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UseCaseTest {

    @Test
    public void shouldCallExecuteMethodInAndCreateCategoryCorrectly() {
        final var usecase = new UseCase();
        final var category = usecase.execute();

        Assertions.assertNotNull(category);
    }
}
