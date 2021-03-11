package com.root.service;


import akka.actor.typed.ActorSystem;
import lombok.extern.log4j.Log4j2;

import java.io.IOException;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        ActorSystem<PcLine.Command> system = ActorSystem.create(PcLine.create(), "pc_assembly");
        Stream.iterate(0, n -> n + 1)
                .limit(50)
                .forEach(i -> {
                    system.tell(PcLine.Office.INSTANCE);
                    system.tell(PcLine.Gamer.INSTANCE);
                });

        System.out.println(">>> Press ENTER to exit <<<");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            system.terminate();
        }
    }
}
