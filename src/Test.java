public class Test
{
    public static void main(String[] args)
    {
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

        System.out.println(tree.toString() + " = " + BinTreeEvaluate.evaluate(tree));
    }
}
