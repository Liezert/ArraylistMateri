public class Soal2 {
    public static void main(String[] args) {
        String [] namaPelajaran = {"Matematika", "Bahasa Indonesia", "Seni Budaya", "Bahasa Jawa", "Bahasa Inggris", "Sejarah"};

        for (int i = 0; i < namaPelajaran.length; i++) {
            System.out.println((i + 1) + ". "+namaPelajaran[i]);
        }
    }
}
