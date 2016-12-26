package com.example.vladzaulin.tasamayashaurma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by vlados on 17.12.2016.
 */
public class MenuShaurma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shaurma);


    }


    public void onClickShaurma(View v) {

        int id = v.getId();

        switch (id) {
            case R.id.sh_pork140:
                Intent intent_sh_pork = new Intent(MenuShaurma.this, ShoppingList.class);
                intent_sh_pork.putExtra("Product", "Шаурма со свининой - 140");
                startActivity(intent_sh_pork);
                break;
            case R.id.sh_pork_mini100:
                Intent intent_sh_pork_mini = new Intent(MenuShaurma.this, ShoppingList.class);
                intent_sh_pork_mini.putExtra("Product", "Шаурма со свининой мини - 100");
                startActivity(intent_sh_pork_mini);
                break;
            case R.id.sh_hen120:
                Intent intent_sh_hen = new Intent(MenuShaurma.this, ShoppingList.class);
                intent_sh_hen.putExtra("Product", "Шаурма с курицей - 120");
                startActivity(intent_sh_hen);
                break;
            case R.id.sh_hen_mini80:
                Intent intent_sh_hen_mini = new Intent(MenuShaurma.this, ShoppingList.class);
                intent_sh_hen_mini.putExtra("Product", "Шаурма с курицей мини - 80");
                startActivity(intent_sh_hen_mini);
                break;
            case R.id.sh_pork_fri160:
                Intent intent_sh_pork_fri = new Intent(MenuShaurma.this, ShoppingList.class);
                intent_sh_pork_fri.putExtra("Product", "Шаурма со свининой и картофелем-фри - 160");
                startActivity(intent_sh_pork_fri);
                break;
            case R.id.sh_hen_fri140:
                Intent intent_sh_hen_fri = new Intent(MenuShaurma.this, ShoppingList.class);
                intent_sh_hen_fri.putExtra("Product", "Шаурма с курицей и картофелем-фри - 140");
                startActivity(intent_sh_hen_fri);
                break;
            case R.id.sh_pork_vip200:
                Intent intent_sh_pork_vip = new Intent(MenuShaurma.this, ShoppingList.class);
                intent_sh_pork_vip.putExtra("Product", "Шаурма со свининой VIP - 200");
                startActivity(intent_sh_pork_vip);
                break;
            case R.id.sh_hen_vip180:
                Intent intent_sh_hen_vip = new Intent(MenuShaurma.this, ShoppingList.class);
                intent_sh_hen_vip.putExtra("Product", "Шаурма с курицей VIP - 180");
                startActivity(intent_sh_hen_vip);
                break;
            case R.id.sh_hen_zhul200:
                Intent intent_sh_hen_zhu = new Intent(MenuShaurma.this, ShoppingList.class);
                intent_sh_hen_zhu.putExtra("Product", "Жульен-шаурма с курицей - 200");
                startActivity(intent_sh_hen_zhu);
                break;
            case R.id.sh_pork_cheese160:
                Intent intent_sh_pork_cheese = new Intent(MenuShaurma.this, ShoppingList.class);
                intent_sh_pork_cheese.putExtra("Product", "Сырная шаурма со свининой - 160");
                startActivity(intent_sh_pork_cheese);
                break;
            case R.id.sh_hen_cheese140:
                Intent intent_sh_hen_cheese = new Intent(MenuShaurma.this, ShoppingList.class);
                intent_sh_hen_cheese.putExtra("Product", "Сырная шаурма с курицей - 140");
                startActivity(intent_sh_hen_cheese);
                break;
            case R.id.sh_vegetarian60:
                Intent intent_sh_vegetarian = new Intent(MenuShaurma.this, ShoppingList.class);
                intent_sh_vegetarian.putExtra("Product", "Вегетарианская шаурма - 60");
                startActivity(intent_sh_vegetarian);
                break;
            case R.id.sh_govyad_lep170:
                Intent intent_sh_govyad_lep = new Intent(MenuShaurma.this, ShoppingList.class);
                intent_sh_govyad_lep.putExtra("Product", "Шаурма с говядиной в лепёшке - 170");
                startActivity(intent_sh_govyad_lep);
                break;
            case R.id.sh_pork_lep150:
                Intent intent_sh_pork_lep = new Intent(MenuShaurma.this, ShoppingList.class);
                intent_sh_pork_lep.putExtra("Product", "Шаурма со свининой в лепёшке - 150");
                startActivity(intent_sh_pork_lep);
                break;
            case R.id.sh_hen_lep130:
                Intent intent_sh_hen_lep = new Intent(MenuShaurma.this, ShoppingList.class);
                intent_sh_hen_lep.putExtra("Product", "Шаурма с курицей в лепёшке - 130");
                startActivity(intent_sh_hen_lep);
                break;

        }
    }


    public void zakaz(View v){
        switch (v.getId()) {
            case R.id.zakaz_button:
                Intent intent_zakaz = new Intent(MenuShaurma.this, ShoppingList.class);
                startActivity(intent_zakaz);
                break;
            default:
                break;
        }
    }

    public void back(View v){
        switch (v.getId()) {
            case R.id.back_button:
                Intent intent_back = new Intent(MenuShaurma.this, ShopMenu.class);
                startActivity(intent_back);
                break;
            default:
                break;
        }
    }
}