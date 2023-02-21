package com.crud.tasks.mapper;

import com.crud.tasks.domain.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class TrelloMapperTest {
    private TrelloMapper trelloMapper = new TrelloMapper();

    @Test
    void mapToBoardsTest(){
        //Given
        TrelloListDto listDto = new TrelloListDto("1", "listDto1", true);
        List<TrelloListDto> trelloList = new ArrayList<>();
        trelloList.add(listDto);
        TrelloBoardDto boardDto = new TrelloBoardDto("1", "board", trelloList);
        //When
        List <TrelloBoardDto> trelloBoard = new ArrayList<>();
        trelloBoard.add(boardDto);
        List <TrelloBoard> testList = trelloMapper.mapToBoards(trelloBoard);
        //Then
        assertEquals(1, testList.size());
        assertEquals("1", trelloBoard.get(0).getId());
        assertEquals("board", trelloBoard.get(0).getName());
        assertEquals(1, trelloBoard.get(0).getLists().size());
    }

    @Test
    void mapToBoardsDtoTest(){
        //Given
        TrelloList list = new TrelloList("1", "listDto1", true);
        List<TrelloList> trelloList = new ArrayList<>();
        trelloList.add(list);
        TrelloBoard trelloBoard = new TrelloBoard("1", "board", trelloList);
        //When
        List <TrelloBoard> trelloBoards = new ArrayList<>();
        trelloBoards.add(trelloBoard);
        List <TrelloBoardDto> trelloBoardDtos = trelloMapper.mapToBoardsDto(trelloBoards);
        //Then
        assertEquals(1, trelloBoardDtos.size());
        assertEquals("1", trelloBoardDtos.get(0).getId());
        assertEquals("board", trelloBoardDtos.get(0).getName());
        assertEquals(1, trelloBoardDtos.get(0).getLists().size());
    }

    @Test
    void mapToListTest(){
        //Given
        TrelloListDto listDto = new TrelloListDto("1", "listDto1", true);
        List<TrelloListDto> trelloList = new ArrayList<>();
        trelloList.add(listDto);
        //When
        List <TrelloList> trelloLists = trelloMapper.mapToList(trelloList);
        //Then
        assertEquals(1, trelloLists.size());
        assertEquals("1", trelloList.get(0).getId());
        assertEquals("listDto1", trelloList.get(0).getName());
    }

    @Test
    void mapToListDtoTest(){
        //Given
        TrelloList list = new TrelloList("1", "listDto1", true);
        List<TrelloList> trelloList = new ArrayList<>();
        trelloList.add(list);
        //When
        List <TrelloListDto> trelloLists = trelloMapper.mapToListDto(trelloList);
        //Then
        assertEquals(1, trelloLists.size());
        assertEquals("1", trelloList.get(0).getId());
        assertEquals("listDto1", trelloList.get(0).getName());

    }

    @Test
    void mapToCardTest(){
        //Given
        TrelloCardDto trelloCard = new TrelloCardDto("card1", "description1", "1", "1");
        //When
        TrelloCard trelloCard1 = trelloMapper.mapToCard(trelloCard);
        //Then
        assertEquals("card1", trelloCard1.getName());
        assertEquals("description1", trelloCard.getDescription());
        assertEquals("1", trelloCard.getPos());
        assertEquals("1", trelloCard.getListId());
    }

    @Test
    void mapToCardDtoTest(){
        //Given
        TrelloCard trelloCard = new TrelloCard("card1", "description1", "1", "1");
        //When
        TrelloCardDto trelloCard1 = trelloMapper.mapToCardDto(trelloCard);
        //Then
        assertEquals("card1", trelloCard1.getName());
        assertEquals("description1", trelloCard1.getDescription());
        assertEquals("1", trelloCard1.getPos());
        assertEquals("1", trelloCard1.getListId());
    }
}