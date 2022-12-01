package org.soulcodeacademy.empresa.services;

public class RecursoNaoEncontrado extends RuntimeException {
    public RecursoNaoEncontrado(String message) {
        super(message); // Passamos a mensagem para a Runtime
    }
}
