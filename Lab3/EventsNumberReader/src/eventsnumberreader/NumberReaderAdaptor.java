/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsnumberreader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
 
public class NumberReaderAdaptor implements NumberReadListener {
    private Set<NumberReadListener> listeners;
    private BufferedWriter output;
 
    public NumberReaderAdaptor() {
        listeners = new HashSet<NumberReadListener>();
        try {
            output = new BufferedWriter(new FileWriter("numberLog.log"));
        } catch (IOException e) {
           System.out.println(e);
            e.printStackTrace();
        }
    }
 
    public void addNumberReadListener(NumberReadListener listener) {
        this.listeners.add(listener);
    }
 
    public void removeNumberReadListener(NumberReadListener listener) {
        this.listeners.remove(listener);
    }
 
 
    @Override
    public void numberRead(NumberReadEvent numberReadEvent) {
        try {
            output.write(numberReadEvent.getNumber() + "\n");
        } catch (Exception e) {
 
        }
        for (NumberReadListener numberReadListener: listeners) {
            numberReadListener.numberRead(numberReadEvent);
        }
    }
 
    @Override
    public void numberStreamTerminated(NumberReadEvent numberReadEvent) {
        try {
            output.flush();
            output.close();
        } catch (Exception e) {
 
        }
        for (NumberReadListener numberReadListener: listeners) {
            numberReadListener.numberStreamTerminated(numberReadEvent);
        }
    }
 
}