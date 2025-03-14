package components;

import components.standard.Standard;

//Kernal Interface (minimum functionality to track water consumption)
public interface WaterTrackerKernal extends Standard<WaterTracker> {
    /*
     * Logs water consumption from inputed source
     *
     * @param source {@code String} name of the water source
     *
     * @ensures totalWaterConsumed = #totalWaterConsumed + waterSources[source]
     */
    void drank(String source);

    /*
     * Gets the total amount of water consumed
     *
     * @return the total water consumed in ounces
     */
    double getWater();
}
