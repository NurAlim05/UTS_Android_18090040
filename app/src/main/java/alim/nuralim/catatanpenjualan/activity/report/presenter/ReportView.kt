package alim.nuralim.catatanpenjualan.activity.report.presenter

import alim.nuralim.catatanpenjualan.model.Keranjang

interface ReportView {
    fun onSuccessReport(keranjang: List<Keranjang?>?)
    fun onFailedReport(localizedMessage: String?)

    fun onSuccessRestore(msg: String?)
    fun onFailedRestore(msg: String?)
}