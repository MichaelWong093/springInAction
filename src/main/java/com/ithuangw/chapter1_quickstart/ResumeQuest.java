package com.ithuangw.chapter1_quickstart;

import java.io.PrintStream;

public class ResumeQuest implements Quest {

    private PrintStream stream;

    public ResumeQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Resume is brave!");
    }
}
