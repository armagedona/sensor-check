/**
 * A Sample class that contains samples of locations and their temperatures.
 * 
 * @author Nikola Hristov 
 * @version 24.11.2010
 */
public class Sample
{
    // The location where the sample is taken
    public final String location;
    // The value of the sample
    public final int value;

    /**
     * Constructor for objects of class Slample.
     */
    public Sample(String setLocation, int setValue)
    {
        // Set the location of the sample.
        location = setLocation;
        //Set the temperature of the Sample in Kelvin.
        value = setValue;
    }
}
