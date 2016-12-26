package com.example.vladzaulin.tasamayashaurma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by vlados on 17.12.2016.
 */
public class MenuKebab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kebab);


    }


    public void onClickKebab(View v) {

        int id = v.getId();

        switch (id) {
            case R.id.lulya_govyad150:
                Intent intent_lulya_govyad = new Intent(MenuKebab.this, ShoppingList.class);
                intent_lulya_govyad.putExtra("Product", "Люля-кебаб из говядины - 150");
                startActivity(intent_lulya_govyad);
                break;
            case R.id.lulya_hen120:
                Intent intent_lulya_hen = new Intent(MenuKebab.this, ShoppingList.class);
                intent_lulya_hen.putExtra("Product", "Люля-кебаб из курицы - 120");
                startActivity(intent_lulya_hen);
                break;
            case R.id.lulya_hen_cheese150:
                Intent intent_lulya_hen_cheese = new Intent(MenuKebab.this, ShoppingList.class);
                intent_lulya_hen_cheese.putExtra("Product", "Люля-кебаб из курицы и сыром - 150");
                startActivity(intent_lulya_hen_cheese);
                break;
            case R.id.lulya_hen_mushrooms150:
                Intent intent_lulya_hen_mushrooms = new Intent(MenuKebab.this, ShoppingList.class);
                intent_lulya_hen_mushrooms.putExtra("Product", "Люля-кебаб из курицы с грибами - 150");
                startActivity(intent_lulya_hen_mushrooms);
                break;


        }
    }

    public void zakaz(View v){
        switch (v.getId()) {
            case R.id.zakaz_button:
                Intent intent_zakaz = new Intent(MenuKebab.this, ShoppingList.class);
                startActivity(intent_zakaz);
                break;
            default:
                break;
        }
    }

    public void back(View v){
        switch (v.getId()) {
            case R.id.back_button:
                Intent intent_back = new Intent(MenuKebab.this, ShopMenu.class);
                startActivity(intent_back);
                break;
            default:
                break;
        }
    }
}
