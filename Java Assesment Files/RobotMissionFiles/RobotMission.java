/**
 * Represents a robot mission with mission information and battery-use data.
 * The class stores the mission details and can estimate the remaining
 * battery level after the mission is completed.
 */
public class RobotMission {
    // Descriptive name for the mission.
    private String missionName;

    // Starting battery percentage for the robot.
    private double batteryLevel;

    // Planned mission duration in minutes.
    private int durationMinutes;

    // Estimated battery percentage used per minute.
    private double batteryUsePerMinute;

    /**
     * Creates a RobotMission object with all mission data initialized.
     *
     * @param missionName descriptive name of the mission
     * @param batteryLevel starting battery percentage
     * @param durationMinutes planned duration in minutes
     * @param batteryUsePerMinute estimated battery percentage used per minute
     */
    public RobotMission(String missionName, double batteryLevel,
            int durationMinutes, double batteryUsePerMinute) {
        this.missionName = missionName;
        this.batteryLevel = batteryLevel;
        this.durationMinutes = durationMinutes;
        this.batteryUsePerMinute = batteryUsePerMinute;
    }

    // Returns the mission name.
    public String getMissionName() {
        return missionName;
    }

    // Updates the mission name.
    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    // Returns the starting battery level.
    public double getBatteryLevel() {
        return batteryLevel;
    }

    // Updates the starting battery level.
    public void setBatteryLevel(double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    // Returns the planned mission duration.
    public int getDurationMinutes() {
        return durationMinutes;
    }

    // Updates the planned mission duration.
    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    // Returns the estimated battery use per minute.
    public double getBatteryUsePerMinute() {
        return batteryUsePerMinute;
    }

    // Updates the estimated battery use per minute.
    public void setBatteryUsePerMinute(double batteryUsePerMinute) {
        this.batteryUsePerMinute = batteryUsePerMinute;
    }

    /**
     * Calculates the estimated battery percentage remaining after the mission.
     *
     * @return estimated remaining battery percentage
     */
    public double calculateRemainingBattery() {
        return batteryLevel - (durationMinutes * batteryUsePerMinute);
    }

    /**
     * Produces a formatted description of the RobotMission object,
     * including the calculated remaining battery percentage.
     *
     * @return formatted mission information
     */
    @Override
    public String toString() {
        return String.format(
                "Mission Name: %s%n"
                + "Starting Battery: %.2f%%%n"
                + "Duration: %d minutes%n"
                + "Battery Use Per Minute: %.2f%%%n"
                + "Estimated Remaining Battery: %.2f%%",
                missionName,
                batteryLevel,
                durationMinutes,
                batteryUsePerMinute,
                calculateRemainingBattery());
    }
}
