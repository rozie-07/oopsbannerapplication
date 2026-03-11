public class BannerApp {

    public static void main(String[] args) {

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
}