public class Soal3 {
    public static void main(String[] args) {
        String [] namaHewan = {"Harimau", "Kucing", "Anjing", "Hiu"};

        for (String nama : namaHewan) {
            if (nama.length() > 4) {
                System.out.println(nama);
            }
        }
    }
}
