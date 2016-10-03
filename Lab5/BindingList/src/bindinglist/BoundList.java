/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bindinglist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel.danciu
 */
public class BoundList{

   public List<String> elements;

    public List<String> getElements() {
        return elements;
    }

    public void setElements(List<String> elements) {
        this.elements = elements;
    }

   public BoundList() {
        elements = new ArrayList<String>();
        elements.add("aaaaaa");
        elements.add("bbbbb");
        elements.add("cccc");
        elements.add("dddddddd");

    }
}
