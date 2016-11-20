/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bindings;

/**
 *
 * @author gabi
 */
public class BindableRadioButtonValidator extends org.jdesktop.beansbinding.Validator {

    @Override
    public Result validate(Object value) {
        if ((int) value > 0 && (int)value <= 100) {
            return new Result(0, "All good");
        } else if ((int)value >100) { 
            return null;
        }
        else 
            return new Result(-1, "Value negative");
    }

}
