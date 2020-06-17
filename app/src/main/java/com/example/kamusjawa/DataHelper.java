package com.example.kamusjawa;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "kamus.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String sql = "create table datakamus(id integer PRIMARY KEY AUTOINCREMENT, indonesia text, jawa text);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO datakamus (indonesia, jawa) VALUES ('alis', 'alis'),"+
                "('aku','aku'),"+
                "('anak','anak'),"+
                "('anjing','asu'),"+
                "('ayo','ayo'),"+
                "('air','banyu'),"+
                "('api','geni'),"+
                "('antara','antara'),"+
                "('ahli','jago'),"+
                "('ayam','pitik'),"+
                "('ada','ana'),"+
                "('apa','apa'),"+
                "('aturan','caturan'),"+
                "('badan','awak'),"+
                "('berdiri','adeg'),"+
                "('beri','menehi'),"+
                "('bantal','bantal'),"+
                "('bapak','bapak'),"+
                "('benar','bener'),"+
                "('beras','beras'),"+
                "('bubar','buyar'),"+
                "('bukan','dudu'),"+
                "('belum','durung'),"+
                "('bawa','gawa'),"+
                "('barang bawaan','gawan'),"+
                "('besar','gedhe'),"+
                "('bulu mata','idep'),"+
                "('bisa','isa'),"+
                "('buat','kanggo'),"+
                "('baju','klambi'),"+
                "('bunga','kembang'),"+
                "('betah','krasan'),"+
                "('bibir','lambe'),"+
                "('basi','mambu'),"+
                "('berangkat','mangkat'),"+
                "('bunyi','muni'),"+
                "('berak','ngising'),"+
                "('boleh','oleh'),"+
                "('bangun','tangi'),"+
                "('beli','tuku'),"+
                "('berani','wani'),"+
                "('batu','watu'),"+
                "('bersin','wahing'),"+
                "('batuk','watuk'),"+
                "('berat','abot'),"+
                "('buruk','ala'),"+
                "('basuh','wisuh'),"+
                "('cerita','cerita'),"+
                "('cebok','cewok'),"+
                "('cepat','gelis'),"+
                "('cari','golek'),"+
                "('cuci','sapih'),"+
                "('cium','ambung'),"+
                "('dulu','biyen'),"+
                "('dandan','dandan'),"+
                "('darah','getih'),"+
                "('dagu','janggut'),"+
                "('dengar','krungu'),"+
                "('dari','marang'),"+
                "('depan','ngarep'),"+
                "('datang','teka'),"+
                "('dingin','adhem'),"+
                "('fikiran','pikiran'),"+
                "('gula','gula'),"+
                "('gendut','lemu'),"+
                "('ganti','salin'),"+
                "('garam','uyah'),"+
                "('gigi','untu'),"+
                "('hidung','irung'),"+
                "('hilang','hang'),"+
                "('harimau','macan'),"+
                "('hujan','udan'),"+
                "('hutang','utang'),"+
                "('hidup','urip'),"+
                "('hutan','alas'),"+
                "('hati','ati'),"+
                "('ingat','eling'),"+
                "('ini','iki'),"+
                "('ikat','iket'),"+
                "('iya','iya'),"+
                "('itu','kuwi'),"+
                "('ikut','melu'),"+
                "('jauh','adoh'),"+
                "('jidat','bathuk'),"+
                "('jalan','dalan'),"+
                "('jadi','dadi'),"+
                "('jari','driji'),"+
                "('jalan-jalan','dolan'),"+
                "('jamu','jamu'),"+
                "('jenggot','jenggot'),"+
                "('jerul','jeruk'),"+
                "('jalan kaki','laku'),"+
                "('jual','adol'),"+
                "('jangan','aja'),"+
                "('jarang','arang'),"+
                "('kembali','bali'),"+
                "('kumis','brengos'),"+
                "('kakek','mbah'),"+
                "('kepala','endhas'),"+
                "('kentut','entut'),"+
                "('kuda','jaran'),"+
                "('kacamata','kacamata'),"+
                "('kalung','kalung'),"+
                "('kayu','kayu'),"+
                "('kerbau','kebo'),"+
                "('keris','keris'),"+
                "('kamu','kowe'),"+
                "('keringat','kringet'),"+
                "('kubur','kubur'),"+
                "('kurang','kurang'),"+
                "('kuat','kuat'),"+
                "('kuku','kuku'),"+
                "('keluar','metu'),"+
                "('kabur','minggat'),"+
                "('kerja','nyambut gawe'),"+
                "('kata','pakon'),"+
                "('lihat','deleng'),"+
                "('lutut','dhengkul'),"+
                "('leher','gulu'),"+
                "('lidah','ilat'),"+
                "('lauk','iwak'),"+
                "('lagi','lagi'),"+
                "('lahir','lair'),"+
                "('lewat','liwat'),"+
                "('luas','ombo'),"+
                "('lama','suwe'),"+
                "('lekas','age-age'),"+
                "('mandi','adus'),"+
                "('merah','abang'),"+
                "('mau','arep'),"+
                "('mulut','cangkem'),"+
                "('mana','endi'),"+
                "('malu','isin'),"+
                "('minta','jaluk'),"+
                "('makam','kuburan'),"+
                "('mahal','larang'),"+
                "('mata','mata'),"+
                "('mayat','mayit'),"+
                "('makan','mangan'),"+
                "('meninggal','mati'),"+
                "('murah','murah'),"+
                "('mimpi','ngimpi'),"+
                "('minum','ngombe'),"+
                "('makanan','pangan'),"+
                "('malam','wengi'),"+
                "('nama','aran'),"+
                "('ngomel','clathu'),"+
                "('nikah','rabi'),"+
                "('nilai','aji'),"+
                "('obat','obat'),"+
                "('ompong','ompong'),"+
                "('orang','wong'),"+
                "('pantat','bokong'),"+
                "('pegang','cekel'),"+
                "('potong','cukur'),"+
                "('punya','duwe'),"+
                "('pagi','esuk'),"+
                "('pakai','gawe'),"+
                "('punggung','geger'),"+
                "('pria','lanang'),"+
                "('pencuri','maling'),"+
                "('pulang','mulih'),"+
                "('pegang','nyekel'),"+
                "('pinjam','nyilih'),"+
                "('payung','payung'),"+
                "('pemandian','padusan'),"+
                "('panas','panas'),"+
                "('peninggalan','pangilon'),"+
                "('perintah','perentah'),"+
                "('pikir','pikir'),"+
                "('pipi','pipi'),"+
                "('pijat','pijet'),"+
                "('peluk','rangkul'),"+
                "('perhiasan','sandhangan'),"+
                "('rata','rata'),"+
                "('sendiri','dhewe'),"+
                "('suap','dulang'),"+
                "('semua','kabeh'),"+
                "('selimut','kemul'),"+
                "('suruh','kongkon'),"+
                "('sakit','lara'),"+
                "('sama','padha'),"+
                "('sapi','sapi'),"+
                "('sabuk','sabuk'),"+
                "('sebentar','sedela'),"+
                "('sendok','sendhok'),"+
                "('selamat','slamet'),"+
                "('suara','swara'),"+
                "('susu','susu'),"+
                "('sehat','waras'),"+
                "('senyum','guyu'),"+
                "('tulang','balung'),"+
                "('tunggu','enteni'),"+
                "('tambah','imbuh'),"+
                "('teriak','jarit'),"+
                "('tari','joget'),"+
                "('terkejut','kaget'),"+
                "('telinga','kuing'),"+
                "('tanah','lemah'),"+
                "('turun','mudhun'),"+
                "('tangis','nangis'),"+
                "('tanam','tandur'),"+
                "('tidur','turu'),"+
                "('takut','wadi'),"+
                "('uang','dhuwit'),"+
                "('umur','umur'),"+
                "('utuh','wutuh'),"+
                "('wajah','rai'),"+
                "('wujud','rupa'),"+
                "('wanita','wadon');";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub

    }

}
