package Day_13;

public class MaximumThree {
        public static void main(String[] args) {
            System.out.println("Maximum Among Three Integer:");
            Integer n1 = 5, n2 = 25, n3 = 25;
            System.out.println(findMaxAmongThree(n1, n2, n3));
            System.out.println("Maximum Among Three Float Values:");
            Float f1 = 30f, f2 = 25f, f3 = 40f;
            System.out.println(findMaxAmongThree(n1, n2, n3));
            System.out.println("Maximum Among Three Strings:");
            String str1 = "messi", str2 = "ronaldo", str3 = "neymar";
            System.out.println(findMaxAmongThree(str1, str2, str3));
        }

        private static <T extends Comparable<T>> T findMaxAmongThree(T n1, T n2, T n3) {
            if (n1.compareTo(n2) > 0 && (n1.compareTo(n3) > 0)) {
                return n1;
            } else if (n2.compareTo(n3) > 0 && (n2.compareTo(n1) > 0)) {
                return n2;
            } else {
                return n3;
            }
        }
    }

