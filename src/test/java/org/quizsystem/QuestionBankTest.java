package java.quizsystem;// QuestionBankTest.java
import org.junit.jupiter.api.Test;
import quizsystem.singleton.QuestionBank;

import static org.junit.jupiter.api.Assertions.*;

class QuestionBankTest {

    @Test
    void testLazySingleton() {
        QuestionBank instance1 = QuestionBank.getLazyInstance();
        QuestionBank instance2 = QuestionBank.getLazyInstance();
        assertSame(instance1, instance2);
    }

    @Test
    void testEagerSingleton() {
        QuestionBank instance1 = QuestionBank.getEagerInstance();
        QuestionBank instance2 = QuestionBank.getEagerInstance();
        assertSame(instance1, instance2);
    }
}