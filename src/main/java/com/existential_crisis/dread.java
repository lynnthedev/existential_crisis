package com.existential_crisis;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class dread {
	private String id;
	private String thought;
	
	public dread(String id, String thought) {
		super();
		this.id = id;
		this.thought = thought;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the thought
	 */
	public String getThought() {
		return thought;
	}

	public void setThought(String thought) {
		this.thought = thought;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, thought);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof dread))
			return false;
		dread other = (dread) obj;
		return Objects.equals(thought, other.thought) && Objects.equals(id, other.id);
	}
	

	public static Comparator<dread> thoughtsComparator = new Comparator<dread>() {
		@Override
		public int compare(dread s1, dread s2) {
			return (int) (s1.getThought().compareTo(s2.getThought()));
		}
	};

}

