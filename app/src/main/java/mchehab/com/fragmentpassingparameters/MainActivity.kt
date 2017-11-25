package mchehab.com.fragmentpassingparameters

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            val personFragment = PersonFragment()
            val person = Person("First Name", "Last Name", 22)
            val bundle = Bundle()
            bundle.putString("person", Gson().toJson(person))
            personFragment.arguments = bundle
            fragmentManager.beginTransaction().add(R.id.frameLayout, personFragment).commit()
        }
    }
}
