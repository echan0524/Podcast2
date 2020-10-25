package com.mofucius.easypodcast.auth
import com.google.gson.annotations.SerializedName


data class LoginResponse(
    @SerializedName("accountType")
    val accountType: String,
    @SerializedName("countryCode")
    val countryCode: String,
    @SerializedName("currentTime")
    val currentTime: Any,
    @SerializedName("deauthorizedDeviceName")
    val deauthorizedDeviceName: Any,
    @SerializedName("duration")
    val duration: Int,
    @SerializedName("errors")
    val errors: Any,
    @SerializedName("firstError")
    val firstError: Any,
    @SerializedName("oauths")
    val oauths: List<Oauth>,
    @SerializedName("profileId")
    val profileId: Long,
    @SerializedName("sessionId")
    val sessionId: String,
    @SerializedName("userSubscription")
    val userSubscription: UserSubscription
)

data class Oauth(
    @SerializedName("oauthUuid")
    val oauthUuid: String,
    @SerializedName("type")
    val type: String
)

data class UserSubscription(
    @SerializedName("accountType")
    val accountType: String,
    @SerializedName("activeStreamer")
    val activeStreamer: Boolean,
    @SerializedName("duration")
    val duration: Any,
    @SerializedName("endDate")
    val endDate: Long,
    @SerializedName("errors")
    val errors: Any,
    @SerializedName("failedPayment")
    val failedPayment: Boolean,
    @SerializedName("firstError")
    val firstError: Any,
    @SerializedName("hoursTillEndDate")
    val hoursTillEndDate: Int,
    @SerializedName("lastBillingMessage")
    val lastBillingMessage: Any,
    @SerializedName("nextBillDate")
    val nextBillDate: Any,
    @SerializedName("paymentType")
    val paymentType: Any,
    @SerializedName("recurringPaymentId")
    val recurringPaymentId: Any,
    @SerializedName("subscriptionId")
    val subscriptionId: Int,
    @SerializedName("subscriptions")
    val subscriptions: Any,
    @SerializedName("validForPremiumStreaming")
    val validForPremiumStreaming: Boolean,
    @SerializedName("validForRadioStreaming")
    val validForRadioStreaming: Boolean
)