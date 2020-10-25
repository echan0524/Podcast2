package com.mofucius.podcast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.mofucius.podcast.auth.AccountRepo
import com.mofucius.podcast.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var accountRepo: AccountRepo

    //private lateinit var binding: ActivityMa

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        binding.button.setOnClickListener {



            lifecycleScope.launch(IO) {
                val accountData = accountRepo.Login("chunghop@gmail.com",
                    "ericchan",
                    "testDevice",
                    "testDevice",
                    "android.mobile.us")

                withContext(Main) {
                    binding.result.setText(accountData.profileId+ " "+accountData.sessionId)
                }

            }
        }
    }
}