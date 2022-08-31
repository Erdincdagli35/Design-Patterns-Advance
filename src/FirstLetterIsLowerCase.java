public class FirstLetterIsLowerCase implements Expression {

    final private  NameNotPrimitiveType nameNotPrimitiveType = new NameNotPrimitiveType();

    @Override
    public String interpreter(String context) {
        context = context.substring(0,1).toLowerCase() + context.substring(1);
        return nameNotPrimitiveType.interpreter(context);
    }
}
