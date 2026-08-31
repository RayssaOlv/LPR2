/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lrp2_tp01_exec3;

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

public class Person {
    private final String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
