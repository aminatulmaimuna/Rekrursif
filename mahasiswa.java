public class mahasiswa {
    static String[] mahasiswa = {"nana", "nini", "nono"};
    public static void main(String[] args) {
        getMahasiswa(0);
    }
    static void getMahasiswa(Integer absensi) {
        if (absensi < mahasiswa.length) {
            System.out.println("Absensi No-" + absensi + " Bernama : " + mahasiswa [absensi]);
            getMahasiswa(absensi + 1);
        } 

    }
}
