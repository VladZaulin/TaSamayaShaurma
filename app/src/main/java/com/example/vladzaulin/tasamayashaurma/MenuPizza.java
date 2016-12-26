package com.example.vladzaulin.tasamayashaurma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;


/**
 * Created by vlados on 17.12.2016.
 */
public class MenuPizza extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizza);


    }


    public void onClickPizza(View v) {

        int id = v.getId();

        switch (id) {
            case R.id.pizza_sicilia360:
                Intent intent_pizza_sicilia = new Intent(MenuPizza.this, ShoppingList.class);
                intent_pizza_sicilia.putExtra("Product", "Пицца Сицилия - 360");
                startActivity(intent_pizza_sicilia);
                break;
            case R.id.pizza_firm350:
                Intent intent_pizza_firm = new Intent(MenuPizza.this, ShoppingList.class);
                intent_pizza_firm.putExtra("Product", "Пицца Фирменная - 350");
                startActivity(intent_pizza_firm);
                break;
            case R.id.pizza_al_pro300:
                Intent intent_pizza_al_pro = new Intent(MenuPizza.this, ShoppingList.class);
                intent_pizza_al_pro.putExtra("Product", "Пицца Аль-Прошутто - 300");
                startActivity(intent_pizza_al_pro);
                break;
            case R.id.pizza_pro_fung300:
                Intent intent_pizza_pro_fung = new Intent(MenuPizza.this, ShoppingList.class);
                intent_pizza_pro_fung.putExtra("Product", "Пицца Прошутто Фунги - 300");
                startActivity(intent_pizza_pro_fung);
                break;
            case R.id.pizza_stravag300:
                Intent intent_pizza_stravag = new Intent(MenuPizza.this, ShoppingList.class);
                intent_pizza_stravag.putExtra("Product", "Пицца Страваганца - 300");
                startActivity(intent_pizza_stravag);
                break;
            case R.id.pizza_karleone300:
                Intent intent_pizza_karleone = new Intent(MenuPizza.this, ShoppingList.class);
                intent_pizza_karleone.putExtra("Product", "Пицца Карлеоне - 300");
                startActivity(intent_pizza_karleone);
                break;
            case R.id.pizza_vegetar300:
                Intent intent_pizza_vegetar = new Intent(MenuPizza.this, ShoppingList.class);
                intent_pizza_vegetar.putExtra("Product", "Пицца Вегетарианская - 300");
                startActivity(intent_pizza_vegetar);
                break;
            case R.id.pizza_chesare310:
                Intent intent_pizza_chesare = new Intent(MenuPizza.this, ShoppingList.class);
                intent_pizza_chesare.putExtra("Product", "Пицца Чезаре - 310");
                startActivity(intent_pizza_chesare);
                break;
            case R.id.pizza_estate340:
                Intent intent_pizza_estate = new Intent(MenuPizza.this, ShoppingList.class);
                intent_pizza_estate.putExtra("Product", "Пицца Эстате - 340");
                startActivity(intent_pizza_estate);
                break;
            case R.id.pizza_konsalame340:
                Intent intent_pizza_konsalame = new Intent(MenuPizza.this, ShoppingList.class);
                intent_pizza_konsalame.putExtra("Product", "Пицца Консаламе - 340");
                startActivity(intent_pizza_konsalame);
                break;
            case R.id.pizza_primavera350:
                Intent intent_pizza_primavera = new Intent(MenuPizza.this, ShoppingList.class);
                intent_pizza_primavera.putExtra("Product", "Пицца Примавера - 350");
                startActivity(intent_pizza_primavera);
                break;
            case R.id.pizza_pepperoni380:
                Intent intent_pizza_pepperoni = new Intent(MenuPizza.this, ShoppingList.class);
                intent_pizza_pepperoni.putExtra("Product", "Пицца Пепперони - 380");
                startActivity(intent_pizza_pepperoni);
                break;
            case R.id.pizza_pikanto400:
                Intent intent_pizza_pikanto = new Intent(MenuPizza.this, ShoppingList.class);
                intent_pizza_pikanto.putExtra("Product", "Пицца Пиканто - 400");
                startActivity(intent_pizza_pikanto);
                break;


        }
    }

    public void zakaz(View v){
        switch (v.getId()) {
            case R.id.zakaz_button:
                Intent intent_zakaz = new Intent(MenuPizza.this, ShoppingList.class);
                startActivity(intent_zakaz);
                break;
            default:
                break;
        }
    }

    public void back(View v){
        switch (v.getId()) {
            case R.id.back_button:
                Intent intent_back = new Intent(MenuPizza.this, ShopMenu.class);
                startActivity(intent_back);
                break;
            default:
                break;
        }
    }
}