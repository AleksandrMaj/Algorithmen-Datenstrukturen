import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTest {
    @Test
    public void testJUnit() {
        BinTreeImpl tree =
                new BinTreeImpl(
                        new BinTreeImpl(
                                new BinTreeImpl(
                                        new BinTreeImpl(3),
                                        "+",
                                        new BinTreeImpl(4)),
                                "*",
                                new BinTreeImpl("5")),
                        "+",
                        new BinTreeImpl(
                                new BinTreeImpl("2"),
                                "*",
                                new BinTreeImpl("3"))
                );

        assertEquals(41,BinTreeEvaluate.evaluate(tree));
    }
}