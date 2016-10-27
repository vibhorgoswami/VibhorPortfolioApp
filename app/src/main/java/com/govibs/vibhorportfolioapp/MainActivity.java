package com.govibs.vibhorportfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnPopularApp = (Button) findViewById(R.id.btnPopularMovieApp);
        btnPopularApp.setOnClickListener(this);
        Button btnStockApp = (Button) findViewById(R.id.btnStockApp);
        btnStockApp.setOnClickListener(this);
        Button btnBuiltItBiggerApp = (Button) findViewById(R.id.btnBuiltItBiggerApp);
        btnBuiltItBiggerApp.setOnClickListener(this);
        Button btnMaterialApp = (Button) findViewById(R.id.btnMaterialApp);
        btnMaterialApp.setOnClickListener(this);
        Button btnGoUbiquitousApp = (Button) findViewById(R.id.btnGoUbiquitousApp);
        btnGoUbiquitousApp.setOnClickListener(this);
        Button btnCapstoneApp = (Button) findViewById(R.id.btnCapstoneApp);
        btnCapstoneApp.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        showToast(view.getId());
    }

    /**
     * Show a toast for the related view ID.
     * @param id the view ID
     */
    private void showToast(int id) {
        switch (id) {
            case R.id.btnPopularMovieApp:
                Toast.makeText(this,
                        getString(R.string.text_toast_description,
                        getString(R.string.text_title_app_popular_movies)),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnStockApp:
                Toast.makeText(this,
                        getString(R.string.text_toast_description,
                                getString(R.string.text_title_app_stock_hawk)),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnBuiltItBiggerApp:
                Toast.makeText(this,
                        getString(R.string.text_toast_description,
                                getString(R.string.text_title_app_build_it_bigger)),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnMaterialApp:
                Toast.makeText(this,
                        getString(R.string.text_toast_description,
                                getString(R.string.text_title_app_make_material)),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnGoUbiquitousApp:
                Toast.makeText(this,
                        getString(R.string.text_toast_description,
                                getString(R.string.text_title_app_go_ubiquitous)),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnCapstoneApp:
                Toast.makeText(this,
                        getString(R.string.text_toast_description,
                                getString(R.string.text_title_app_capstone)),
                        Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
