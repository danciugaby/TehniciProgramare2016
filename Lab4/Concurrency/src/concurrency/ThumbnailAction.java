/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrency;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import static javax.swing.Action.LARGE_ICON_KEY;
import static javax.swing.Action.SHORT_DESCRIPTION;
import javax.swing.Icon;
import javax.swing.JLabel;
import static javax.xml.bind.JAXBIntrospector.getValue;

/**
 *
 * @author gabriel.danciu
 */
public class ThumbnailAction extends AbstractAction{
    private Icon displayPhoto;
        JLabel jLabelImage;
        /**
         * @param Icon - The full size photo to show in the button.
         * @param Icon - The thumbnail to show in the button.
         * @param String - The descriptioon of the icon.
         */
        public ThumbnailAction(Icon photo, Icon thumb, String desc, JLabel l){
            displayPhoto = photo;
             
            // The short description becomes the tooltip of a button.
            putValue(SHORT_DESCRIPTION, desc);
             
            // The LARGE_ICON_KEY is the key for setting the
            // icon when an Action is applied to a button.
            putValue(LARGE_ICON_KEY, thumb);
            
            jLabelImage = l;
        }
         
        /**
         * Shows the full image in the main area and sets the application title.
         */
        public void actionPerformed(ActionEvent e) {
           jLabelImage.setIcon(displayPhoto);
            
        }
}
