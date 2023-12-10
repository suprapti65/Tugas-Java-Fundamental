public class TugasJavaFundamental {

        public static void main(String[] args) {
            printPatterns(10);
        }
        private static void printPatterns(int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                    if (i == j || (i + j) == (n - 1)) {
                        break;
                    }
                }
                System.out.println();
            }
        }
    }


