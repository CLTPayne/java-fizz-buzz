public class FizzBuzz {
    public String fb (int a){
        String answer ="";
        if ( a % 3 == 0 && a % 5 == 0) {
            answer = "FIZZBUZZ";
        } else if (a % 5 == 0) {
            answer = "BUZZ";
        } else if (a %3 ==0) {
            answer = "FIZZ";
        } else {
            answer = Integer.toString(a);
        }
        return answer;
    }

}



// your main class is always void as it only runs the code base.
// functions should have a return value type which you label in place of void
// public means that anyone can access it
// static means that you can run this method without creating an instance of Main
// the args inside the the method are the args we'll get when running the programme with parameters - here it's an array of strings
// System is a predefined Java class
// out is a static variable which represents the output of the program - stdout
// println is a method to print a line