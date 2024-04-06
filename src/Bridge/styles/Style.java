package Bridge.styles;

public abstract class Style {
    String timePeriod;
    String characteristics;

    public Style(String timePeriod, String characteristics) {
        if (timePeriod != null)
        {this.timePeriod = timePeriod;}
        if (characteristics!= null)
        {this.characteristics = characteristics;}
    }

    public Style() {
    }

    public String getStyle()
    {
        return getClass().getSimpleName();
    }
}
