
import java.lang.reflect.Array;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TokoOnline {
    public static void delayed(String delay, int timing) {
        for (int i = 0; i < delay.length(); i++) {
            char s = delay.charAt(i);
            System.out.print(s);
            try {
                TimeUnit.MILLISECONDS.sleep(timing);
            } catch (Exception e) {

            }

        }
        System.out.println("");
    }

    public ArrayList Alamat = new ArrayList();
    public ArrayList Telepon = new ArrayList();
    static Scanner Scan = new Scanner(System.in);
    public ArrayList<String> nama = new ArrayList<String>();
    public static ArrayList namaBarang = new ArrayList<String>();
    public static ArrayList<String> password = new ArrayList<String>();
    static String pilihan;

}

class member extends TokoOnline {
    public ArrayList saldo = new ArrayList();

}

class karyawan extends TokoOnline {
    public ArrayList Jabatan = new ArrayList();

}

class laporan extends TokoOnline {
    public void Laporan() {
        delayed("Nama anda:" + "\nBarang anda:", 30);

    }

}

class barang extends TokoOnline {

    public void tambahBarang() {
        ArrayList stok = new ArrayList<Integer>();
        ArrayList harga = new ArrayList<Integer>();
        for (int z = 0; z < 1;) {
            int isi2, isi3;
            delayed("Barang apa yang akan ditambahkan?", 30);
            String isi = Scan.next();
            delayed("Berapa harganya?", 30);
            isi2 = Scan.nextInt();
            harga.add(isi2);
            delayed("Berapa banyak stoknya?", 30);
            isi3 = Scan.nextInt();
            stok.add(isi3);
            delayed("Ada barang lain yang ingin dimasukkan? (Y/N)", 30);
            pilihan = Scan.next();
            if (pilihan.equalsIgnoreCase("N")) {
                z = 1;
            } else {

            }
        }
    }

}

class transaksi extends TokoOnline {
    public ArrayList idMember = new ArrayList<Integer>();
    public ArrayList idBarang = new ArrayList<Integer>();

    public void transaksiJalan() {
        delayed("daftar Barang: ", 30);
        for (int i = 0; i <= (namaBarang.size() + 1); i++) {
            System.out.println(barang.namaBarang(i));
            System.out.println(barang.harga(i));
        }
    }
}

class Main extends TokoOnline {

    public static void main(String[] args) {
        karyawan karyawan = new karyawan();
        member Member = new member();
        barang barang = new barang();
        transaksi transaksi = new transaksi();
        Object statusAkhir;
        
        int x, z;
        int j = 999;
        ArrayList status = new ArrayList<String>();
        delayed("Apa yang akan anda lakukan? \n1. Register\n2. Login\n3. Exit App", 30);
        String pilihanAwal = Scan.next();
        if (pilihanAwal.equalsIgnoreCase("1")) {
            for (int i = 0; i < 1;) {
                delayed("Apakah anda Karyawan, atau member? \n1. Karyawan\n2. Member", 30);
                String addStatus = Scan.next();
                status.add(addStatus);
                i = 1;
            }

                for (z = 0; z <= j; z++) {
                    if (status.get(z) == "1") {
                        
                        delayed("Silahkan masukkan nama anda", 30);
                        String NamaIn = Scan.next();
                        delayed("Masukkan Alamat anda", 30);
                        String AlamatIn = Scan.next();
                        delayed("Masukkan nomor telepon anda", 30);
                        String telpIn = Scan.next();
                        delayed("Masukkan Password:", 30);
                        String password = Scan.next();
                        delayed("masukkan kode khusus karyawan", 30);
                        String kode = Scan.next();
                        if (kode.equalsIgnoreCase("2234")) {
                            karyawan.nama.add(NamaIn);
                            karyawan.Alamat.add(AlamatIn);
                            karyawan.Telepon.add(telpIn);
                            barang.tambahBarang();
                            if(barang.pilihan.equalsIgnoreCase("N")){
                                z=1;
                            }
                        } 
                        else {
                            delayed("Kode yang dimasukkan salah", 30);
                        }
                    

                }
                 
                    
                    else if (status.get(z) == "2") {
                        delayed("Silahkan masukkan nama anda", 30);
                        String NamaIn = Scan.next();
                        delayed("Masukkan Alamat anda", 30);
                        String AlamatIn = Scan.next();
                        delayed("Masukkan nomor telepon anda", 30);
                        String telpIn = Scan.next();
                        delayed("Masukkan Password:", 30);
                        String password = Scan.next();
                        Member.nama.add(NamaIn);
                        delayed("Masukkan saldo anda(dalam rupiah)", 30);
                        int saldo = Scan.nextInt();
                        Member.saldo.add(saldo);
                        Member.Alamat.add(AlamatIn);
                        Member.Telepon.add(telpIn);
                        transaksi.transaksiJalan();
                    }
                // if (status.get(z) == "1") {
                //     TokoOnline.nama.add(Nama);
                //     karyawan.Alamat.add(Alamat);
                //     karyawan.Telepon.add(telp);
                //     delayed("masukkan kode khusus karyawan", 30);
                //     String kode = Scan.next();
                //     if (kode.equalsIgnoreCase("2234")) {
                //         barang.tambahBarang();
                //     } else {
                //         delayed("Kode yang dimasukkan salah", 30);
                //     }

                // } else if (status.get(z) == "2") {
                //     Member.nama.add(Nama);
                //     delayed("Masukkan saldo anda(dalam rupiah)", 30);
                //     int saldo = Scan.nextInt();
                //     Member.saldo.add(saldo);
                //     Member.Alamat.add(Alamat);
                //     Member.Telepon.add(telp);
                //     transaksi.transaksiJalan();
            
                    else if (pilihanAwal.equalsIgnoreCase("2")) {
                    delayed("masukkan nama:", 30);
                    String inputNama = Scan.next();
                    delayed("Masukkan password:", 30);
                    String inputPassword = Scan.next();
                    for (x = 0; x <999; x++) {
                        if (inputNama.equals("nama.get(x)") && inputPassword.equals("password.get(x)")) {
                            statusAkhir = status.get(x);
                            // kondisiStats = "1";
                        }
                        // if (kondisiStats.equalsIgnoreCase("0")) {
                        //     delayed("Nama Tidak terdaftar!", i);
                        // }
                    }
                    
                    }
                

            
        }

    }
}}
