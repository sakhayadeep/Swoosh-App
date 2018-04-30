package com.example.deepn.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.deepn.swoosh.Utilities.EXTRA_LEAGUE
import com.example.deepn.swoosh.R
import com.example.deepn.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    var selectedSkill=""
    var league=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league=intent.getStringExtra(EXTRA_LEAGUE)

    }
    fun onBeginnerClicked(view: View){
        ballerSkillBtn.isChecked=false
        selectedSkill="beginner"
    }
    fun onBallerClicked(view: View){
        beginnerSkillBtn.isChecked=false
        selectedSkill="baller"
    }
    fun onFinishClicked(view: View){
        if(selectedSkill!="" && beginnerSkillBtn.isChecked||ballerSkillBtn.isChecked) {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_SKILL,selectedSkill)
            finishIntent.putExtra(EXTRA_LEAGUE,league)
            startActivity(finishIntent)
        }else{
            Toast.makeText(this,"Please select your skill level.",Toast.LENGTH_SHORT).show()
        }
    }
}