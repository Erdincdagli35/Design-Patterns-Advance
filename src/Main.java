public class Main {

    public static void main(String[] args) {
        System.out.println("Interpreter\n\n");

        System.out.println("Expression Example : ");
        String context = "_Int";
        FirstLetterIsNotUnderscore firstLetterIsNotUnderscore = new FirstLetterIsNotUnderscore();
        context = firstLetterIsNotUnderscore.interpreter(context);
        System.out.println("Context : " + context);
    }
}
