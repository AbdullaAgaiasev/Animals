package com.example.animals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView animalsRecyclerView;
    private ArrayList<String> animalsList = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animalsRecyclerView = findViewById(R.id.recycler_view);
        loadData();
        AnimalsAdapter adapter = new AnimalsAdapter(animalsList);
        animalsRecyclerView.setAdapter(adapter);
    }

    private void loadData() {
        animalsList.add("Animals");
        animalsList.add("Лев");
        animalsList.add("Зебра");
        animalsList.add("Тигр");
        animalsList.add("Леопард");
        animalsList.add("Пантера");
        animalsList.add("Слон");
        animalsList.add("Антилопа");
        animalsList.add("Лось");
        animalsList.add("Волк");
        animalsList.add("Лиса");
        animalsList.add("Медведь");
        animalsList.add("Жираф");
        animalsList.add("Обезьяны");
        animalsList.add("Бегемот");
        animalsList.add("Носорог");
        animalsList.add("Крокодил");
        animalsList.add("Змеи");
        animalsList.add("Птицы");
        animalsList.add("Пауки");
        animalsList.add("Улитки");
        animalsList.add("Черепахи");
        animalsList.add("Ленивец");
        animalsList.add("Заец");
        animalsList.add("Собаки");
        animalsList.add("Кошки");
        animalsList.add("Шиншилы");
        animalsList.add("Куры");
        animalsList.add("Петухи");
        animalsList.add("Черви");
        animalsList.add("Кроты");
        animalsList.add("Рыбы");
        animalsList.add("Козлы");
        animalsList.add("Бараны");
        animalsList.add("Лошади");
        animalsList.add("Корова");
    }
}