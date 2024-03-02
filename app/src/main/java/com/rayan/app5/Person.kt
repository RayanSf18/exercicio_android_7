package com.rayan.app5

fun main() {
    var p1 = Person("Rayan", "014.252.163.90", "rayansf18@gmail.com");
    var p2 = Person("Nayara", "750.120.491.87", "nayarasf18@gmail.com");

    println(p1);
    println(p2);

    println(p1.equals(p2));

    var (nome, cpf, email) = p1;
    println(nome);
    println(cpf);
    println(email)
}

data class Person(var nome:String, val cpf:String, val email:String)
