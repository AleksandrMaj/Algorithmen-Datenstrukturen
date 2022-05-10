public class BinTreeEvaluate
{
    public static Integer evaluate(BinTree bt)
    {
        if(bt == null) return 0;

        //Blattknoten ermitteln und Wert wiedergeben
        if (bt.getLeft() == null && bt.getRight() == null)
            return Integer.parseInt(bt.getValue().toString());

        int left = evaluate(bt.getLeft()); //Linker Operand
        int right = evaluate(bt.getRight()); //Rechter Operand

        if (bt.getValue().equals("+"))
            return left + right;

        if (bt.getValue().equals("-"))
            return left - right;

        if (bt.getValue().equals("*"))
            return left * right;

        return left / right;
    }
}
