package com.crud.tasks.service;

import com.crud.tasks.domain.*;
import com.crud.tasks.mapper.config.AdminConfig;
import com.crud.tasks.trello.client.TrelloClient;
import com.crud.tasks.trello.config.TrelloConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TrelloServiceTest {

    @InjectMocks
    private TrelloService trelloService;

    @Mock
    private TrelloClient trelloClient;
    @Mock
    private SimpleEmailService emailService;
    @Mock
    private AdminConfig adminConfig;
    @Mock
    private TrelloConfig trelloConfig;


    @Test
    void shouldFetchTrelloBoards() {
        //Given
        List<TrelloListDto> trelloListDto = new ArrayList<>();
        trelloListDto.add(new TrelloListDto("3", "listDto1", false));
        List<TrelloBoardDto> trelloBoardDtoList = List.of(new TrelloBoardDto("id", "test", trelloListDto));
        when(trelloClient.getTrelloBoards()).thenReturn(trelloBoardDtoList);
        //When
        List<TrelloBoardDto> fetchedTrelloBoardDtos = trelloService.fetchTrelloBoards();
        //Then
        Assertions.assertNotNull(fetchedTrelloBoardDtos);
        Assertions.assertEquals("test", fetchedTrelloBoardDtos.get(0).getName());
    }


    @Test
    void shouldFetchEmptyList() {
        // Given
        List<TrelloListDto> trelloLists =
                List.of(new TrelloListDto("1", "test_list", false));
        List<TrelloBoardDto> trelloBoards =
                List.of(new TrelloBoardDto("1", "test", trelloLists));
        when(trelloService.fetchTrelloBoards()).thenReturn(List.of());
        // When
        List<TrelloBoardDto> trelloBoardDtos = trelloService.fetchTrelloBoards();
        // Then
        assertTrue(trelloBoardDtos.isEmpty());
    }

    @Test
    void createdTrelloCardDtoTest() {
        //Given
        CreatedTrelloCardDto createdTrelloCardDto = new CreatedTrelloCardDto("1", "name", "createdTrelloCardDto.com");
        TrelloCardDto trelloCardDto = new TrelloCardDto();
        //When
        when(trelloService.createTrelloCard(trelloCardDto)).thenReturn(createdTrelloCardDto);
        CreatedTrelloCardDto newCard = trelloService.createTrelloCard(trelloCardDto);
        //Then
        assertEquals(newCard, createdTrelloCardDto);
    }
}