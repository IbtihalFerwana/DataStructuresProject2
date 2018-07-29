/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs210project2;

/**
 *
 * @author Ibtihal
 */
public class Job <K,V>{
        private int pid;
    private int priority; 
    private int length;
    private int startTime;
    
    public Job(int id, int p, int l)
    {
     pid=id;
     priority=p;
     length=l;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }
    
    public void execute()
    {
        for(int i =0; i<=length; i++)
        {}
    }
}
