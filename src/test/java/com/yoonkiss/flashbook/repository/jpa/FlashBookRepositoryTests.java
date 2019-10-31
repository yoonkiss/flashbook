package com.yoonkiss.flashbook.repository.jpa;

import com.yoonkiss.flashcards.com.yoonkiss.flashbook.repository.jpa.FlashBookRepository;
import com.yoonkiss.flashcards.model.FlashBook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class FlashBookRepositoryTests {

    @Autowired
    FlashBookRepository flashBookRepository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testFlashBookRepository() {
        // given
        FlashBook flashBook = FlashBook.builder().question("question test..")
                .answer("answer test..").build();

        // and
        entityManager.persistAndFlush(flashBook);

        // when
        List<FlashBook> books = flashBookRepository.findAll();

        // then
        assertThat(books).isNotNull().hasSize(1);

        assertThat(books.get(0).getQuestion()).isEqualTo("question test..");
        assertThat(books.get(0).getAnswer()).isEqualTo("answer test..");

    }

}
