import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class WineMaker implements WineIn {
    private Wine [] typeWine;
    private int workExperience;
    private String address;


    public WineMaker(Wine[] typeWine, int workExperience, String address) {
        this.typeWine = typeWine;
        this.workExperience = workExperience;
        this.address = address;
    }



    @Override
    public Wine WineIn(Wine[] wines) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Types of wine ?");
        String name=scanner.nextLine();
        System.out.println("brand?");
        String brand=scanner.nextLine();
        System.out.println("Made in ?");
        String country=scanner.nextLine();
        System.out.println("date?");
        LocalDate date=LocalDate.of(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt());
        Wine wine =new Wine(name,brand,country,date);
        return wine;
    }

    @Override
    public String toString() {
        return "WineMaker: " +
                " typeWine -> " + Arrays.toString(typeWine) +'\n'+
                " workExperience -> " + workExperience + '\n' +
                " address -> " + address ;
    }
}
