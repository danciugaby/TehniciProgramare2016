/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsnumberreader;

/**
 *
 * @author gabriel.danciu
 */
public class NumberReadListenerImplementation  implements NumberReadListener {
 
    Double totalSoFar = 0D;
 
    @Override
    public void numberRead(NumberReadEvent numberReadEvent) {
        totalSoFar += numberReadEvent.getNumber();
    }
 
    @Override
    public void numberStreamTerminated(NumberReadEvent numberReadEvent) {
        System.out.println("Sum of the number stream: " + totalSoFar);
    }
}