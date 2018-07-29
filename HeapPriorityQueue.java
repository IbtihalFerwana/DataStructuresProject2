/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs210project2;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Ibtihal
 */
public class HeapPriorityQueue extends PriorityQueue {
    protected ArrayList<Job> heap = new ArrayList<>();
    public HeapPriorityQueue(){super();}
    public HeapPriorityQueue(Comparator comp){super(comp);}
    protected int parent(int j){return (j-1)/2;}
    protected int left(int j){return 2*j+1;}
    protected int right (int j){return 2*j+2;}
    protected boolean hasLeft(int j){return left(j)<heap.size();}
    protected boolean hasRight(int j){return right(j)<heap.size();}
    protected void swap(int i, int j)
    {
        Job temp=heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
    protected void upheap(int i)
    {
        while(i>0)
        {
            int p=parent(i);
            if(compare(heap.get(i),heap.get(p))>=0)
                break;
//            if(compare(heap.get(i),heap.get(p))==0)
//                break;
            swap(i,p);
            i=p;
        }
            
    }
    protected void downheap(int i)
    {
        
        while(hasLeft(i))
        {
            int leftIndex=left(i);
            int BigChildIndex=leftIndex;
            if(hasRight(i))
            {   
                int rightIndex=right(i);
                if(compare(heap.get(leftIndex),heap.get(rightIndex))>=0)
                    BigChildIndex=rightIndex;
            }
            if(compare(heap.get(BigChildIndex), heap.get(i))>=0)
                break;
            
            swap(i, BigChildIndex);
            i=BigChildIndex;
            
        }
       
    }
    
        public int size()
        {
            return heap.size();
        }
        public Job min()
        {
            if(heap.isEmpty())
                return null;
            return heap.get(0);
        }
        public Job insert(Job value) throws IllegalArgumentException 
        {
           //checkKey(key)
           //new Job(value.getPriority(), value.getPid(), 
            heap.add(value);
            upheap(heap.size()-1);
            return value;
        }
        public Job removeMin()
        { 
            if(heap.isEmpty())
                return null;
           
            Job answer=heap.get(0);
            swap(0, heap.size()-1);
            heap.remove(answer);
            downheap(0);
            return answer;
            
        
        }
        public void toString1()
        { 
            int i=0;
            System.out.println("With heap");
            while(i<heap.size())
            {
                System.out.println(heap.get(i).getPriority());i++; 
            }
            System.out.println("RemoveMin");
          while(heap.size()>0){
            Job min=removeMin();  
            System.out.println(min.getPriority()+" id "+min.getPid());
             
        }
            
        }
          
//              for(Job j: heap)
//                System.out.println(j.getPid()+"");
}
