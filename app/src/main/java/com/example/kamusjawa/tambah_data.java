package com.example.kamusjawa;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class tambah_data extends AppCompatActivity {
    protected Cursor cursor;
    DataHelper dbHelper;
    EditText indo, jawa;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tambah_data);

        dbHelper = new DataHelper(this);
        indo = (EditText) findViewById(R.id.edtxt_indo);
        jawa = (EditText) findViewById(R.id.edtxt_jawa);
    }

    public void simpan(View v){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        db.execSQL("insert into datakamus(indonesia, jawa) values('" +
                indo.getText().toString() + "','" +
                jawa.getText().toString() + "')");
        Toast.makeText(getApplicationContext(), "Data Berhasil Ditambahkan", Toast.LENGTH_LONG).show();
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Intent a = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(a);
                tambah_data.this.finish();
                return true;
            case R.id.item2:
                return true;
            case R.id.item3:
                Intent b = new Intent(getApplicationContext(), tampil_data.class);
                startActivity(b);
                tambah_data.this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
