package Bridge.styles;

public class Eclectic extends Style{

    public Eclectic(String timePeriod, String characteristics) {
        super(timePeriod, characteristics);
    }
    public Eclectic()
    {}

    @Override
    public String getStyle() {
        return getClass().getSimpleName();
    }
}
