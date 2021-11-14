package com.technoelevate.basicjava.collection.myownimplimentation;

import java.util.Arrays;
import java.util.Iterator;

import com.technoelevate.basicjava.collection.myownimplimentation.ArrayList.Itr;

public class ArrayListGanesh {
        private int position;
        private Object[] array;
        
        public ArrayListGanesh(int arraysize) {
			array = new Object[arraysize];
		}
        public void add(Object obj) {
    		if (position >= size()) {
    			grow();
    		}
    		array[position++]=obj;
    		
    	}
        public Object get(int index) {
        	return array[index];
        }
        public int size() {
        	return array.length;
        }
		@Override
		public String toString() {
			if (size()==0) {
				return "[]";
				
			}
			String string ="["+array[0];
			for (int i=1;i<size();i++) {
				string += ","+array[i];
			}
			string+="j";
			return string;
				}
		private void grow() {
			Object[] temp=new Object[array.length+1];
			System.arraycopy(array, 0, temp, 0, array.length);
			array=temp;
			
			
		}
		public Iterator iterator() {
			
			return new Itr();
		}
		public class Itr implements Iterator{
	        int index1;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return (index1<position)?true:false;
			}

			@Override
			public Object next() {
				// TODO Auto-generated method stub
				return array[index1++];
			}
		
		}		
		
}
