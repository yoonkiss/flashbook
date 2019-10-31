package com.yoonkiss.flashbook.presenter.rest.book;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yoonkiss.flashcards.model.FlashBook;
import com.yoonkiss.flashcards.presenter.rest.book.FlashBookController;
import com.yoonkiss.flashcards.presenter.rest.entities.FlashBookCreateVo;
import com.yoonkiss.flashcards.service.FlashBookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(value = FlashBookController.class)
public class FlashBookControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FlashBookService mockFlashBookService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testCreateFlashBook() throws Exception {
        // assume

        FlashBookCreateVo flashBookCreateVo = new FlashBookCreateVo();

        FlashBook flashBook = FlashBook.builder().question("question..1").answer("answer..1").tag("tag..1").build();

        when(mockFlashBookService.createFlashBook(any())).thenReturn(flashBook);

        this.mockMvc.perform(post("/api/v1/flashbook")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(objectMapper.writeValueAsString(flashBookCreateVo)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.question").value("question..1"))
                .andExpect(jsonPath("$.answer").value("answer..1"))
                .andExpect(jsonPath("$.tag").value("tag..1"));

        // argThat( // 인자 값을 체크 할 수 도 있다
        //                (FlashBookCreateVo createVo) -> "question..1".equals(createVo.getQuestion()
        verify(mockFlashBookService, times(1)).createFlashBook(any());


    }
}
