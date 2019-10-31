package com.yoonkiss.flashcards.presenter.rest.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class FlashBookCreateVo {
    private String question;
    private String answer;
    private String tag;

    public static FlashBookCreateVo newInstance (String question, String answer, String tag) {
        return new FlashBookCreateVo(question, answer, tag);
    }
}
