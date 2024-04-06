package Bridge.styles;

public class Barocco extends Style{


    public Barocco(String timePeriod, String characteristics) {
        super(timePeriod, characteristics);
    }
    public Barocco()
    {}
    @Override
    public String getStyle() {
        return getClass().getSimpleName();
    }
}
