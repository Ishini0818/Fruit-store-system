/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.Comparator;

/**
 *
 * @author Ishini
 */
public class SortbyPref implements Comparator<item>{

    @Override
    public int compare(item t, item t1) {
        return  t1.getPreference()-t.getPreference();
        
    }
    
    
}
