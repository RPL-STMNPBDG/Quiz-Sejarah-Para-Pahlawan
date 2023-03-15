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

public class PRevolusiActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ArrayList<ItemListPahlawan> p_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevolusi);

        ListView listView = findViewById(R.id.custom_list_view);
        p_list = set();
        CustomAdapter customAdapter = new
                CustomAdapter(PRevolusiActivity.this,p_list);
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(this);
    }

    private ArrayList<ItemListPahlawan> set(){
        p_list = new ArrayList<>();

        p_list.add(new ItemListPahlawan(R.drawable.prev_jenderalahmadyani, "Jenderal Ahmad Yani", "Jawa Tengah"));
        p_list.add(new ItemListPahlawan(R.drawable.prev_suprapto, "Letnan Jenderal Raden Suprapto", "Jawa Tengah"));
        p_list.add(new ItemListPahlawan(R.drawable.prev_titodarmo, "Letnan Jenderal Mas Titodarmo Haryono", "Jawa Timur"));
        p_list.add(new ItemListPahlawan(R.drawable.prev_siswondo, "Letnan Jenderal Siswondo Parman", "Jawa Tengah"));
        p_list.add(new ItemListPahlawan(R.drawable.prev_pandjaitan, "Mayor Jenderal Donald Isaac Pandjaitan", "Sumatra Utara"));
        p_list.add(new ItemListPahlawan(R.drawable.prev_sutoyo, "Mayor Jenderal Sutoyo Siswomiharjo", "Jawa Tengah"));
        p_list.add(new ItemListPahlawan(R.drawable.prev_kaptenpier, "Kapten Czi. Pierre Tendean", "Batavia/Jakarta"));
        p_list.add(new ItemListPahlawan(R.drawable.prev_karel, "Ajun Inspektur Karel Sadsuitubun", "Maluku Tenggara"));
        p_list.add(new ItemListPahlawan(R.drawable.prev_katamso, "Brigadir Jenderal Katamso Darmokusumo", "Jawa Tengah"));
        p_list.add(new ItemListPahlawan(R.drawable.prev_sugiyono, "Kolonel Sugiyono Mangunwiyoto", "D. I. Yogyakarta"));

        return p_list;
    }

    public void btnBackToMenu(View v) {
        Intent btm = new Intent(PRevolusiActivity.this, MenuActivity.class);
        startActivity(btm);
        finish();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        if(position==0){
            //clicked Item
            startActivity(new Intent(PRevolusiActivity.this, Prev1Activity.class));
            finish();
        }
        else if(position==1){
            startActivity(new Intent(PRevolusiActivity.this, Prev2Activity.class));
            finish();
        }
        else if(position==2){
            startActivity(new Intent(PRevolusiActivity.this, Prev3Activity.class));
            finish();
        }
        else if(position==3){
            startActivity(new Intent(PRevolusiActivity.this, Prev4Activity.class));
            finish();
        }
        else if(position==4){
            startActivity(new Intent(PRevolusiActivity.this, Prev5Activity.class));
            finish();
        }
        else if(position==5){
            startActivity(new Intent(PRevolusiActivity.this, Prev6Activity.class));
            finish();
        }
        else if(position==6){
            startActivity(new Intent(PRevolusiActivity.this, Prev7Activity.class));
            finish();
        }
        else if(position==7){
            startActivity(new Intent(PRevolusiActivity.this, Prev8Activity.class));
            finish();
        }
        else if(position==8){
            startActivity(new Intent(PRevolusiActivity.this, Prev9Activity.class));
            finish();
        }
        else if(position==9){
            startActivity(new Intent(PRevolusiActivity.this, Prev10Activity.class));
            finish();
        }
    }
}