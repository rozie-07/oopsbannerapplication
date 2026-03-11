public class BannerApp {

    public static void main(String[] args) {

        String[] line1 = {" ***** ", " ***** ", " ***** ", " ***** "};
        String[] line2 = {"*     *", "*     *", "*     *", "*     *"};
        String[] line3 = {"*     *", "*     *", "*     *", "*     *"};
        String[] line4 = {"*     *", "*     *", "*     *", "*     *"};
        String[] line5 = {"*     *", "*     *", "*     *", "*     *"};
        String[] line6 = {"*     *", "*     *", "*     *", "*     *"};
        String[] line7 = {" ***** ", " ***** ", " ***** ", " ***** "};

        String[][] banner = {line1, line2, line3, line4, line5, line6, line7};

        for (int i = 0; i < banner.length; i++) {

            for (int j = 0; j < banner[i].length; j++) {
                System.out.print(banner[i][j] + " ");
            }

            System.out.println();
        }
    }
}