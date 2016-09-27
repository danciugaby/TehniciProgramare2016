/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrency;

import java.util.List;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

/**
 *
 * @author gabriel.danciu
 */
public class MyFirstWorker extends SwingWorker<Integer, String> {

    JProgressBar jprogress;

    public MyFirstWorker(JProgressBar p) {
        jprogress = p;
    }

    @Override
    protected Integer doInBackground() throws Exception {
        System.out.println("Start");
        jprogress.setValue(1);
        Thread.sleep(1000);
        System.out.println("Middle");
        jprogress.setValue(50);
        Thread.sleep(1000);
        jprogress.setValue(100);
        return 1;
    }

    @Override
    protected void process(final List<String> chunks) {
      
    }

    protected void done() {
        try {
            System.out.println("Complete");
            jprogress.setValue(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
