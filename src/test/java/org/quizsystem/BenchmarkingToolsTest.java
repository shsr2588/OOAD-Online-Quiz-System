package java.quizsystem;// BenchmarkingToolsTest.java
import org.junit.jupiter.api.Test;
import quizsystem.core.BenchmarkingTools;

class BenchmarkingToolsTest {

    @Test
    void testMeasureExecutionTime() {
        BenchmarkingTools.measureExecutionTime(() -> {
            int sum = 0;
            for (int i = 0; i < 1000; i++) {
                sum += i;
            }
        }, "TestTask");
    }

    @Test
    void testMeasureMemoryUsage() {
        BenchmarkingTools.measureMemoryUsage(() -> {
            int[] array = new int[1000];
            for (int i = 0; i < array.length; i++) {
                array[i] = i;
            }
        }, "TestMemoryTask");
    }
}