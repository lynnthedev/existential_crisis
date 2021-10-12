package com.existential_crisis;

import java.util.*;

public class dreadCollection {
	private ArrayList<dread> t = new ArrayList<>();
    private int capacity;
    
    public dreadCollection() {
    	/*thoughts.add(new thoughts("0001","I think if we were to truly create a utopian society, the first thing we would do to tear it down, just to have a purpose."));
    	thoughts.add(new thoughts("0002","It is closer to the year 2030 than the year 2005."));
    	thoughts.add(new thoughts("0003","At some point in your life, you will be the next person on Earth to die."));
    	thoughts.add(new thoughts("0004","Of all the consciences that could have been born in my body, I'm the one looking through these eyes."));*/

        this.capacity = 5;
    }
    
    public dreadCollection(int capacity) {
        this.capacity = capacity;
    }

    public List<dread> getThought() {
        return t;
    }

    public void addThought(dread thought) {
    	if(t.size() != capacity) {
    		t.add(thought);
    	}
    }
            
    public dread findThoughtsById(String id) {
    	for (dread s : t) { 		      
            if(s.getId().equals(id)) return s;
       }
    	return null;
    }

    public dread findThoughtsByName(String name) {
    	for (dread s : t) { 		      
            if(s.getThought().equals(name)) return s;
       }
    	return null;
    }

}
