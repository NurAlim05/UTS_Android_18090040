package alim.nuralim.catatanpenjualan.activity.data_barang.presenter

import alim.nuralim.catatanpenjualan.model.Barang

interface DataBarangView {
    fun onSuccessDataBarang(data: List<Barang?>?)
    fun onErrorDataBarang(msg: String?)

    fun onSuccessDeleteBarang(msg : String?)
    fun onErrorDeleteBarang(msg : String?)
}