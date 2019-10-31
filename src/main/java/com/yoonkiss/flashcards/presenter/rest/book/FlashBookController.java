package com.yoonkiss.flashcards.presenter.rest.book;

import com.yoonkiss.flashcards.model.FlashBook;
import com.yoonkiss.flashcards.presenter.rest.entities.FlashBookCreateVo;
import com.yoonkiss.flashcards.service.FlashBookService;
import com.yoonkiss.flashcards.presenter.rest.common.FlashBookConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@RequestMapping(FlashBookConstants.API_V1)
public class FlashBookController {

    @Autowired
    FlashBookService flashBookService;

    @PostMapping("/flashbook")
    public ResponseEntity<FlashBook> createFlashBook(@RequestBody FlashBookCreateVo createVo) {
        FlashBook book = flashBookService.createFlashBook(createVo);

        return new ResponseEntity<FlashBook>(book, HttpStatus.CREATED);
    }
}
