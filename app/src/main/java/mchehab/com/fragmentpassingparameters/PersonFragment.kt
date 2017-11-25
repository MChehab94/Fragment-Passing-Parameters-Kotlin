package mchehab.com.fragmentpassingparameters

import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_person.*

class PersonFragment : Fragment() {

    var person: Person? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_person, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getArgument()

        editTextFirstName.setText(person?.firstName)
        editTextLastName.setText(person?.lastName)
        editTextAge.setText(" ${person?.age}")
    }

    private fun getArgument(){
        val bundle = arguments
        person = Gson().fromJson(bundle?.getString("person"), Person::class.java)
    }

}// Required empty public constructor
