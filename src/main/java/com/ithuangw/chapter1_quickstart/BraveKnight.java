package com.ithuangw.chapter1_quickstart;

public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkedOnQuest() {
        quest.embark();
    }
}
