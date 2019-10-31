package com.yoonkiss.flashcards.core.domain;

import lombok.Value;

@Value
public class Identity {
    // @Value makes number as private final actually, but for readability.
    private final Long number;

    public static Identity nothing() {
        return new Identity(Long.MIN_VALUE);
    }
}
