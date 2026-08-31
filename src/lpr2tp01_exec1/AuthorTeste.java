package lpr2tp01_exec1;

import java.util.*;

/**
 *
 * Dupla: João Victor Lima Venceslau - Rayssa Silva de Oliveira
 *
 * Uma classe chamada Author é desenhada para servir de modelo para autores de
 * livros, veja abaixo:
 *
 * +---------------------------------------------+ | Author |
 * +---------------------------------------------+ | - name: String | | - email:
 * String | | - gender: char | +---------------------------------------------+ |
 * + Author(name: String, | | email: String, gender: char) | | + getName():
 * String | | + getEmail(): String | | + setEmail(email: String): void | | +
 * getGender(): char | | + toString(): String |
 * +---------------------------------------------+
 *
 * - 3 atributos privados name (String), email (String), and gender (char
 * contendo 'm' or 'f'); - Um construtor para inicializar os atributos com base
 * nos 3 parâmetros. - Não existe um construtor default para Author [Author()].
 * - Criar métodos públicos: getName(), getEmail(), setEmail(), and getGender().
 * - Não existe setter para name e gender, estes atributos não podem ser
 * alterados. - Um método chamado toString() que retorna
 * "Author[name=?,email=?,gender=?]", exemplo "Author[name=Wellington
 * Tuler,email=tulermoraes@yahoo.com,gender=m]". - Escreva a classe Author e
 * desenvolva uma de teste, com os seguintes itens:
 *
 * - Testar construtor. - Verificar o método toString(). - Testar o Setter -
 * Testar os Getters
 */
public class AuthorTeste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Teste do construtor ---");
        Author autor = new Author("Autor 01",
                "autor01@hotmail.com.br",
                'm');
        System.out.println(autor.toString());
        System.out.println();

        System.out.println("Teste da validação de gênero:");

        try {
            Author autor02 = new Author(
                    "Autor 02",
                    "autor02@gmail.com",
                    'x'
            );
        } catch (IllegalArgumentException e) {
            System.out.println("Gênero inválido detectado: " + e.getMessage());
        }


        System.out.println();

        System.out.println("Teste do Setter:");
        System.out.println();
        autor.setEmail("autor01@yahoo.com");
        System.out.println("Novo email: " + autor.getEmail());

        System.out.println();

        System.out.println("Teste dos Getters:");
        System.out.println();
        System.out.println("Nome: " + autor.getName());
        System.out.println("Email: " + autor.getEmail());
        System.out.println("Gênero: " + autor.getGender());

    }
}
