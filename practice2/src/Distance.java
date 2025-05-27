public class Distance {
    public double feet;
    public double inches;

    public Distance() {
        this.feet = 0;
        this.inches = 0;
    }

    public Distance(double inches) {
        this.inches = inches;
        if(inches >= 12) {
            this.feet += Math.floor(inches / 12.00);
            this.inches = inches % 12;
        }
    }

    public Distance(double feet, double inches) {
        this.feet = feet;
        this.inches = inches;
        if(inches >= 12) {
            this.feet += (inches / 12.00);
            this.inches = (inches % 12.00);
        }
    }

    public static Distance addDistance(double feet, double inches) {
        return new Distance(feet, inches);
    }

    public String toString() {
        return this.feet + " feet, " + this.inches + " inches ";
    }
}
