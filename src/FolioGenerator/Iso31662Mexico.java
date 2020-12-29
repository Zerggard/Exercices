package FolioGenerator;

public class Iso31662Mexico {


    public static boolean isISOValid(String iso) {
        if(iso.isEmpty()) {
            System.out.println("============================================================");
            System.out.println("The iso is empty");
            System.out.println("============================================================");
            return false;
        }
        if(iso.length() > 3) {
            System.out.println("============================================================");
            System.out.println("The iso is empty or it size is higher than 3 characters");
            System.out.println("============================================================");
            return false;
        }

        for(int index = 0; index < iso.length(); index++){
            if(Character.isDigit(iso.charAt(index))) {
                System.out.println("============================================================");
                System.out.println("The iso contains invalid characters");
                System.out.println("============================================================");
                return false;
            }
            else {
                for (String country: FolioConfiguration.COUNTRIES) {
                    if(country.equals(iso))
                        return true;
                }
            }
        }
        System.out.println("============================================================");
        System.out.println("The iso is not matched with the list of iso3166-2 verify the iso documentation");
        System.out.println("============================================================");
        return false;
    }
}
