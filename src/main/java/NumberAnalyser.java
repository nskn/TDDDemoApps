public class NumberAnalyser {

    public String fizzBuzz(int input) {
        if (input % 3 == 0 && input % 5 == 0) {
            return "FizzBizz";
        }
        if (input % 3 == 0) {
            return "Fizz";
        }
        if (input % 5 == 0) {
            return "Bizz";
        }
        return String.valueOf(input);
    }

    public void printVal(int inputVal){
        System.out.print(fizzBuzz(inputVal));
    }
}
