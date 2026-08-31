/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpr2tp01_exec2;
import lpr2tp01_exec1.Author;
import java.util.*;
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
public class Book {
    private final String name;
    private final Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this(name, authors, price, 0);
    }


    public Book(String name, Author[] authors, double price, int qty) {
        if (authors == null) {
            throw new IllegalArgumentException("O array de autores não pode ser nulo.");
        }

        this.name = name;
        this.authors = Arrays.copyOf(authors, authors.length);
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }


    public Author[] getAuthors() {
        return Arrays.copyOf(authors, authors.length);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames() {
        StringBuilder names = new StringBuilder();

        for (int i = 0; i < authors.length; i++) {
            if (i > 0) {
                names.append(",");
            }
            names.append(authors[i].getName());
        }

        return names.toString();
    }

    @Override
    public String toString() {
        StringBuilder authorsText = new StringBuilder();

        for (int i = 0; i < authors.length; i++) {
            if (i > 0) {
                authorsText.append(",");
            }
            authorsText.append(authors[i]);
        }

        return "Book[name=" + name
                + ",authors={" + authorsText
                + "},price=" + price
                + ",qty=" + qty + "]";
    }
}
