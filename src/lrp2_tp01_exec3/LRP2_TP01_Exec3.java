/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lrp2_tp01_exec3;
import java.util.*;
/**
* 
 * Dupla: João Victor Lima Venceslau - Rayssa Silva de Oliveira

Implemente o sistema representado pelo diagrama abaixo.
Obrigatório implementar uma classe de testes para todos os métodos das classes Staff e
Student.
* 
*
 *                         +----------------------------------+
 *                         |             Person               |
 *                         +----------------------------------+
 *                         | - name: String                   |
 *                         | - address: String                |
 *                         +----------------------------------+
 *                         | + Person(name: String,           |
 *                         |            address: String)      |
 *                         | + getName(): String              |
 *                         | + getAddress(): String           |
 *                         | + setAddress(address: String):   |
 *                         |   void                           |
 *                         | + toString(): String             |
 *                         +----------------------------------+
 *                                  △
 *                                  |
 *                              extends
 *                           +------+------+
 *                           |             |
 *             +-------------+             +-------------+
 *             |                                           |
 * +-----------------------------+       +-----------------------------+
 * |          Student            |       |           Staff             |
 * +-----------------------------+       +-----------------------------+
 * | - program: String            |       | - school: String            |
 * | - year: int                  |       | - pay: double                |
 * | - fee: double                |       +-----------------------------+
 * +-----------------------------+       | + Staff(name: String,        |
 * | + Student(name: String,      |       |          address: String,    |
 * |           address: String,   |       |          school: String,     |
 * |           program: String,   |       |          pay: double)        |
 * |           year: int,        |       | + getSchool(): String        |
 * |           fee: double)      |       | + setSchool(school: String): |
 * | + getProgram(): String       |       |   void                       |
 * | + setProgram(program:       |       | + getPay(): double           |
 * |   String): void              |       | + setPay(pay: double): void  |
 * | + getYear(): int             |       | + toString(): String         |
 * | + setYear(year: int): void   |       +-----------------------------+
 * | + getFee(): double           |
 * | + setFee(fee: double): void  |
 * | + toString(): String         |
 * +-----------------------------+
 *
 * 
 */
public class LRP2_TP01_Exec3 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===== TESTE DA CLASSE PERSON =====");

        Person person = new Person("Pessoa 01", "Rua A, 100");

        System.out.println("Nome: " + person.getName());
        System.out.println("Endereço inicial: " + person.getAddress());
        System.out.println("Objeto Person:");
        System.out.println(person);

        person.setAddress("Rua B, 200");
        System.out.println("Endereço após setAddress(): "
                + person.getAddress());
        System.out.println(person);

        System.out.println();
        System.out.println("===== TESTE DA CLASSE STUDENT =====");

        Student student = new Student(
                "Aluno 01",
                "Avenida Central, 500",
                "Análise e Desenvolvimento de Sistemas",
                1,
                850.00
        );

        System.out.println("Nome herdado de Person: " + student.getName());
        System.out.println("Endereço herdado de Person: "
                + student.getAddress());
        System.out.println("Programa inicial: " + student.getProgram());
        System.out.println("Ano inicial: " + student.getYear());
        System.out.println("Mensalidade inicial: " + student.getFee());
        System.out.println("Objeto Student:");
        System.out.println(student);

        student.setAddress("Rua Nova, 300");
        student.setProgram("Sistemas de Informação");
        student.setYear(2);
        student.setFee(950.00);

        System.out.println();
        System.out.println("Student após utilizar os setters:");
        System.out.println("Novo endereço: " + student.getAddress());
        System.out.println("Novo programa: " + student.getProgram());
        System.out.println("Novo ano: " + student.getYear());
        System.out.println("Nova mensalidade: " + student.getFee());
        System.out.println(student);

        System.out.println();
        System.out.println("===== TESTE DA CLASSE STAFF =====");

        Staff staff = new Staff(
                "Funcionário 01",
                "Rua dos Professores, 10",
                "IFSP - Campus Cubatão",
                4500.00
        );

        System.out.println("Nome herdado de Person: " + staff.getName());
        System.out.println("Endereço herdado de Person: "
                + staff.getAddress());
        System.out.println("Escola inicial: " + staff.getSchool());
        System.out.println("Salário inicial: " + staff.getPay());
        System.out.println("Objeto Staff:");
        System.out.println(staff);

        staff.setAddress("Avenida da Escola, 20");
        staff.setSchool("IFSP - Campus São Paulo");
        staff.setPay(5200.00);

        System.out.println();
        System.out.println("Staff após utilizar os setters:");
        System.out.println("Novo endereço: " + staff.getAddress());
        System.out.println("Nova escola: " + staff.getSchool());
        System.out.println("Novo salário: " + staff.getPay());
        System.out.println(staff);
    }  
}
