package Day_13;

public class RefactorGenricMethod {

    public static <T extends Comparable> T maximumAmongThree(T first, T second, T third) {
        if (first.compareTo(second) > 0 && first.compareTo(third) > 0) {
            return first;
        } else if (second.compareTo(first) > 0 && second.compareTo(third) > 0) {
            return second;
        } else {
            return third;
        }
    }

    public static void main(String[] args) {
        System.out.print("Maximum Among Three Integer Is:");
        Integer firstInt = 434, secondInt = 232, thirdInt = 365;
        System.out.println(maximumAmongThree(firstInt, secondInt, thirdInt));
        System.out.print("Maximum Among Three Float Is:");
        Float firstFloat = 25.26f, secondFloat = 38.54f, thirdFloat = 44.66f;
        System.out.println(maximumAmongThree(firstFloat, secondFloat, thirdFloat));
        System.out.print("Maximum Among Three String Is:");
        String firstString = "Messi", secondString = "Neymar", thirdString = "Ronaldo";
        System.out.println(maximumAmongThree(firstString, secondString, thirdString));
    }
}

