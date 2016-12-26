package com.example.vladzaulin.tasamayashaurma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by vlados on 17.12.2016.
 */
public class MenuBurger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.burger);


    }


    public void onClickBurger(View v) {

        int id = v.getId();

        switch (id) {
            case R.id.chiken_burger120:
                Intent intent_chiken_burger = new Intent(MenuBurger.this, ShoppingList.class);
                intent_chiken_burger.putExtra("Product", "Чикен-бургер - 120");
                startActivity(intent_chiken_burger);
                break;
            case R.id.chiken_burger_cheese130:
                Intent intent_chiken_burger_cheese = new Intent(MenuBurger.this, ShoppingList.class);
                intent_chiken_burger_cheese.putExtra("Product", "Чикен-бургер с сыром - 130");
                startActivity(intent_chiken_burger_cheese);
                break;
            case R.id.gamburger140:
                Intent intent_gamburger = new Intent(MenuBurger.this, ShoppingList.class);
                intent_gamburger.putExtra("Product", "Гамбургер - 140");
                startActivity(intent_gamburger);
                break;
            case R.id.gamburger_cheese150:
                Intent intent_gamburger_cheese = new Intent(MenuBurger.this, ShoppingList.class);
                intent_gamburger_cheese.putExtra("Product", "Гамбургер с сыром - 150");
                startActivity(intent_gamburger_cheese);
                break;

        }
    }


    public void zakaz(View v){
        switch (v.getId()) {
            case R.id.zakaz_button:
                Intent intent_zakaz = new Intent(MenuBurger.this, ShoppingList.class);
                startActivity(intent_zakaz);
                break;
            default:
                break;
        }
    }

    public void back(View v){
        switch (v.getId()) {
            case R.id.back_button:
                Intent intent_back = new Intent(MenuBurger.this, ShopMenu.class);
                startActivity(intent_back);
                break;
            default:
                break;
        }
    }
}
