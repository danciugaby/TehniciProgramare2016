/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bindings;

import java.io.Serializable;
import javax.swing.JComponent;
import org.jdesktop.beansbinding.Converter;
import org.jdesktop.beansbinding.Validator;

/**
 *
 * @author gabriel.danciu
 */
public class BindableRadioButtonConv extends org.jdesktop.beansbinding.Converter {

    @Override
    public Object convertForward(Object value) {
        try {
            if ((int) value > 50) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public Object convertReverse(Object value) {
        try {
            if (value != null) {
                return ((Boolean) value) ? 1 : 0;
            } else {
                return null;
            }
        } catch (Exception ex) {
            return 0;
        }

    }

}
