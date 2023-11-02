# TUGS
<Nama:Reffki Andrea Pratama>
<NPM:G1A023039>
<kelas: A Informatika>

TASK 1 
program Java sederhana yang mencetak nama dan NPM ke layar, serta kemudian mencetak nama Anda 100 kali jika nilai `i` lebih besar atau sama dengan 10, atau mencetak nilai `i` jika `i` kurang dari 10.
penjelasan fungsi kode: 
1. `public class inpt`:adalah deklarasi kelas Java dengan nama `inpt`. Nama kelas harus cocok dengan nama file yang berisi kode tersebut. Kode Java harus selalu berada dalam kelas yang sesuai dengan nama file.
2. `public static void main(String[] args)`:adalah metode utama dalam kelas yang dijalankan saat program dimulai. Metode `main` adalah titik awal eksekusi untuk program Java.
3. `String name = "Reffki Andrea Pratama";`:mendeklarasikan variabel `name` dengan tipe data `String` dan menginisialisasinya dengan string "Reffki Andrea Pratama".
4. `String NPM = "G1A023039";`:mendeklarasikan variabel `NPM` dengan tipe data `String` dan menginisialisasinya dengan string "G1A023039".
5. `System.out.println("nama : " + name);`:mencetak teks "nama :" diikuti oleh nilai variabel `name` ke konsol.
6. `System.out.println("NPM : " + NPM);`:mencetak teks "NPM :" diikuti oleh nilai variabel `NPM` ke konsol.
7. `System.out.println("============");`:mencetak garis putus-putus (sebaris tanda sama dengan) ke konsol.
8. `for (int i = 0; i <= 100; i++) {`:adalah loop `for` yang akan menjalankan blok kode yang ada di dalamnya dari `i` mulai dari 0 hingga 100.
9. `if (i >= 10) {`:adalah pernyataan kondisional yang memeriksa apakah nilai `i` lebih besar atau sama dengan 10.
10. `System.out.println(name);`: Jika `i` lebih besar atau sama dengan 10, maka nama (variabel `name`) akan dicetak ke konsol.
11. `} else {`: Jika `i` kurang dari 10, maka blok kode dalam `else` ini akan dieksekusi.
12. `System.out.println(i);`: Dalam blok `else`, nilai `i` akan dicetak ke konsol.

TASK 2
 program Java yang menggunakan `while` loop dan kondisional `if` untuk meminta pengguna memasukkan angka-angka hingga pengguna memasukkan angka -1 untuk berhenti.
 penjelasan code:
 1. `import java.util.Scanner;`:adalah pernyataan impor yang mengimpor kelas `Scanner` dari pustaka Java `java.util`. Ini diperlukan untuk membaca masukan dari pengguna.
2. `public class whileif {`:adalah deklarasi kelas Java dengan nama `whileif`. Nama kelas harus cocok dengan nama file yang berisi kode tersebut.
3. `public static void main(String[] args) {`:adalah metode utama dalam kelas yang dijalankan saat program dimulai.
4. `Scanner scanner = new Scanner(System.in);`:mendeklarasikan objek `Scanner` dengan nama `scanner` yang akan digunakan untuk membaca masukan dari pengguna. `System.in` mengacu pada aliran masukan standar (biasanya dari keyboard).
5. `int angka = 0;`:mendeklarasikan variabel `angka` dan menginisialisasinya dengan 0. Variabel ini akan digunakan untuk menyimpan angka yang dimasukkan oleh pengguna.
6. `int count = 0;`:mendeklarasikan variabel `count` dan menginisialisasinya dengan 0. Variabel ini akan digunakan untuk menghitung berapa banyak angka yang dimasukkan pengguna.
7. `while (angka != -1) {`:adalah loop `while` yang akan berlanjut selama `angka` tidak sama dengan -1.
8. `System.out.println("Masukkan angka (-1 untuk berhenti): ");`: Ini mencetak pesan untuk meminta pengguna memasukkan angka. Program akan terus meminta masukan hingga pengguna memasukkan -1.
9. `angka = scanner.nextInt();`:menggunakan objek `scanner` untuk membaca angka yang dimasukkan oleh pengguna dan menyimpannya dalam variabel `angka`.
10. `if (angka != -1) {`:adalah pernyataan kondisional yang memeriksa apakah `angka` tidak sama dengan -1. Jika iya, maka blok kode di dalamnya akan dieksekusi.
11. `count++;`:meningkatkan nilai variabel `count` setiap kali pengguna memasukkan angka yang bukan -1, sehingga menghitung berapa banyak angka yang dimasukkan pengguna.
12. `if (angka % 2 == 0) {`:memeriksa apakah `angka` adalah genap dengan memeriksa apakah sisa bagi dari `angka` dengan 2 adalah 0.
13. `System.out.println(angka + " adalah genap.");`: Jika angka adalah genap, maka program akan mencetak bahwa angka tersebut adalah genap.
14. `else {`: Jika angka bukan genap, maka blok kode dalam `else` ini akan dieksekusi.
15. `System.out.println(angka + " adalah ganjil.");`: Jika angka adalah ganjil, maka program akan mencetak bahwa angka tersebut adalah ganjil.
16. `System.out.println("Total angka yang diinputkan: " + count);`: Setelah pengguna memasukkan -1 untuk berhenti, program akan mencetak total berapa banyak angka yang dimasukkan pengguna sepanjang eksekusi.
Dengan demikian, program ini akan terus meminta pengguna memasukkan angka hingga pengguna memasukkan -1, dan selama itu, program akan menghitung berapa banyak angka yang dimasukkan dan menentukan apakah angka tersebut genap atau ganjil.

TASK 3
 program Java yang meminta pengguna untuk memasukkan tanggal lahir mereka dalam format "dd/mm/yyyy", kemudian menghitung dan menentukan zodiak berdasarkan tanggal lahir yang dimasukkan. 
 penjelasan kode:
 1. `import java.util.Scanner;`:adalah pernyataan impor yang mengimpor kelas `Scanner` dari pustaka Java `java.util`. Ini diperlukan untuk membaca masukan dari pengguna.
2. `public class zodiak {`:adalah deklarasi kelas Java dengan nama `zodiak`. Nama kelas harus cocok dengan nama file yang berisi kode tersebut.
3. `public static void main(String[] args) {`:adalah metode utama dalam kelas yang dijalankan saat program dimulai.
4. `Scanner scanner = new Scanner(System.in);`:mendeklarasikan objek `Scanner` dengan nama `scanner` yang akan digunakan untuk membaca masukan dari pengguna. `System.in` mengacu pada aliran masukan standar (biasanya dari keyboard).
5. `System.out.println("Masukkan tanggal lahir : ");`:mencetak pesan untuk meminta pengguna memasukkan tanggal lahir dalam format "dd/mm/yyyy".
6. `String[] dateParts = scanner.nextLine().split("/");`: Program membaca baris masukan pengguna dan kemudian memecahnya menjadi array `dateParts` dengan pemisah "/", yang berarti tanggal, bulan, dan tahun akan disimpan sebagai elemen-elemen dalam array ini.
7. `int day = Integer.parseInt(dateParts[0]);`: Program mengambil elemen pertama dari array `dateParts`, yaitu tanggal, dan mengonversinya menjadi bilangan bulat (integer) untuk disimpan dalam variabel `day`.
8. `int month = Integer.parseInt(dateParts[1]);`: Program mengambil elemen kedua dari array `dateParts`, yaitu bulan, dan mengonversinya menjadi bilangan bulat (integer) untuk disimpan dalam variabel `month`.
9. `int year = Integer.parseInt(dateParts[2]);`: Program mengambil elemen ketiga dari array `dateParts`, yaitu tahun, dan mengonversinya menjadi bilangan bulat (integer) untuk disimpan dalam variabel `year`.
10. `String zodiacSign = "";`: Ini mendeklarasikan variabel `zodiacSign` yang akan digunakan untuk menyimpan nama zodiak yang akan ditentukan.
11. Kemudian terdapat serangkaian pernyataan `if` dan `else if` yang memeriksa bulan dan tanggal lahir yang dimasukkan pengguna untuk menentukan zodiak yang sesuai. Setiap blok `if` atau `else if` memeriksa apakah bulan dan tanggal lahir cocok dengan kriteria untuk satu zodiak tertentu. Jika cocok, maka nama zodiak tersebut akan disimpan dalam variabel `zodiacSign`.
12. `System.out.println("Zodiak Anda adalah: " + zodiacSign);`: Akhirnya, program mencetak nama zodiak yang sesuai dengan tanggal lahir yang dimasukkan oleh pengguna.
Dengan demikian, program ini meminta pengguna memasukkan tanggal lahir, memproses tanggal lahir tersebut, dan kemudian menampilkan nama zodiak yang sesuai dengan tanggal lahir yang dimasukkan.

TASK 4
program Java yang menggunakan array untuk menyimpan sejumlah bilangan bulat dan kemudian menggunakan perulangan `for-each` (atau juga dikenal sebagai perulangan for-each) untuk menampilkan nilai-nilai dalam array.
penjelasan kode:
1. `public class array {`:adalah deklarasi kelas Java dengan nama `array`. Nama kelas harus cocok dengan nama file yang berisi kode tersebut.
2. `public static void main(String[] args) {`:adalah metode utama dalam kelas yang dijalankan saat program dimulai.
3. `int[] numbers = {1, 2, 3, 4, 5};`:mendeklarasikan variabel `numbers` dengan tipe data array `int`. Variabel ini berisi sebuah array yang diinisialisasi dengan bilangan bulat 1, 2, 3, 4, dan 5.
4. `for (int number : numbers) {`:adalah perulangan for-each. Dalam perulangan for-each, variabel `number` secara otomatis mengambil setiap elemen dalam array `numbers` satu per satu, mulai dari elemen pertama hingga elemen terakhir.
5. `System.out.println(number);`: Dalam setiap iterasi perulangan, nilai dari `number` akan dicetak ke layar menggunakan `System.out.println()`.akan mencetak setiap elemen array satu per satu.
6. `}`: Penutupan perulangan for-each.
Dengan demikian, program ini akan mencetak semua nilai dalam array `numbers` ke layar, yaitu 1, 2, 3, 4, dan 5, masing-masing dalam baris terpisah. Perulangan for-each memudahkan pengaksesan dan pemrosesan elemen dalam array tanpa perlu menghitung indeks secara eksplisit.

<baiklah itu saja yang dapat saya sajikan 
terimakasih>