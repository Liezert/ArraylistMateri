public class AreiList {
    public static void main(String[] args) {
        String[] Teman = { "Sakti", "Atha", "Fatih", "Rafi", "Azzam" };
        String[] Ekskul = { "Badminton", "Futsal", "Basket" };
        String[] Alamat = { "Malang", "Surabaya", "Jember", "Tuban" };
        char jenisKelamin[] = new char[2];
        jenisKelamin[0] = 'P';
        jenisKelamin[1] = 'L';


        for (int i = 0; i <= Teman.length; i++) {
            System.out.println();
            System.out.println("Nama: " +Teman[i]);
            System.out.println("Ekskul: " + Ekskul[i]);
            System.out.println("Alamat: " + Alamat[i]);
            System.out.println("JenisKelamin: "+ jenisKelamin[i]);
        }
    }
}
 