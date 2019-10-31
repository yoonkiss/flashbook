package com.yoonkiss.flashcards.data.db.jpa.entities;

import com.yoonkiss.flashcards.core.domain.Identity;

public final class IdConverter {

    public static Long convertId(Identity id) {
        if (id != null && id.getNumber() != Long.MIN_VALUE) {
            return id.getNumber();
        }

        return null;
    }
}
