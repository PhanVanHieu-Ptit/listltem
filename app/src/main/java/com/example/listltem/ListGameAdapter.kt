package com.example.listltem

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ListGameAdapter (
    val context: Context,
    val games:MutableList<Game>
) : BaseAdapter(){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View?
        val game = games[position]
        if(convertView == null){
            view = LayoutInflater.from(context).inflate(R.layout.row_item,parent, false)
        }
        else view = convertView
        view?.let{
            val gameId = it.findViewById<TextView>(R.id.gameId)
            val img = it.findViewById<ImageView>(R.id.img)
            val name = it.findViewById<TextView>(R.id.name)
            val type = it.findViewById<TextView>(R.id.type)
            val rate = it.findViewById<TextView>(R.id.rate)
            val size = it.findViewById<TextView>(R.id.size)

            gameId.text = game.id.toString()
            img.setImageResource(game.img)
            name.text=game.name
            type.text=game.type
            rate.text=game.rate.toString()
            size.text=game.size.toString().plus(" MB")
        }
        return view!!
    }

    override fun getItem(position: Int): Any {
        return games[position]
    }

    override fun getItemId(position: Int): Long {
        return games[position].id.toLong()
    }

    override fun getCount(): Int {
        return games.size
    }

}