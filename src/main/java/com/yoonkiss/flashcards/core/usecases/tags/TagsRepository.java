package com.yoonkiss.flashcards.core.usecases.tags;

import com.yoonkiss.flashcards.core.domain.Identity;
import com.yoonkiss.flashcards.core.domain.Tags;

import java.util.List;
import java.util.Optional;

public interface TagsRepository {
    List<Tags> getAll();

    Tags persist(Tags tags);

    Optional<Tags> getById(Identity id);
}
