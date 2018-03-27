package com.example.usuario.persistencia;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class ListActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView = findViewById(R.id.listView);

        MyAdapter myAdapter = new MyAdapter(this,android.R.layout.simple_list_item_1,PersonasSingleton.getInstance().getPersonas());
        listView.setAdapter(myAdapter);
    }

}
//clase adaptador
class MyAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Persona> names;

    public MyAdapter(Context context, int layout, List<Persona> names) {
        this.context = context;
        this.layout = layout;
        this.names = names;
    }

    @Override
    public int getCount() {
        if (this.names != null) {
            return this.names.size();
        } else {
            return 0;
        }
    }

    @Override
    public Object getItem(int i) {
        return this.names.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        //View Holder pattern
        ViewHolder holder;
        if (convertView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            convertView = layoutInflater.inflate(this.layout, null);

            holder = new ViewHolder();
            holder.nameTextView = convertView.findViewById(R.id.textView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }


        Persona persona = names.get(i);

        holder.nameTextView.setText(persona.getNombre());
        return convertView;
    }

    static class ViewHolder {
        private TextView nameTextView;
    }
}
