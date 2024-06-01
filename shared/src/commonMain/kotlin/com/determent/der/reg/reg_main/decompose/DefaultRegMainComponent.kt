package com.determent.der.reg.reg_main.decompose

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value

class DefaultRegMainComponent(
    componentContext: ComponentContext,
) : RegMainComponent {

    private val _models: MutableValue<ModelRegMain> = MutableValue(
        ModelRegMain(emailPerson = "", phoneNumber = "")
    )

    override val models: Value<ModelRegMain> = _models

    override fun onChangedEmailPerson(emailPerson: String) {
        _models.value = models.value.copy(emailPerson = emailPerson)
    }

    override fun onChangedPhoneNumber(phoneNumber: String) {
        _models.value = models.value.copy(phoneNumber = phoneNumber)
    }

    override fun onClickReg() {

    }

}