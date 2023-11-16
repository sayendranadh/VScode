public class BulletTrain implements Train {
    private double distance;
    private double time;

    public BulletTrain(double distance,double time) {
        this.distance = distance;
        this.time = time;
    }
    public double getSpeed() {
        return distance/time;
    }
    
}
