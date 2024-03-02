package com.rayan.app5

import android.provider.ContactsContract.CommonDataKinds.Email

fun main() {

    var p1 = Pessoa.createPessoa();
    println(p1)

    p1.helloPerson();

    Pessoa.Manager.decreaseCount();

    var string = "Jose";
    println(string.concat());
}

// Isso e uma extensão
fun Pessoa.helloPerson() {
    println("Ola ${this.getNome()}")
}

// Isso e uma extensão em um companion
fun Pessoa.Manager.decreaseCount() {
    count--;
}

fun String.concat(): String {
    return "Ola $this";
}

class Pessoa private constructor(){

    private var nome: String = "";
    private var email: String = "";

//    constructor(nome: String, email: String) {
//        this.nome = nome
//        this.email = email
//    }

    companion object Manager{

        var count: Int = 0;

        fun createPessoa() : Pessoa {
            var pessoa = Pessoa();
            return pessoa;
        }

        fun withName(nome:String) {
            createPessoa().nome = nome;
        }

        fun withEmail(email:String) {
            createPessoa().email = email;
        }
    }

    fun getNome() : String {
        return nome;
    }

    override fun toString(): String {
        return "Pessoa(nome='$nome', email='$email')"
    }


}