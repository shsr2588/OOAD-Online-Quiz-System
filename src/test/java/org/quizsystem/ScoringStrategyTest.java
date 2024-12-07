package java.quizsystem;// ScoringStrategyTest.java
import org.junit.jupiter.api.Test;
import quizsystem.strategy.EasyScoringStrategy;
import quizsystem.strategy.MediumScoringStrategy;
import quizsystem.strategy.HardScoringStrategy;

import static org.junit.jupiter.api.Assertions.*;


class ScoringStrategyTest {

    @Test
    void testEasyScoring() {
        EasyScoringStrategy strategy = new EasyScoringStrategy();
        assertEquals(5, strategy.calculateScore(5, 10));
    }

    @Test
    void testMediumScoring() {
        MediumScoringStrategy strategy = new MediumScoringStrategy();
        assertEquals(5, strategy.calculateScore(5, 10));
    }

    @Test
    void testHardScoring() {
        HardScoringStrategy strategy = new HardScoringStrategy();
        assertTrue(strategy.calculateScore(2, 3) > 0);
    }
}