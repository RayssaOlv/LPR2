/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpr2tp01_exec2;
import lpr2tp01_exec1.Author;
/**
 * Dupla: João Victor Lima Venceslau - Rayssa Silva de Oliveira
 * /*
 * Um livro pode ser escrito por um ou muitos autores, por esta razão a classe Book deve
ter um array de autores, conforme o modelo abaixo:
 * +--------------------------------------------------+
 * |                     Book                         |
 * +--------------------------------------------------+
 * | - name: String                                   |
 * | - authors: Author[]                              |
 * | - price: double                                  |
 * | - qty: int = 0                                   |
 * +--------------------------------------------------+
 * | + Book(name: String, authors: Author[],          |
 * |        price: double)                            |
 * | + Book(name: String, authors: Author[],          |
 * |        price: double, qty: int)                  |
 * | + getName(): String                              |
 * | + getAuthors(): Author[]                         |
 * | + getPrice(): double                             |
 * | + setPrice(price: double): void                  |
 * | + getQty(): int                                  |
 * | + setQty(qty: int): void                         |
 * | + toString(): String                             |
 * | + getAuthorNames(): String                       |
 * +--------------------------------------------------+
 *                       |
 *                       | m
 *                       |
 * +--------------------------------------------------+
 * |                     Author                       |
 * +--------------------------------------------------+
 * | - name: String                                   |
 * | - email: String                                  |
 * | - gender: char                                   |
 * +--------------------------------------------------+
 * - O construtor deve receber um array de autores
- Uma vez que o livro é instanciado o seu autor não pode ser adicionado ou removido.
- O método toString() deve retornar a seguinte resposta:
"Book[name=?,authors={Author[name=?,email=?,gender=?],......},price=?,qty=?]".
* 
* Você deve:
- Escrever um código para a classe Book, você deve reutilizar o código do Author
escrito no exercício 1
- Escrever uma classe de teste, chamada TestBook, para testar a classe Book.
 */
public class TestBook {
    public static void main(String[] args) {
        //Teste 1
        Author[] authors = new Author[2];
        authors[0] = new Author(
                "Autor 01",
                "autor01@somewhere.com.br",
                'm'
        );
        authors[1] = new Author(
                "Autor 02",
                "autor02@nowhere.com.br",
                'm'
        );

        System.out.println("===== TESTE DA CLASSE AUTHOR =====");
        System.out.println("Nome do primeiro autor: "
                + authors[0].getName());
        System.out.println("E-mail do primeiro autor: "
                + authors[0].getEmail());
        System.out.println("Gênero do primeiro autor: "
                + authors[0].getGender());
        System.out.println("Autor antes de alterar o e-mail:");
        System.out.println(authors[0]);

        authors[0].setEmail("autor01_novo@email.com");
        System.out.println("Autor depois de alterar o e-mail:");
        System.out.println(authors[0]);

        System.out.println();
        System.out.println("===== TESTE DA CLASSE BOOK =====");

        // Teste de preço e quantidade
        Book testeBook = new Book(
                "Java for Dummy",
                authors,
                19.99,
                99
        );

        System.out.println("Nome do livro: " + testeBook.getName());
        System.out.println("Preço inicial: " + testeBook.getPrice());
        System.out.println("Quantidade inicial: " + testeBook.getQty());
        System.out.println("Nomes dos autores: "
                + testeBook.getAuthorNames());
        System.out.println("Autores do livro:");
        for (Author author : testeBook.getAuthors()) {
            System.out.println(author);
        }
        System.out.println("Livro criado:");
        System.out.println(testeBook);

        // Teste dos setters de preço e quantidade.
        testeBook.setPrice(24.90);
        testeBook.setQty(50);

        System.out.println();
        System.out.println("Depois de usar setPrice() e setQty():");
        System.out.println("Novo preço: " + testeBook.getPrice());
        System.out.println("Nova quantidade: " + testeBook.getQty());
        System.out.println(testeBook);

        // Teste do construtor que inicia a quantidade com zero
        Book bookSemQuantidade = new Book(
                "Livro de Teste",
                authors,
                10.00
        );

        System.out.println();
        System.out.println("Livro criado com o construtor de três parâmetros:");
        System.out.println(bookSemQuantidade);
        System.out.println("A quantidade inicial deve ser 0.");
    } 
}
