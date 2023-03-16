package Day_13;

public class RefactorGenricClass<T extends Comparable<T>> {
    public Integer getMaximumAmongInteger(Integer first, Integer second, Integer third) {
        Integer max = first;
        if (second.compareTo(max) > 0) {
            max = second;
        }
        if (third.compareTo(max) > 0) {
            max = third;
        }
        return max;
    }

    public static String getMaximumAmongString(String a, String b, String c) {
        String max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static Float getMaximumAmongFloat(Float f1, Float f2, Float f3) {
        Float max = f1;
        if (f2.compareTo(max) > 0) {
            max = f2;
        }
        if (f3.compareTo(max) > 0) {
            max = f3;
        }
        return max;
    }

    public static void main(String[] args) {
        RefactorGenricClass<Integer> refactorGenericClass = new RefactorGenricClass();
        RefactorGenricClass<Float> refactorGenericClass1 = new RefactorGenricClass();
        RefactorGenricClass<String> refactorGenericClass2 = new RefactorGenricClass();

        Integer firstInteger = 10, secondInteger = 20, thirdInteger = 30;
        System.out.println(refactorGenericClass.getMaximumAmongInteger(firstInteger, secondInteger, thirdInteger));
        Float firstFloat = 3.45f, secondFloat = 7.79f, thirdFloat = 9.85f;
        System.out.println(refactorGenericClass.getMaximumAmongFloat(firstFloat, secondFloat, thirdFloat));
        String firstString = "Ram", secondString = "Shyam", thirdString = "Ghanshyam";
        System.out.println(refactorGenericClass.getMaximumAmongString(firstString, secondString, thirdString));
    }
}

