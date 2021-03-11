package com.root.service;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.actor.typed.javadsl.Behaviors;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

class ApplicationTest {

    public static TestKitJunitResource testKit;

    @BeforeAll
    public static void setup(){
        testKit = new TestKitJunitResource();
    }

    @Test
    void testGreeterActorSendingOfGreeting() {
//        var testProbe = testKit.createTestProbe();
//        ActorRef<PcTypeActor> underTest = testKit.testKit().spawn(Behaviors.setup(PcTypeActor::new), "greeter");
//        underTest.tell(new Greeter.Greet("Charles", testProbe.getRef()));
//        testProbe.expectMessage(new Greeter.Greeted("Charles", underTest));
    }

}
