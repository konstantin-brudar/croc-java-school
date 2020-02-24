/**
 * Task #1*
 *
 * This class has a method that formats the specified size in bytes in human readable form.
 *
 * @author Konstantin Brudar
 * @version 1.0
 */
public class Task_1_star {
    public static void main(String[] args) {
        long[] v = new long[]{0,23,1024,53692044905543L,9_223_372_036_854_775_807L};

        for (long sizeInBytes : v) {
            System.out.println(sizeInBytes + " B -> " + formatBytes(sizeInBytes));
        }
    }

    /**
     * Format given size in suitable units.
     *
     * @param   sizeInBytes    size in bytes (>= 0 and <= 9_223_372_036_854_775_807).
     * @return  formatted string with size in suitable units (KB, MB, GB etc) accurate to one decimal place.
     */
    public static String formatBytes(long sizeInBytes) {
        String[] units = new String[] {"B","KB","MB","GB","TB","PB","EB"};
        int unitNumber = 0;
        float sizeInUnits = sizeInBytes;
        while (sizeInUnits >= 1024) {
            sizeInUnits /= 1024;
            unitNumber++;
        }
        return String.format("%.1f",sizeInUnits) + " " + units[unitNumber];
    }
}
