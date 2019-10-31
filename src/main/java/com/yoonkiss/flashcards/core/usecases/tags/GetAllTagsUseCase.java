package com.yoonkiss.flashcards.core.usecases.tags;

import com.yoonkiss.flashcards.core.domain.Tags;
import com.yoonkiss.flashcards.core.usecases.UseCase;
import lombok.Value;

import java.util.List;

public class GetAllTagsUseCase extends UseCase<GetAllTagsUseCase.InputValues, GetAllTagsUseCase.OutputValues> {

    private TagsRepository repository;

    public GetAllTagsUseCase(TagsRepository repository) {
        this.repository = repository;
    }

    @Override
    public OutputValues execute(InputValues input) {
        return new OutputValues(repository.getAll());
    }

    @Value
    public static class InputValues implements UseCase.InputValues {
    }

    @Value
    public static class OutputValues implements UseCase.OutputValues {
        private final List<Tags> tags;
    }
}
