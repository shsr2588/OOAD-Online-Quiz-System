package java.quizsystem;// QuestionBankSingletonTest.java
import org.junit.jupiter.api.Test;
import quizsystem.singleton.QuestionBank;

import static org.junit.jupiter.api.Assertions.*;

class QuestionBankSingletonTest {

    @Test
    void testLazySingleton() {
        QuestionBank lazy1 = QuestionBank.getLazyInstance();
        QuestionBank lazy2 = QuestionBank.getLazyInstance();
        assertSame(lazy1, lazy2, "Lazy Singleton instances should be the same");
    }

    @Test
    void testEagerSingleton() {
        QuestionBank eager1 = QuestionBank.getEagerInstance();
        QuestionBank eager2 = QuestionBank.getEagerInstance();
        assertSame(eager1, eager2, "Eager Singleton instances should be the same");
    }
}