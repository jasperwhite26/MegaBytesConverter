public class megaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKilobytes(2500);
        printMegaBytesAndKilobytes(-1024);
        printMegaBytesAndKilobytes(5000);
    }

    public static void printMegaBytesAndKilobytes(int kilobytes){
        if (kilobytes > 0) {
            int mega = kilobytes / 1024;
            int kb = kilobytes % 1024;
            System.out.println(kilobytes + " KB = " + mega + " MB and " + kb + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
