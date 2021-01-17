public class MegaByteConv {
    public static void printMegaBytesAndKiloBytes( int kilobytes){
        int megabytes;
        int remainingKilobytes;
        megabytes = kilobytes / 1024;
        remainingKilobytes = kilobytes % 1024;
        if (kilobytes < 0){
            System.out.println("Invalid Value");
        }
        else {
            System.out.println(kilobytes+" KB = "+megabytes+" MB and "+remainingKilobytes+" KB");
        }
    }
}
//Victor.Aremu