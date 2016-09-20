/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsnumberreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.System.console;
import java.util.HashSet;
import java.util.Set;

public class NumberReader {

    private Set<NumberReadListener> listeners;

    public NumberReader() {
        listeners = new HashSet<NumberReadListener>();
    }

    public void addNumberReadListener(NumberReadListener listener) {
        this.listeners.add(listener);
    }

    public void removeNumberReadListener(NumberReadListener listener) {
        this.listeners.remove(listener);
    }

    public void start() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Double d = null;
        do {
            try {
                System.out.println("Enter a number: ");
                String readLine = br.readLine();
                d = getDoubleValue(readLine);
                if (d != null) {
                    notifyListeners(d);
                }
            } catch (Exception e) {
            }
        } while (d != null);
        notifyListenersOfEndOfStream();
    }

    private void notifyListenersOfEndOfStream() {
        for (NumberReadListener numberReadListener : listeners) {
            numberReadListener.numberStreamTerminated(new NumberReadEvent(this, 0D));
        }
    }

    private void notifyListeners(Double d) {
        for (NumberReadListener numberReadListener : listeners) {
            numberReadListener.numberRead(new NumberReadEvent(this, d));
        }
    }

    private Double getDoubleValue(String readLine) {
        Double result;
        try {
            result = Double.valueOf(readLine);
        } catch (Exception e) {
            result = null;
        }
        return result;
    }
}
