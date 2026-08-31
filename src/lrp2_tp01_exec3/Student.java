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

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program,
                   int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString()
                + ",program=" + program
                + ",year=" + year
                + ",fee=" + fee + "]";
    }
}
