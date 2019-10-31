package com.yoonkiss.flashcards.presenter.rest.tags;

import com.yoonkiss.flashcards.presenter.rest.entities.TagsResponse;
import com.yoonkiss.flashcards.presenter.rest.common.FlashBookConstants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping(FlashBookConstants.API_V1)
public interface TagsResource {

    @GetMapping("/tags")
    CompletableFuture<List<TagsResponse>> getAll();

}
