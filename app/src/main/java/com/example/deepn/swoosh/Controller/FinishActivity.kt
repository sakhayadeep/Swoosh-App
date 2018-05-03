package com.example.deepn.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.deepn.swoosh.Model.Player
import com.example.deepn.swoosh.R
import com.example.deepn.swoosh.Utilities.*
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {
    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        player=intent.getParcelableExtra(EXTRA_PLAYER)
        searchLeaguesText.text="Looking for a ${player.league} ${player.skill} league near you..."
    }

}
