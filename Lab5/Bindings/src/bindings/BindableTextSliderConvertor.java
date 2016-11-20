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
public class BindableTextSliderConvertor extends org.jdesktop.beansbinding.Converter {

    @Override
    public Object convertForward(Object value) {
        return ((Integer)(value)).toString();
    }

    @Override
    public Object convertReverse(Object value) {
        return Integer.parseInt((String)value);
       
    }
    
}
