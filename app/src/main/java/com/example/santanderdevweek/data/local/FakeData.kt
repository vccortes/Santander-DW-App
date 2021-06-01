package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData() : Conta{
        val cliente = Cliente("Vanessa")
        val cartao = Cartao("14081959")
        return Conta(
            "444444-4",
            "2021-1",
            "R$ 2.450,00",
            "R$ 4.120,00",
            cliente,
            cartao
        );
    }
}