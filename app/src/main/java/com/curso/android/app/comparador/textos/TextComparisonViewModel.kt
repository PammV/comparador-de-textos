package com.curso.android.app.comparador.textos
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextComparisonViewModel : ViewModel() {
    val comparisonResult = MutableLiveData<String>()

    fun compareTexts(text1: String, text2: String) {
        if (text1 == text2) {
            comparisonResult.value = "@+id/text_result_true"
        } else {
            comparisonResult.value = "@+id/text_result_false"
        }
    }
}