package com.yoonkiss.flashcards.com.yoonkiss.flashbook.repository.jpa;

import com.yoonkiss.flashcards.model.FlashBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FlashBookRepository extends JpaRepository<FlashBook, Long> {

    Optional<FlashBook> getById(Long id);
}
