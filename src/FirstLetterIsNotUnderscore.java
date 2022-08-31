public class FirstLetterIsNotUnderscore implements Expression {
    final private FirstLetterIsLowerCase firstLetterIsLowerCase = new FirstLetterIsLowerCase();

    @Override
    public String interpreter(String context) {
        if (context.startsWith("_"))
            context = context.substring(1);
        return firstLetterIsLowerCase.interpreter(context);
    }
}
