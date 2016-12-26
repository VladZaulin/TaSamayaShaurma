package com.example.vladzaulin.tasamayashaurma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by vlados on 17.12.2016.
 */
public class MenuShashlyk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shashlyk);


    }


    public void onClickShashlyk(View v) {

        int id = v.getId();

        switch (id) {
            case R.id.shash_pork100:
                Intent intent_shash_pork = new Intent(MenuShashlyk.this, ShoppingList.class);
                intent_shash_pork.putExtra("Product", "Шашлык из свинины - 100");
                startActivity(intent_shash_pork);
                break;
            case R.id.shash_hen80:
                Intent intent_shash_hen = new Intent(MenuShashlyk.this, ShoppingList.class);
                intent_shash_hen.putExtra("Product", "Шашлык из курицы - 80");
                startActivity(intent_shash_hen);
                break;
            case R.id.shash_pork_kr80:
                Intent intent_shash_pork_kr = new Intent(MenuShashlyk.this, ShoppingList.class);
                intent_shash_pork_kr.putExtra("Product", "Шашлык из куриных крылышек - 80");
                startActivity(intent_shash_pork_kr);
                break;
            case R.id.shash_pork_gol80:
                Intent intent_shash_pork_gol = new Intent(MenuShashlyk.this, ShoppingList.class);
                intent_shash_pork_gol.putExtra("Product", "Шашлык из куриных голеней - 80");
                startActivity(intent_shash_pork_gol);
                break;

        }
    }

    public void zakaz(View v){
        switch (v.getId()) {
            case R.id.zakaz_button:
                Intent intent_zakaz = new Intent(MenuShashlyk.this, ShoppingList.class);
                startActivity(intent_zakaz);
                break;
            default:
                break;
        }
    }

    public void back(View v){
        switch (v.getId()) {
            case R.id.back_button:
                Intent intent_back = new Intent(MenuShashlyk.this, ShopMenu.class);
                startActivity(intent_back);
                break;
            default:
                break;
        }
    }
}
