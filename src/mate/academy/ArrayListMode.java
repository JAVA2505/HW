package mate.academy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListMode implements List {

	private SoftDrink[] elementDate;
	private int size;

	public ArrayListMode() {
		super();
		elementDate = new SoftDrink[3];
		size = 0;
	}

	public boolean add(Object arg0) {
		SoftDrink temp = (SoftDrink) arg0;
		int newLenghtArray = elementDate.length + elementDate.length / 2;
		
		if (size < elementDate.length && size != 0) {
			elementDate[size - 1] = temp;
		} else if (size == elementDate.length) {
			SoftDrink[] tempArray = new SoftDrink[newLenghtArray];
			System.arraycopy(elementDate, 0, tempArray, 0, elementDate.length);
			elementDate = tempArray;
			elementDate[size - 1] = temp;
		} else {
			elementDate[0] = temp;
		}
		size++;
		return false;
	}

	@Override
	public void add(int arg0, Object arg1) {
		SoftDrink temp = (SoftDrink) arg1;
		int newLenghtArray = elementDate.length + elementDate.length / 2;
		int index = arg0;
		if (size + 1 < elementDate.length) {
			System.arraycopy(elementDate, index, elementDate, index + 1, size - index);
			elementDate[index] = temp;

		} else {
			SoftDrink[] tempArray = new SoftDrink[newLenghtArray];
			System.arraycopy(elementDate, 0, tempArray, 0, elementDate.length);
			elementDate = tempArray;
			System.arraycopy(elementDate, index, elementDate, index + 1, size - index);
			elementDate[index] = temp;
		}
		size++;
		

	}

	@Override
	public boolean addAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int arg0, Collection arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object set(int arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List subList(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
