package com.yoonkiss.flashcards.data.db.jpa.repositories;

import com.yoonkiss.flashcards.data.db.jpa.entities.TagsData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaTagsRepository extends JpaRepository<TagsData, Long> {
}
