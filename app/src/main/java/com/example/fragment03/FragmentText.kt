package com.example.fragment03

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


private const val NAME = "name"
private const val MESSAGE = "message"
private const val PHONE = "phone"

class FragmentText :Fragment(R.layout.fragment_text){
    //this new instance!

    companion object{
        @JvmStatic
        fun newInstance( name:String, message:String, phone:String )=
            FragmentText().apply {
                arguments = Bundle().apply {
                    putString(NAME,name)
                    putString(MESSAGE,message)
                    putString(PHONE,phone)
                }
            }
    }

    private val nameTextView:TextView by lazy { requireView().findViewById(R.id.name_fragment) }
    private val messageTextView:TextView by lazy { requireView().findViewById(R.id.text_fragment) }
    private val phoneTextView:TextView by lazy { requireView().findViewById(R.id.phone_fragment) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireArguments().let {

            val name =it.getString(NAME)
            val message =it.getString(MESSAGE)
            val phone =it.getString(PHONE)

            name?.let {
                nameTextView.text = it
            }
            message?.let {
                messageTextView.text = it
            }
            phone?.let {
                phoneTextView.text = it
            }
        }
    }


}

