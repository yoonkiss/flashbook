package com.yoonkiss.flashcards.data.db.jpa.repositories;

import com.yoonkiss.flashcards.core.domain.Identity;
import com.yoonkiss.flashcards.core.domain.Tags;
import com.yoonkiss.flashcards.core.usecases.tags.TagsRepository;
import com.yoonkiss.flashcards.data.db.jpa.entities.TagsData;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class TagsRepositoryImpl implements TagsRepository {
    private JpaTagsRepository repository;

    public TagsRepositoryImpl(JpaTagsRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Tags> getAll() {
        return repository
                .findAll()
                .parallelStream()
                .map(TagsData::fromThis)
                .collect(Collectors.toList());
    }

    @Override
    public Tags persist(Tags tags) {
        return null;
    }

    @Override
    public Optional<Tags> getById(Identity id) {
        return Optional.empty();
    }
}
