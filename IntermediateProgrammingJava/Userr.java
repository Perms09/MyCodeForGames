package IntermediateProgrammingJava;
public record Userr(String name, int age) {
    private static final int MAX_AGE = 150;
public String greet(){
    return "Hello " + name + " Nice to meet you, you are "+ MAX_AGE;
}
    public static Userr unknown() {
        return new Userr("Unknown", MAX_AGE);
    }
}
