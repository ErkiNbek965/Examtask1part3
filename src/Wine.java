import java.time.LocalDate;

public class Wine {
    private String name;
    private String brand;
    private String madeIn;
   private LocalDate date;

    public Wine(String name, String brand, String madeIn, LocalDate date) {
        this.name = name;
        this.brand = brand;
        this.madeIn = madeIn;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "\n\nWine: " +
                " name -> " + name + '\n' +
                " brand -> " + brand + '\n' +
                " madeIn -> " + madeIn + '\n' +
                " date -> " + date ;
    }
}
