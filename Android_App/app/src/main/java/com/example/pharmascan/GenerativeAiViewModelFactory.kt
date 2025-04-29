package com.example.pharmascan

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.generationConfig
import com.example.pharmascan.ImageInterpretationViewModel

val GenerativeViewModelFactory = object : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(
        viewModelClass: Class<T>,
        extras: CreationExtras
    ): T {
        val config = generationConfig {
            temperature = 0.7f // Try changing the temperature to control the randomness in the results.
        }

        return with(viewModelClass) {
            when {
                isAssignableFrom(ImageInterpretationViewModel::class.java) -> {
                    // Initialize a GenerativeModel with the `gemini-2.0-flash` AI model
                    // for multimodal text generation
                    val generativeModel = GenerativeModel(
                        modelName = "gemini-2.0-flash",
                        apiKey = "PASTE YOUR API KEY HERE", // Replace with your actual Gemini 2.0 Flash API key
                        generationConfig = config
                    )
                    ImageInterpretationViewModel(generativeModel)
                }

                else ->
                    throw IllegalArgumentException("Unknown ViewModel class: ${viewModelClass.name}")
            }
        } as T
    }
}