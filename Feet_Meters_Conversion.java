public class Feet_Meters_Conversion {
    public static double footToMeter(double foot){
        double meterConversion;
        meterConversion = foot * 0.305;

        return meterConversion;
    }
   
    public static double meterToFoot(double meter){
        double footConversion;
        footConversion = meter * 3.279;
        return footConversion;
    }
    public static void main(String[] args){
        String headerFeet = "Feet";
        String headerMeters = "Meters";


        System.out.printf("%-10s %-10s %-10s %-10s %-5s%n", headerFeet, headerMeters,"|", headerMeters, headerFeet);
        System.out.println("-".repeat(50));
        for (int index = 1; index < 11; index++) {
            System.out.printf("%-10d %-10.3f %-10s %-10d %-10.3f%n",
                                index, footToMeter(index), "|", (index + 3) * 5, meterToFoot((index + 3) * 5));
        }

    }
}
