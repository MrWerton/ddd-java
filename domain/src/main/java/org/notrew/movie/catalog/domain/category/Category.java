package org.notrew.movie.catalog.domain.category;

import java.time.Instant;
import java.util.UUID;

public class Category {
    private final String id;
    private final String name;
    private final String description;
    private final Instant createdAt;
    private final boolean isActive;
    private final Instant updatedAt;
    private final Instant deletedAt;

    private Category(
            String id,
            String name,
            String description,
            boolean isActive,
            Instant createdAt,
            Instant updatedAt,
            Instant deletedAt
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.isActive = isActive;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }


    public static Category newCategory(
            String name,
            String description,
            boolean isActive
    ) {
        final var id = UUID.randomUUID().toString();
        final var now = Instant.now();
        return new Category(id, name, description, isActive, now, now, null);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public boolean isActive() {
        return isActive;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public Instant getDeletedAt() {
        return deletedAt;
    }
}