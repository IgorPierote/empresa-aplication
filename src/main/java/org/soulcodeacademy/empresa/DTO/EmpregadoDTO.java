package org.soulcodeacademy.empresa.DTO;

import javax.validation.constraints.*;

// DTO - Objeto de Transferência de Dados
// É útil para validarmos as informações transferidas pelo cliente
public class EmpregadoDTO {

    // Impede que o valor de nome seja "", por exemplo.
    // Message é o texto da validação
    @NotBlank(message = "Campo nome é obrigatório")
    private String nome;

    @NotBlank(message = "Campo email é obrigatório")
    private String email;

    // Impede que o valor seja null
    @NotNull(message = "Campo salário é obrigatório")
    private Double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
