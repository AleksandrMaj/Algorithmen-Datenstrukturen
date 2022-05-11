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

        switch(bt.getValue().toString())
        {
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            default:
                return left / right;
        }
    }
}
