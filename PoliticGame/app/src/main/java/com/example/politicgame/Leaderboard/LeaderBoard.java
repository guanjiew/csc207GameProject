package com.example.politicgame.Leaderboard;

import org.json.JSONObject;

import java.util.List;

interface LeaderBoard {

    /**
     * Returns the the Leaderboard's scores through a list of JSONObjects
     *
     * @return  The list of JSONObjects containing the top 3 characters, users and their scores
     */
    public List<JSONObject> getBoard();


}
