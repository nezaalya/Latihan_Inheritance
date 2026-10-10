public class BangunDatar {
    // Atribut (Kotak penyimpanan data)
    private double side;
    private double length;
    private double width;

    // 1. Default constructor (Tanpa parameter / kosong)
    public BangunDatar() {
        this.side = 0;
        this.length = 0;
        this.width = 0;
    }

    // 2. Constructor dengan parameter sisi (Untuk Persegi / Square)
    public BangunDatar(double side) {
        this.side = side;
    }

    // 3. Constructor dengan parameter panjang & lebar (Untuk Persegi Panjang / Rectangle)
    public BangunDatar(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Accessor (Getter) untuk mengambil nilai
    public double getSide() { return side; }
    public double getLength() { return length; }
    public double getWidth() { return width; }

    // Mutator (Setter) untuk mengubah nilai
    public void setSide(double side) { this.side = side; }
    public void setLength(double length) { this.length = length; }
    public void setWidth(double width) { this.width = width; }

    // Methods untuk perhitungan luas dan keliling
    public double calculateSquareArea() {
        return side * side;
    }

    public double calculateSquarePerimeter() {
        return 4 * side;
    }

    public double calculateRectangleArea() {
        return length * width;
    }

    public double calculateRectanglePerimeter() {
        return 2 * (length + width);
    }
}