package ru.protei.matveevyg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import ru.protei.matveevyg.adapters.NoteAdapter
import ru.protei.matveevyg.domain.Note

class MainActivity : AppCompatActivity() {

    private var noteList = arrayListOf<Note>();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textItem1 = Note("Проснуться", "Проснуться вовремя наконец");
        val textItem2 = Note("Работа", "Покодить 8 часов");
        val textItem3 = Note("Котлин", "Сделать домашку по котлину");
        var textItem4 = Note("Лабы", "Выгребать лабы")

        noteList.add(textItem1);
        noteList.add(textItem2);
        noteList.add(textItem3);
        noteList.add(textItem4);

        val listView = findViewById<ListView?>(R.id.nodeLIst);

        val adapter = NoteAdapter(this, noteList);
        listView.adapter = adapter;
    }
}
