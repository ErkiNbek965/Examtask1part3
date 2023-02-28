import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Wine wine =new Wine("Red","Mer","Armenia", LocalDate.of(1865,2,3));
        Wine wine1=new Wine("White","Barefoot","USA ",LocalDate.of(1879,2,3));
        Wine wine2=new Wine("pink semi-sweet","Changyu","China",LocalDate.of(1899,3,13));
        Wine wine3=new Wine("White semi-sweet","Yellow Tail","Australia", LocalDate.of(2000,7,2));
        Wine [] wines = {wine,wine1,wine2,wine3,};
        WineMaker wineMaker=new WineMaker(wines,15,"Italy");
        wines[0]=wineMaker.WineIn(wines);

        System.out.println(wineMaker.toString());
    }
}