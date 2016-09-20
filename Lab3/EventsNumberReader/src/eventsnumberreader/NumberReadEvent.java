/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsnumberreader;


import java.util.EventObject;
 
public class NumberReadEvent extends EventObject {
 
    private Double number;
 
    public NumberReadEvent(Object source, Double number) {
        super(source);
        this.number = number;
    }
 
    public Double getNumber() {
        return number;
    }
}