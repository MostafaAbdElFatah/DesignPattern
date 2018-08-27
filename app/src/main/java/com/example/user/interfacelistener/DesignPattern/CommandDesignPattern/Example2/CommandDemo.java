package com.example.user.interfacelistener.DesignPattern.CommandDesignPattern.Example2;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
    public  void produceRequests() {
        List<Command> queue = new ArrayList<>();
        queue.add(new DomesticEngineer());
        queue.add(new Politician());
        queue.add(new Programmer());
        workOffRequests(queue);
    }

    public  void workOffRequests(List queue) {
        for (Object command : queue) {
            ((Command)command).execute();
        }
    }

}
