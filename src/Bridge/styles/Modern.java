package Bridge.styles;

public class Modern extends Style{


    public Modern(String timePeriod, String characteristics) {
        super(timePeriod, characteristics);
    }

    public Modern()
    {}

    @Override
    public String getStyle() {
        return getClass().getSimpleName();
    }
}
