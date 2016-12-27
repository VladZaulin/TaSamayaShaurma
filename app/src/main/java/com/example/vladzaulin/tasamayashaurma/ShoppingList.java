package com.example.vladzaulin.tasamayashaurma;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

public class ShoppingList extends AppCompatActivity implements
        View.OnClickListener {

    private Button btnDatePicker, btnTimePicker;
    private ArrayList<EditText> zakaz;
    private TextView textView;
    private EditText editTextDate, editTextTime , nameSurname, mobilePhone, addressPlace, suggestions;
  /*  static ArrayList<String> productList = new ArrayList<String>(100);  */

    // делаем переменные даты/времени полями, т.к. в реальных
    // приложениях они чаще всего используются и в других местах.
    private int mYear, mMonth, mDay, mHour, mMinute;

    /* String[] products = new String[]{
             "Шаурма с крицей", "Шаурма со свининой", "Шаурма-мини с курицей", "Шаурма-мини со свининой",
             "Шаурма с курицей и картофелем фри", "Шаурма со свининой и картофелем фри",
             "Шаурма-VIP со свининой", "Шаурма-VIP с курицей", "Шаурма сырная со свининой", "Шаурма сырная с курицей",
             "Шашлык из курицы", "Шашлык из свинины", "Люля-кебаб из говядины", "Люля-кебаб из курицы",
             "Чикен-бургер с сыром", "Чикен-бургер", "Гамбургер", "Гамбургер с сыром",
             "Пицца Сицилия", "Пицца Фирменная", "Пицца Аль-Прошутто", "Пицца Прошутто Фунги",
             "Пицца Страваганца", "Пицца Карлеоне", "Пицца Вегетаринская", "Пицца Чезаре",
             "Пицца Эстате", "Пицца Консаламе", "Пицца Примавера", "Пицца Пепперони", "Пицца Пиканто",
             "Напиток Coca-Cola 1L", "Напиток Сок Добрый 1л", "Напиток Nestea 1L", "Напиток Боржоми 1л"
     };
 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop);


       /* ArrayList<Intent> productList = new ArrayList<>(10); */

        TextView textView = (TextView) findViewById(R.id.display_message);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            String product = extras.getString("Product");
           /* ArrayList<Intent> productList = new ArrayList<>(10);*/
           

            textView.setText(getResources().getString(R.string.productPrice, product));
            



        }

     /*   String product = getIntent().getStringExtra("Product");
        String price = getIntent().getStringExtra("Price");

        TextView textView = (TextView) findViewById(R.id.display_message);

        textView.setText(getResources().getString(R.string.productPrice, product, price)); */


        /* ArrayList<String> shaurmaFromIntent = (ArrayList<String>)getIntent().getSerializableExtra("Shaurma");
        ArrayList<String> shashlykFromIntent = (ArrayList<String>)getIntent().getSerializableExtra("Shashlyk");
        ArrayList<String> kebabFromIntent = (ArrayList<String>)getIntent().getSerializableExtra("Kebab");
        ArrayList<String> pizzaFromIntent = (ArrayList<String>)getIntent().getSerializableExtra("Pizza");
        ArrayList<String> burgerFromIntent = (ArrayList<String>)getIntent().getSerializableExtra("Burger");
        ArrayList<String> otherFromIntent = (ArrayList<String>)getIntent().getSerializableExtra("Other");  */

      /*  String ShaurmaList = "";
        for(int i=0; i<shaurmaFromIntent.size(); i++)
        {
            ShaurmaList = ShaurmaList + shaurmaFromIntent.get(i);
        }

        TextView shaurmaView = (TextView) findViewById(R.id.display_message);
        shaurmaView.setText(ShaurmaList);

        String ShashlykList = "";
        for(int i = 0; i<shashlykFromIntent.size(); i++)
        {
            ShashlykList = ShashlykList + shashlykFromIntent.get(i);
        }

        TextView shashlykView = (TextView) findViewById(R.id.display_message_2);
        shashlykView.setText(ShashlykList);

        String KebabList = "";
        for (int i = 0; i<kebabFromIntent.size(); i++)
        {
            KebabList = KebabList + kebabFromIntent.get(i);
        }

        TextView kebabView = (TextView) findViewById(R.id.display_message_3);
        kebabView.setText(KebabList);

        String PizzaList = "";
        for (int i = 0; i<pizzaFromIntent.size(); i++)
        {
            PizzaList = PizzaList + pizzaFromIntent.get(i);
        }

        TextView pizzaView = (TextView) findViewById(R.id.display_message_4);
        pizzaView.setText(PizzaList);

        String BurgerList = "";
        for(int i = 0; i<burgerFromIntent.size(); i++)
        {
            BurgerList = BurgerList + burgerFromIntent.get(i);
        }

        TextView burgerView = (TextView) findViewById(R.id.display_message_5);
        burgerView.setText(BurgerList);

        String OtherList = "";
        for (int i = 0; i<otherFromIntent.size(); i++)
        {
            OtherList = OtherList + otherFromIntent.get(i);
        }

        TextView otherView = (TextView) findViewById(R.id.display_message_6);
        otherView.setText(OtherList);



        String mProductList = "Товары в корзине:";
        for (int i = 0; i<productList.size(); i++)
        {
            mProductList = mProductList + productList.get(i) + " ";
        }

        TextView textView = (TextView) findViewById(R.id.display_message);
        textView.setText(mProductList); */

        nameSurname = (EditText) findViewById(R.id.name);
        mobilePhone = (EditText) findViewById(R.id.phone);
        addressPlace = (EditText) findViewById(R.id.address);
        suggestions = (EditText) findViewById(R.id.sugg);

        btnDatePicker = (Button) findViewById(R.id.btn_date);
        btnTimePicker = (Button) findViewById(R.id.btn_time);
        editTextDate = (EditText) findViewById(R.id.picked_date);
        editTextTime = (EditText) findViewById(R.id.picked_time);

        btnDatePicker.setOnClickListener(this);
        btnTimePicker.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.btn_date:
                // вызываем диалог с выбором даты
                callDatePicker();
                break;

            case R.id.btn_time:
                // вызываем диалог с выбором времени
                callTimePicker();
                break;
        }
    }

    private void callTimePicker() {
        // получаем текущее время
        final Calendar cal = Calendar.getInstance();
        mHour = cal.get(Calendar.HOUR_OF_DAY);
        mMinute = cal.get(Calendar.MINUTE);

        // инициализируем диалог выбора времени текущими значениями
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        String editTextTimeParam = hourOfDay + " : " + minute;
                        editTextTime.setText(editTextTimeParam);
                    }
                }, mHour, mMinute, false);
        timePickerDialog.show();
    }

    private void callDatePicker() {
        // получаем текущую дату
        final Calendar cal = Calendar.getInstance();
        mYear = cal.get(Calendar.YEAR);
        mMonth = cal.get(Calendar.MONTH);
        mDay = cal.get(Calendar.DAY_OF_MONTH);

        // инициализируем диалог выбора даты текущими значениями
        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        String editTextDateParam = dayOfMonth + "." + (monthOfYear + 1) + "." + year;
                        editTextDate.setText(editTextDateParam);
                    }
                }, mYear, mMonth, mDay);
        datePickerDialog.show();
    }

    public void onSendClicked (View v)
    {
      /*  HashMap<String, String> query = new HashMap<String,String>();

        query.put("zakaz", textView.getText().toString());
        query.put("namesurname", nameSurname.getText().toString());
        query.put("mobilephone", mobilePhone.getText().toString());
        query.put("addressplace", addressPlace.getText().toString());
        query.put("sugg", suggestions.getText().toString());
        query.put("date", editTextDate.getText().toString());
        query.put("time", editTextTime.getText().toString()); */

        ArrayList<EditText> zakaz = new ArrayList<>(1000);
        zakaz.add(nameSurname);
        zakaz.add(mobilePhone);
        zakaz.add(addressPlace);
        zakaz.add(editTextDate);
        zakaz.add(editTextTime);

        String numberText = "+79632314715";
        try {

            for (int i = 0; i < zakaz.size(); i++) {
                SmsManager.getDefault().sendTextMessage(numberText, null, textView.getText().toString() + zakaz.get(i).getText().toString(), null, null);

                Toast.makeText(getApplicationContext(), "Заказ отправлен!!",
                        Toast.LENGTH_LONG).show();
            }


        }catch (Exception e){

            Toast.makeText(getApplicationContext(),
                    "Заказ не отправлен, попробуйте ещё раз",
                    Toast.LENGTH_LONG).show();
            e.printStackTrace();

        }



    }


    public void back(View v){
        switch (v.getId()) {
            case R.id.back_button:
                Intent intent_back = new Intent(ShoppingList.this, ShopMenu.class);
                startActivity(intent_back);
                break;
            default:
                break;
        }
    }

}
