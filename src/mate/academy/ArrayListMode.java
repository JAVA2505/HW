package mate.academy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListMode implements List {

	private SoftDrink[] elementData;
	private int size;

	public ArrayListMode() {
		super();
		elementData = new SoftDrink[3];
		size = 0;
	}

	private void toSwap(int first, int second) {
		SoftDrink temp = elementData[first];
		elementData[first] = elementData[second];
		elementData[second] = temp;
	}

	public void sortDrink() {
		for (int out = size - 1; out >= 1; out--) {
			for (int in = 0; in < out; in++) {
				if (elementData[in].getName().charAt(0) > elementData[in + 1].getName().charAt(0)) {
					toSwap(in, in + 1);
				}
			}
		}
	}

	@Override
	public boolean add(Object arg0) {
		SoftDrink temp = (SoftDrink) arg0;
		int newLenghtArray = elementData.length + elementData.length / 2;

		if (size < elementData.length && size > 0) {
			elementData[size] = temp;
		} else if (size == elementData.length) {
			SoftDrink[] tempArray = new SoftDrink[newLenghtArray];
			System.arraycopy(elementData, 0, tempArray, 0, elementData.length);
			elementData = tempArray;
			elementData[size] = temp;
		} else if (size == 0) {
			elementData[0] = temp;
		}
		size++;
		return false;
	}

	@Override
	public void add(int arg0, Object arg1) {
		SoftDrink temp = (SoftDrink) arg1;
		int newLenghtArray = elementData.length + elementData.length / 2;
		int index = arg0;
		if (size + 1 < elementData.length) {
			System.arraycopy(elementData, index, elementData, index + 1, size - index);
			elementData[index] = temp;

		} else {
			SoftDrink[] tempArray = new SoftDrink[newLenghtArray];
			System.arraycopy(elementData, 0, tempArray, 0, elementData.length);
			elementData = tempArray;
			System.arraycopy(elementData, index, elementData, index + 1, size - index);
			elementData[index] = temp;
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
		SoftDrink temp = (SoftDrink) arg0;
		for (int i = 0; i < size; i++) {
			if (temp.equals(elementData[i])) {
				int numMoved = size - i - 1;
				System.arraycopy(elementData, i + 1, elementData, i, numMoved);
				elementData[--size] = null;
			}
		}
		return false;
	}

	@Override
	public Object remove(int arg0) {
		int index = arg0;
		int numMoved = size - index - 1;
		System.arraycopy(elementData, index + 1, elementData, index, numMoved);
		elementData[--size] = null;
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

	@Override
	public String toString() {
		return Arrays.toString(elementData) + "\n";
	}

}
