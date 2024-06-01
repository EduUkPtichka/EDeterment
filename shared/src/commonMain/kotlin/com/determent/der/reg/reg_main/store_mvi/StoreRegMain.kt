package com.determent.der.reg.reg_main.store_mvi

import com.arkivanov.mvikotlin.core.store.Store
import com.determent.der.reg.reg_main.store_mvi.RegMainStore.Intent
import com.determent.der.reg.reg_main.store_mvi.RegMainStore.State

interface RegMainStore : Store<Intent, State, Nothing> {

    data class State(
        val emailPerson: String,
        val phoneNumber: String,
    )

    sealed interface Intent {
        data class ChangeEmailPerson(val emailPerson: String) : Intent
        data class ChangePhoneNumber(val phoneNumber: String) : Intent
        data object OnClickReg : Intent
    }

}