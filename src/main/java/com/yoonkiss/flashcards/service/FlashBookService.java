package com.yoonkiss.flashcards.service;

import com.yoonkiss.flashcards.com.yoonkiss.flashbook.repository.jpa.FlashBookRepository;
import com.yoonkiss.flashcards.model.FlashBook;
import com.yoonkiss.flashcards.presenter.rest.entities.FlashBookCreateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class FlashBookService {

    @Autowired
    private FlashBookRepository flashBookRepository;

    public FlashBook createFlashBook(FlashBookCreateVo createVo) {

        FlashBook book = FlashBook.builder().question(createVo.getQuestion())
                .answer(createVo.getAnswer())
                .tag(createVo.getTag())
                .build();

        return flashBookRepository.save(book);

    }

}
