package java.quizsystem;// QuizNotifierTest.java
import org.junit.jupiter.api.Test;
import quizsystem.observer.QuizNotifier;
import quizsystem.observer.Observer;

import static org.junit.jupiter.api.Assertions.*;

class QuizNotifierTest {

    @Test
    void testNotifyObservers() {
        QuizNotifier notifier = new QuizNotifier();
        TestObserver observer = new TestObserver();
        notifier.registerObserver(observer);
        notifier.setMessage("Hello Observers!");
        assertEquals("Hello Observers!", observer.getLastMessage());
    }

    private static class TestObserver implements Observer {
        private String lastMessage;

        @Override
        public void update(String message) {
            this.lastMessage = message;
        }

        public String getLastMessage() {
            return lastMessage;
        }
    }
}