package com.determent.der.reg.reg_main.decompose

import com.arkivanov.decompose.value.Value

interface RegMainComponent {

    val models: Value<ModelRegMain>

    fun onChangedEmailPerson(emailPerson: String)

    fun onChangedPhoneNumber(phoneNumber: String)

    fun onClickReg()

}