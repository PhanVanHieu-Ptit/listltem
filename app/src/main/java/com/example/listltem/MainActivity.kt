package com.example.listltem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var games = mutableListOf<Game>(Game(1, R.mipmap.among_us, "Among Us", "Hành động", 3.7, 45, "Innersloth LLC"),
        Game(2, R.mipmap.ball, "8 Ball Pool", "Thể thao", 4.5, 97, "Miniclip.com"),
        Game(3, R.mipmap.candy, "Candy Crush Saga", "Thông thường", 4.6, 94, "King"),
        Game(4, R.mipmap.chess, "Cờ vua", "Dạng bảng", 4.4, 76, "Chess Prince"),
        Game(5,R.mipmap.lien_quan, "Garena Liên Quân Mobile", "Hành động", 3.9, 455, "Garena"),
        Game(6, R.mipmap.minecraft, "Minecraft Trial", "Trò chơi điện tử", 4.1, 128, "Mojang"),
        Game(7, R.mipmap.plant_vs_zombie, "Plants vs Zombies 2", "Thông thường", 4.2, 357, "Electronic Arts"),
        Game(8, R.mipmap.pubg, "PUBG Mobile", "Hành động", 4.3, 527, "VNG Game Publishing"),
        Game(9, R.mipmap.shadow_knight, "Shadow Knight", "Hành động", 4.4, 420, "Fansipan Limited"),
        Game(10, R.mipmap.stick_man, "Stickman Legends: Chiến Binh Đánh Nhau Quái Vật", "Hành động", 4.0, 348, "Azura Global"),
        Game(11, R.mipmap.subway, "Subway Surfers", "Trò chơi điện tử", 4.2, 308, "SYBO Games"),
        Game(12, R.mipmap.vo_lam, "Võ Lâm Truyền Kỳ 1 Mobile", "Nhập vai", 4.4, 930, "VNG"),
        Game(13, R.mipmap.zombie, "Zombie Tsunami", "Trò chơi điện tử", 4.5, 214, "Mobigame S.A.R.L"),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.listview)
        val adapter = ListGameAdapter(this, games)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Clicked: "+games[position].name, Toast.LENGTH_SHORT).show();
        }
    }

}