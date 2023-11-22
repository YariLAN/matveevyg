package ru.protei.matveevyg.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import ru.protei.matveevyg.R
import ru.protei.matveevyg.domain.Note

class NoteAdapter(context: Context, val resource: ArrayList<Note>) : ArrayAdapter<Note>(context, R.layout.item_note, resource) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater : LayoutInflater = this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater;
        val view : View = inflater.inflate(R.layout.item_note, parent, false);

        val title: TextView = view.findViewById<TextView?>(R.id.title_note)
        val text: TextView = view.findViewById<TextView?>(R.id.text_note)

        title.text = resource[position].title;
        text.text = resource[position].text;

        return view;
    }
}