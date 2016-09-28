/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bindings;

import org.jdesktop.beansbinding.Converter; 
import org.jdesktop.beansbinding.Validator; 
 
/**
 * DOCUMENT ME! 
 * 
 * @author   thorsten 
 * @version  $Revision$, $Date$ 
 */ 
public interface Bindable { 
 
    //~ Methods ---------------------------------------------------------------- 
 
    /**
     * DOCUMENT ME! 
     * 
     * @return  DOCUMENT ME! 
     */ 
    String getBindingProperty(); 
    /**
     * DOCUMENT ME! 
     * 
     * @return  DOCUMENT ME! 
     */ 
    Validator getValidator(); 
    /**
     * DOCUMENT ME! 
     * 
     * @return  DOCUMENT ME! 
     */ 
    Converter getConverter(); 
    /**
     * DOCUMENT ME! 
     * 
     * @return  DOCUMENT ME! 
     */ 
    Object getNullSourceValue(); 
    /**
     * DOCUMENT ME! 
     * 
     * @return  DOCUMENT ME! 
     */ 
    Object getErrorSourceValue(); 
}
