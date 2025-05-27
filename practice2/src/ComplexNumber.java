public class ComplexNumber {
    public float real;
    public float imaginary;

    public ComplexNumber(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        num1.real += num2.real;
        num1.imaginary += num2.imaginary;
        return num1;
    }

    public static ComplexNumber add(ComplexNumber num1, float num2) {
        num1.real += num2;
        return num1;
    }

    public String toString() {
        return this.real + " + " + this.imaginary + "i";
    }
}
