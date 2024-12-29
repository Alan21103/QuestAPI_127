package com.example.praktikum12.ui.viewmodel

import com.example.praktikum12.model.Mahasiswa

sealed class DetailUiState {
    object Loading : DetailUiState()
    data class Success(val mahasiswa: Mahasiswa) : DetailUiState()
    object Error : DetailUiState()
}