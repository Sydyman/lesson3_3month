package com.ex.lesson3_3month;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> ufcList = new ArrayList<>();
    private RecyclerView rvUfc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        rvUfc = findViewById(R.id.rv_ufc);
        ufcList.add("Vitor Belfor");
        ufcList.add("Lyoto Machida");
        ufcList.add("Jon Jones");
        ufcList.add("Den Henderson");
        ufcList.add("Daniel Cormier");
        ufcList.add("Cain Velasquez");
        ufcList.add("Shogun Rua");
        ufcList.add("Poatan");
        ufcList.add("Poatan");
        ufcList.add("Poatan");
        ufcList.add("Poatan");
        ufcList.add("Poatan");
        ufcList.add("Poatan");
        ufcList.add("Poatan");
        ufcList.add("Poatan");
        ufcList.add("Poatan");
        ufcList.add("Poatan");
        ufcList.add("Poatan");
        ufcList.add("Poatan");
        ufcList.add("Poatan");

        UfcAdapter adapter = new UfcAdapter(ufcList);
        rvUfc.setAdapter(adapter);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}