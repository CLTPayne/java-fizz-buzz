public class StringFormatting {
    public static void main(String[] args)
    {
        int age = 34;
        String name = "William";

        String output = String.format("%d is %s years old.", age, name);

        System.out.println(output);
    }
}
