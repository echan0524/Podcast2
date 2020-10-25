package com.mofucius.podcast.auth

import com.mofucius.easypodcast.auth.AccountService
import javax.inject.Inject
import javax.inject.Singleton


class AccountRepo @Inject constructor(private val accountService: AccountService) {


    suspend fun Login(email: String,
              password: String,
              deviceName: String,
              deviceId: String, host: String): AccountData {

       val response = accountService.login(email = email,
            password = password,
            deviceId = deviceId,
            deviceName = deviceName,
            host = host)

        return AccountData(response.sessionId, response.profileId.toString())

    }
}