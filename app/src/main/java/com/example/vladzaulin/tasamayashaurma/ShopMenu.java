package com.example.vladzaulin.tasamayashaurma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by vlados on 17.12.2016.
 */
public class ShopMenu extends AppCompatActivity implements
        View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_sam);


    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.shaurma:
                Intent intent_shaurma = new Intent(ShopMenu.this, MenuShaurma.class);
                startActivity(intent_shaurma);
                break;
            case R.id.shashlyk:
                Intent intent_shashlyk = new Intent(ShopMenu.this, MenuShashlyk.class);
                startActivity(intent_shashlyk);
                break;
            case R.id.lulya_kebab:
                Intent intent_kebab = new Intent(ShopMenu.this, MenuKebab.class);
                startActivity(intent_kebab);
                break;
            case R.id.other_food:
                Intent intent_other_food = new Intent(ShopMenu.this, MenuOther.class);
                startActivity(intent_other_food);
                break;
            case R.id.pizza:
                Intent intent_pizza = new Intent(ShopMenu.this, MenuPizza.class);
                startActivity(intent_pizza);
                break;
            case R.id.burger:
                Intent intent_burger = new Intent(ShopMenu.this, MenuBurger.class);
                startActivity(intent_burger);
                break;





        }
    }
}