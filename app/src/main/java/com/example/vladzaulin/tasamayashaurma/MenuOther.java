package com.example.vladzaulin.tasamayashaurma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by vlados on 17.12.2016.
 */
public class MenuOther extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);



    }


    public void onClickOther(View v) {


        int id = v.getId();


        switch (id) {

            case R.id.hot_dog60:
                Intent intent_hot_dog = new Intent(MenuOther.this, ShoppingList.class);
                intent_hot_dog.putExtra("Product", "Хот-дог - 60");
                startActivity(intent_hot_dog);
                break;
            case R.id.potato_skewer100:
                Intent intent_potato_skewer = new Intent(MenuOther.this, ShoppingList.class);
                intent_potato_skewer.putExtra("Product", "Картофель на шампуре - 100");
                startActivity(intent_potato_skewer);
                break;
            case R.id.mushrooms_skewer150:
                Intent intent_mushrooms_skewer = new Intent(MenuOther.this, ShoppingList.class);
                intent_mushrooms_skewer.putExtra("Product", "Грибы на шампуре - 150");
                startActivity(intent_mushrooms_skewer);
                break;
            case R.id.cheese_na_mangale100:
                Intent intent_cheese_na_mangale = new Intent(MenuOther.this, ShoppingList.class);
                intent_cheese_na_mangale.putExtra("Product", "Сыр на мангале - 100");
                startActivity(intent_cheese_na_mangale);
                break;
            case R.id.hachapur230:
                Intent intent_hachapur = new Intent(MenuOther.this, ShoppingList.class);
                intent_hachapur.putExtra("Product", "Хачапури по-Аджарски - 230");
                startActivity(intent_hachapur);
                break;


        }
    }

    public void zakaz(View v){
        switch (v.getId()) {
            case R.id.zakaz_button:
                Intent intent_zakaz = new Intent(MenuOther.this, ShoppingList.class);
                startActivity(intent_zakaz);
                break;
            default:
                break;
        }
    }

    public void back(View v){
        switch (v.getId()) {
            case R.id.back_button:
                Intent intent_back = new Intent(MenuOther.this, ShopMenu.class);
                startActivity(intent_back);
                break;
            default:
                break;
        }
    }
}