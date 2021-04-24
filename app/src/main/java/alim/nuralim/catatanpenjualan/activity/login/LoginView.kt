package alim.nuralim.catatanpenjualan.activity.login

import alim.nuralim.catatanpenjualan.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}