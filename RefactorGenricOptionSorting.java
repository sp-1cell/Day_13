package Day_13;

public class RefactorGenricOptionSorting {
    public static <T extends Comparable<T>> T max(T... numOfElements) {
            T max = numOfElements[0];
            for (T element : numOfElements) {
                if (element.compareTo(max) > 0) {
                    max = element;
                }
            }
            return max;
        }

        public static void main(String[] args) {
            System.out.println("Integer Max: " + max(Integer.valueOf(32),  Integer.valueOf(898), Integer.valueOf(343), Integer.valueOf(453)));
            System.out.println("Double Max: " + max(Double.valueOf(225.67), Double.valueOf(467.86), Double.valueOf(263.96), Double.valueOf(138.65)));
            System.out.println("String Max: " + max("Neymar", "Ronaldo", "Messi", "Kaka"));
            System.out.println("Boolean Max: " + max(Boolean.TRUE, Boolean.FALSE));
            System.out.println("Byte Max: " + max(Byte.MIN_VALUE, Byte.MAX_VALUE));
        }
    }


