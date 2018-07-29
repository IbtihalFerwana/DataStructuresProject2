/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs210project2;
import java.lang.Object;
import java.util.AbstractCollection;
import java.util.AbstractQueue;
import java.util.Comparator;
import java.util.Iterator;
/**
 *
 * @author Ibtihal
 */
public class PriorityQueue extends AbstractQueue implements Comparator <Job>{

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean offer(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object poll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public PriorityQueue(Comparator <Job> comp)
    {
        
    }
    public PriorityQueue(){}
    @Override
    public int compare(Job t, Job t1) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        if (t.getPriority()<t1.getPriority())
            return 1;
        else if(t.getPriority()>t1.getPriority())
            return -1;
        else
            return 0;
      }
//    public PriorityQueue(K key, V value)
//    {
//        add(key);
//    }
   
    
}
