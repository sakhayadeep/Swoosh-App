package com.example.deepn.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.deepn.swoosh.Model.Player
import com.example.deepn.swoosh.Utilities.*
import com.example.deepn.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    lateinit var player:Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player=intent.getParcelableExtra(EXTRA_PLAYER)

    }
    fun onBeginnerClicked(view: View){
        ballerSkillBtn.isChecked=false
        player.skill="beginner"
    }
    fun onBallerClicked(view: View){
        beginnerSkillBtn.isChecked=false
        player.skill="baller"
    }
    fun onFinishClicked(view: View){
        if(player.skill!="" && beginnerSkillBtn.isChecked||ballerSkillBtn.isChecked) {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_PLAYER,player)
            finishIntent.putExtra(EXTRA_PLAYER,player)
            startActivity(finishIntent)
        }else{
            Toast.makeText(this,"Please select your skill level.",Toast.LENGTH_SHORT).show()
        }
    }
}