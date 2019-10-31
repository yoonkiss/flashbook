package com.yoonkiss.flashcards.presenter.rest.tags;

import com.yoonkiss.flashcards.core.usecases.UseCaseExecutor;
import com.yoonkiss.flashcards.core.usecases.tags.GetAllTagsUseCase;
import com.yoonkiss.flashcards.presenter.rest.entities.TagsResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Component
public class TagsController implements TagsResource {
    private UseCaseExecutor useCaseExecutor;
    private GetAllTagsUseCase getAllTagsUseCase;

    public TagsController(UseCaseExecutor useCaseExecutor,
                          GetAllTagsUseCase getAllTagsUseCase) {
        this.useCaseExecutor = useCaseExecutor;
        this.getAllTagsUseCase = getAllTagsUseCase;
    }

    @Override
    public CompletableFuture<List<TagsResponse>> getAll() {
        return useCaseExecutor.execute(
                getAllTagsUseCase,
                new GetAllTagsUseCase.InputValues(),
                (outputValues) -> TagsResponse.from(outputValues.getTags()));
    }
}
