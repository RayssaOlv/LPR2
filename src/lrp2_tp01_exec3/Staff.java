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
public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString()
                + ",school=" + school
                + ",pay=" + pay + "]";
    }
}
