public class BangunDatarDemo {
    public static void main(String[] args) {
        
        // 1. Membuat objek 'square' menggunakan constructor dengan parameter sisi (sisi = 7)
        BangunDatar square = new BangunDatar(7);
        System.out.println("Area of square with side " + (int)square.getSide() + " = " + (int)square.calculateSquareArea());
        System.out.println("Perimeter of square with side " + (int)square.getSide() + " = " + (int)square.calculateSquarePerimeter());
        
        System.out.println(); // Spasi baris biar rapi

        // 2. Membuat objek 'rectangle1' menggunakan default constructor, lalu diisi pakai Setter
        BangunDatar rectangle1 = new BangunDatar();
        rectangle1.setLength(10);
        rectangle1.setWidth(5);
        System.out.println("Area of rectangle with length " + (int)rectangle1.getLength() + " and width " + (int)rectangle1.getWidth() + " = " + (int)rectangle1.calculateRectangleArea());
        System.out.println("Perimeter of rectangle with length " + (int)rectangle1.getLength() + " and width " + (int)rectangle1.getWidth() + " = " + (int)rectangle1.calculateRectanglePerimeter());

        System.out.println(); // Spasi baris biar rapi

        // 3. Membuat objek 'rectangle2' menggunakan constructor panjang & lebar langsung (panjang 10, lebar 5 atau sesuai soal)
        BangunDatar rectangle2 = new BangunDatar(12, 6);
        System.out.println("Area of rectangle with length " + (int)rectangle2.getLength() + " and width " + (int)rectangle2.getWidth() + " = " + (int)rectangle2.calculateRectangleArea());
        System.out.println("Perimeter of rectangle with length " + (int)rectangle2.getLength() + " and width " + (int)rectangle2.getWidth() + " = " + (int)rectangle2.calculateRectanglePerimeter());
    }
}