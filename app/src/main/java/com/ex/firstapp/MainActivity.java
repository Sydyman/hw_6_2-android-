package com.ex.firstapp;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void S () {
        ArrayList<Integer> points = new ArrayList<>();
        points.add(1);


        Player player1 = new Player(10, "Player", points);
        Player player2 = new Player(3, "PlayerTwo",points );
        Player player3 = new Player(2, "PlayerThree", points);
        Player player4 = new Player(4, "PlayerFour", points);
        Player player5 = new Player(5, "PlayerFive", points);
        Player player6 = new Player(7, "PlayerSix", points);
        Player player7 = new Player(6, "PlayerSeven", points);
        Player player8 = new Player(8, "PlayerEught", points);
        Player player9 = new Player(9, "PlayerNine",points);
        Player player10 = new Player(1, "PlayerTen", points);

        ArrayList<Player> players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        players.add(player6);
        players.add(player7);
        players.add(player8);
        players.add(player9);
        players.add(player10);

        Collections.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return Integer.compare(o1.getNumber(), o2.getNumber());
            }
        });
        Collections.reverse(players);

        players.forEach(player -> {
            Log.d("Player", player.toString());
        });

    }

}
