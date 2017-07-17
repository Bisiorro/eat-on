package com.example.bisio.eat_on;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button allRecipesBtn, searchByProductBtn, addRecipeBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        allRecipesBtn = (Button)findViewById(R.id.button);
        searchByProductBtn = (Button)findViewById(R.id.button2);
        addRecipeBtn = (Button)findViewById(R.id.button3);

        allRecipesBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent goTo = new Intent(MainActivity.this, Recipes.class);
                startActivity(goTo);
            }
        });

        searchByProductBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent goTo = new Intent(MainActivity.this, SearchByProduct.class);
                startActivity(goTo);
            }
        });

        addRecipeBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent goTo = new Intent(MainActivity.this, AddRecipes.class);
                startActivity(goTo);
            }
        });


    }
}
