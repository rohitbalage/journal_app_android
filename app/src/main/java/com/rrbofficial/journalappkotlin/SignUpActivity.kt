package com.rrbofficial.journalappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.auth
import com.rrbofficial.journalappkotlin.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    // Binding
    lateinit var  binding : ActivitySignUpBinding


    // Firebase Auth
    private lateinit var auth: FirebaseAuth

            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

                // Binding

                binding = DataBindingUtil.setContentView(this,R.layout.activity_sign_up)


                // Initialize firebase auth
                auth = Firebase.auth


                // Sign up with SignUp button
                binding.accSignUpButton.setOnClickListener()
                {
                    createUser()
                }
    }

    private fun createUser() {

        val email = binding.emailCreate.text.toString()
        val password = binding.passwordCreate.text.toString()

        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d("TAGY", "createUserWithEmail:success")
                    val user = auth.currentUser
                    updateUI(user)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w("TAGY", "createUserWithEmail:failure", task.exception)
                    Toast.makeText(
                        baseContext,
                        "Authentication failed.",
                        Toast.LENGTH_SHORT,
                    ).show()
                    updateUI(null)
                }
            }
    }

    private fun updateUI(user: FirebaseUser?) {

    }


    // Checks whether the user signed in or not.
    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        if (currentUser != null) {
           reload()
        }
    }

    private fun reload() {
        TODO("Not yet implemented")
    }
}