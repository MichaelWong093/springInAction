package com.ithuangw.chapter1_quickstart;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class BraveKnightTest {


    @Test
    public void test() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkedOnQuest();
        verify(mockQuest,times(1)).embark();
    }

}