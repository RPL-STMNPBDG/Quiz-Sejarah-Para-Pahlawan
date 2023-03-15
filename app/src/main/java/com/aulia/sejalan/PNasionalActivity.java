package com.aulia.sejalan;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.aulia.sejalan.design.CustomAdapter;
import com.aulia.sejalan.model.ItemListPahlawan;
import java.util.ArrayList;

public class PNasionalActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ArrayList<ItemListPahlawan> p_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pnasional);

        ListView listView = findViewById(R.id.custom_list_view);
        p_list = set();
        CustomAdapter customAdapter = new
                CustomAdapter(PNasionalActivity.this,p_list);
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(this);
    }

    private ArrayList<ItemListPahlawan> set(){
        p_list = new ArrayList<>();

        p_list.add(new ItemListPahlawan(R.drawable.pnas_soekarno, "Ir. Soekarno", "Jawa Timur"));
        p_list.add(new ItemListPahlawan(R.drawable.pnas_hatta, "Mohammad Hatta", "Sumatera Barat"));
        p_list.add(new ItemListPahlawan(R.drawable.pnas_soetomo, "Soetomo", "Jawa Timur"));
        p_list.add(new ItemListPahlawan(R.drawable.pnas_tanmalaka, "Tan Malaka", "Sumatera Barat"));
        p_list.add(new ItemListPahlawan(R.drawable.pnas_achmadsoebardjo, "Achmad Soebardjo", "Jawa Barat"));
        p_list.add(new ItemListPahlawan(R.drawable.pnas_soepomo, "Dr. Soepomo", "Jawa Tengah"));
        p_list.add(new ItemListPahlawan(R.drawable.pnas_adisuryo, "Tirto Adhi Soerjo", "Jawa Tengah"));
        p_list.add(new ItemListPahlawan(R.drawable.pnas_tjokroaminoto, "H.O.S Tjokroaminoto", "Jawa Timur"));
        p_list.add(new ItemListPahlawan(R.drawable.pnas_jenderalsoedirman, "Jenderal Soedirman", "Jawa Tengah"));
        p_list.add(new ItemListPahlawan(R.drawable.pnas_khhasyim, "K. H. Hasyim Asy'ari", "Jawa Timur"));

        return p_list;
    }

    public void btnBackToMenu(View v) {
        Intent btm = new Intent(PNasionalActivity.this, MenuActivity.class);
        startActivity(btm);
        finish();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        if(position==0){
            //clicked Ir. Soekarno
            startActivity(new Intent(PNasionalActivity.this, Pnas1Activity.class));
            finish();
        }
        else if(position==1){
            startActivity(new Intent(PNasionalActivity.this, Pnas2Activity.class));
            finish();
        }
        else if(position==2){
            startActivity(new Intent(PNasionalActivity.this, Pnas3Activity.class));
            finish();
        }
        else if(position==3){
            startActivity(new Intent(PNasionalActivity.this, Pnas4Activity.class));
            finish();
        }
        else if(position==4){
            startActivity(new Intent(PNasionalActivity.this, Pnas5Activity.class));
            finish();
        }
        else if(position==5){
            startActivity(new Intent(PNasionalActivity.this, Pnas6Activity.class));
            finish();
        }
        else if(position==6){
            startActivity(new Intent(PNasionalActivity.this, Pnas7Activity.class));
            finish();
        }
        else if(position==7){
            startActivity(new Intent(PNasionalActivity.this, Pnas8Activity.class));
            finish();
        }
        else if(position==8){
            startActivity(new Intent(PNasionalActivity.this, Pnas9Activity.class));
            finish();
        }
        else if(position==9){
            startActivity(new Intent(PNasionalActivity.this, Pnas10Activity.class));
            finish();
        }
    }
}