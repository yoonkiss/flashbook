package com.yoonkiss.flashcards.presenter.rest.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class FlashBookVo {
    private Long id;
    private String question;
    private String answer;
    private String tag;

    private int passed;
    private int failed;

}
