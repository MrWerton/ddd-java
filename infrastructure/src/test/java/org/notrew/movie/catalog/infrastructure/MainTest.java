package org.notrew.movie.catalog.infrastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void shouldReturnCategoryCorrectly() {
        final var category = new Main().handle();

        Assertions.assertNotNull(category);
    }
}
