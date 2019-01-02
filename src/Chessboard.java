public class Chessboard {
    public static void main(String[] args) {
        String[][] chess = new String[4][4];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                if (i % 2 != 0) {
                    String first = "WW|BB|";
                    System.out.print(first);


                } else {
                    String first = "BB|WW|";
                    System.out.print(first);
                }


            }
            System.out.println();
        }
    }
}

