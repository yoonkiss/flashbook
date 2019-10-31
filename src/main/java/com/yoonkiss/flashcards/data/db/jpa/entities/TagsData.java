package com.yoonkiss.flashcards.data.db.jpa.entities;

import com.yoonkiss.flashcards.core.domain.Identity;
import com.yoonkiss.flashcards.core.domain.Tags;
import lombok.*;

import javax.persistence.*;

import static com.yoonkiss.flashcards.data.db.jpa.entities.IdConverter.convertId;

@AllArgsConstructor
@Entity(name = "tags")
@Getter
@NoArgsConstructor
@Setter
@Table(name = "tags")
@EqualsAndHashCode(of = {"name"})
@ToString(of = {"name"})
public class TagsData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    // TODO: test
    public static TagsData from(Tags tags) {
        return new TagsData(
                convertId(tags.getId()),
                tags.getName());
    }

    // TODO: test
    public Tags fromThis() {
        return new Tags (
                new Identity(id),
                name
        );
    }
}
