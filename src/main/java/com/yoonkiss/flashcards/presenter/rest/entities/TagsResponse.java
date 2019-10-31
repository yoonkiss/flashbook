package com.yoonkiss.flashcards.presenter.rest.entities;

import com.yoonkiss.flashcards.core.domain.Tags;
import lombok.Value;

import java.util.List;
import java.util.stream.Collectors;

@Value
public class TagsResponse {
    private final Long id;
    private final String name;

    public static TagsResponse from(Tags tags) {
        return new TagsResponse(
                tags.getId().getNumber(),
                tags.getName()
        );
    }

    public static List<TagsResponse> from(List<Tags> tags) {
        return tags
                .parallelStream()
                .map(TagsResponse::from)
                .collect(Collectors.toList());
    }
}
