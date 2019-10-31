package com.yoonkiss.flashcards.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FlashBook {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(nullable =  false)
    private String question;

    @Column(nullable = false)
    private String answer;

    @Column
    private String tag;

    @Column
    private int passed;

    @Column
    private int failed;

    @CreationTimestamp
    @Column(name = "create_at", nullable = false, updatable = false)
    private LocalDateTime createAt;

    @Builder
    public FlashBook(String question, String answer, String tag) {
        this.question = question;
        this.answer = answer;
        this.tag = tag;
    }
}
