package com.yoonkiss.flashcards.presenter.config;

import com.yoonkiss.flashcards.core.usecases.tags.GetAllTagsUseCase;
import com.yoonkiss.flashcards.core.usecases.tags.TagsRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Module {

    @Bean
    public GetAllTagsUseCase getAllTagsUseCase(TagsRepository repository) {
        return new GetAllTagsUseCase(repository);
    }
}
