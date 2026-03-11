public class BannerApp {

    static void printBanner() {

        String[][] banner = {
            {" ***** ", " ***** ", " ***** ", " ***** "},
            {"*     *", "*     *", "*     *", "*     *"},
            {"*     *", "*     *", "*     *", "*     *"},
            {"*     *", "*     *", "*     *", "*     *"},
            {"*     *", "*     *", "*     *", "*     *"},
            {"*     *", "*     *", "*     *", "*     *"},
            {" ***** ", " ***** ", " ***** ", " ***** "}
        };

        for (int i = 0; i < banner.length; i++) {
            for (int j = 0; j < banner[i].length; j++) {
                System.out.print(banner[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printBanner();
    }
}