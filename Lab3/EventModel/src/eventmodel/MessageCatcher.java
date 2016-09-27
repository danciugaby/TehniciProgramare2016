/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventmodel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTree;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.tree.TreePath;

/**
 *
 * @author gabriel.danciu
 */
public class MessageCatcher implements TreeExpansionListener {

    @Override
    public void treeExpanded(TreeExpansionEvent event) {
        System.out.println("Event treated in message catcher. details");
        TreePath tpath = event.getPath();
        System.out.println(tpath);
    }

    @Override
    public void treeCollapsed(TreeExpansionEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    JTree mytree;

    public void setMytree(JTree mytree) {
        this.mytree = mytree;
        mytree.addTreeExpansionListener(this);
    }
}

