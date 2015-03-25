import java.util.ArrayList;

/**
 * This Analyser class can populate, and create a new sample of a collection of  the class Sample.
 * Then the analyser can print out all the samples in the collection, print the out and find the max temperatur 
 * that is not a fauty sensor, and can identify the fauthy ones.
 * It can also find buildings that are overheated, without them having a fauty sensor.
 * Parts from the methods have been looked at in the "Objects First with JAVA" textbook.
 * 
 * @author Nikola Hristov
 * @version 1.8.2
 */

public class Analyser
{
    //The list of Samples in this analyser.
    private ArrayList<Sample> sample;
    // Storage for an arbitrary number of Fauty Sensors.
    private ArrayList<String> fautySensors;

    public Analyser()
    {
        sample = new ArrayList<Sample>();
        fautySensors = new ArrayList();
        populate();
        populateFautySensors();
    }

    /**
     * Add a new Sample with the Location and the value to the list.
     * The Value is in Kelvin and has to be greater than 0.
     * @param sample A smaple to be stored.
     */
    public void addSample(String location, int value)
    {
        if(value >=0) {           
            Sample sample = new Sample(location, value);
            this.sample.add(sample);

        }
    }

    /**
     * A method that populates the colection.
     */
    public void populate()
    {
        Sample sample = new Sample("Frazer Noble", 288);
        Sample sample1 = new Sample("Meston", 290);
        Sample sample3 = new Sample("MacRobert", 295);
        Sample sample4 = new Sample("Frazer Noble", 287);
        Sample sample5 = new Sample("Meston", 200);
        Sample sample6 = new Sample("MacRobert", 328);
        Sample sample7 = new Sample("Edward Wright", 222);
        Sample sample8 = new Sample("Regent", 284);
        Sample sample9 = new Sample("QML", 242);
        Sample sample10 = new Sample("The Hub", 273);
        this.sample.add(sample);
        this.sample.add(sample1);
        this.sample.add(sample3);
        this.sample.add(sample4);
        this.sample.add(sample5);
        this.sample.add(sample6);
        this.sample.add(sample7);
        this.sample.add(sample8);
        this.sample.add(sample9);
        this.sample.add(sample10);
    }

    /**
     * This prints all the samples in the collection along with the locations.
     */
    public void printSamples()
    {
        int index = 0;
        while(index < sample.size()) {
            System.out.println("["+sample.get(index).location+"]" + " " + sample.get(index).value);
            index++;
        }
    }

    /**
     * Finding the Maximum Temperature
     */
    public void findMax()
    {
        int maxValue = sample.get(0).value;
        for(int i = 0; i < sample.size(); i++) {
            if(maxValue < sample.get(i).value) {
                maxValue = sample.get(i).value;

            }
        }
        System.out.println("Highest temperature recorded is "+maxValue+"K");

    }

    /**
     * Finding Fauty Sensors. 
     */           
    public void findFaultySensors()
    {
        for(int f = 0; f < sample.size(); f++) {
            if(sample.get(f).value > 310 || 250 > sample.get(f).value) {
                String fauty = sample.get(f).location;

                System.out.println("Faulty Sensor found at: " + fauty);
            }

        }

    }

    /**
     * Populationg a list with the Fauty Sensors.
     */   
    public void populateFautySensors()
    {
        for(int pf = 0; pf < sample.size(); pf++) {
            if(sample.get(pf).value > 310 || 250 > sample.get(pf).value) {
                String fauty = sample.get(pf).location;
                fautySensors.add(fauty);

            }
        }
    }

    /**
     * Printing the overheated locations.
     */
    public void overheat()
    {
        for(int o = 0; o < sample.size(); o++) {
            if(sample.get(o).value < 310 && 290 < sample.get(o).value) {
                String overheat = sample.get(o).location;

                System.out.println(overheat + " is overheated.");
            }

        }

    }
}