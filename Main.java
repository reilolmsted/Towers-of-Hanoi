// Reilly Olmsted
// CS& 145
// 05/23/23
// Darrell Criss
// Towers of Hanoi Recursion Program

public class Main {
    public static final String SOURCE_PEG = "Source";
    public static final String TARGET_PEG = "Target";
    public static final String SPARE_PEG = "Spare";

    public static void main(String[] args) {
        int n = 4;
        solveTowersOfHanoi(n, SOURCE_PEG, TARGET_PEG, SPARE_PEG);
    }
    private static void solveTowersOfHanoi(int n, String sourcePeg, String targetPeg, String sparePeg) {
        if (n == 1) {
            System.out.println("Disk 1 is shifted from " + sourcePeg + " to " + targetPeg);
        } else {
            solveTowersOfHanoi(n - 1, sourcePeg, sparePeg, targetPeg);
            System.out.println("Disk " +n+ " from " + sourcePeg + " to " + targetPeg);
            solveTowersOfHanoi(n - 1, sparePeg, targetPeg, sourcePeg);
        }
    }
}