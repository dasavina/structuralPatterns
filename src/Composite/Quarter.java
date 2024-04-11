package Composite;

import java.util.ArrayList;

public class Quarter implements LivingQuarters{
    ArrayList<LivingQuarters> quarters = new ArrayList<>();
    @Override
    public int count() {
        int numberOfPeople=0;
        for (LivingQuarters quarter: quarters)
        {
            numberOfPeople+= quarter.count();
        }
        return numberOfPeople;
    }

    public  void Add(LivingQuarters contents)
    {
        if (contents != null)
        {quarters.add(contents);}
    }
}
