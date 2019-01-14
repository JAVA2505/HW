package mate.academy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Store {

	List<Item> list = new ArrayList<Item>();

	public Store() {
	}

	public void addAndSortItems(Item item) {
		if (list.size() > 0) {
			list.add(item);
			for (int out = list.size() - 1; out >= 1; out--) {
				for (int in = 0; in < out; in++) {
					if (list.get(in).getIntelligence() > list.get(in + 1).getIntelligence() - 1) {
						toSwap(in, in + 1);
					}
				}
			}

		} else {
			list.add(item);
		}

	}

	private void toSwap(int first, int second) {
		Item temp = list.get(first);
		list.set(first, list.get(second));
		list.set(second, temp);
	}

	public void removeItem(String name) {

		Iterator<Item> itemIterator = list.iterator();

		while (itemIterator.hasNext()) {
			Item temp = itemIterator.next();
			if (name.equals(temp.getName())) {
				itemIterator.remove();
			}
		}
	}

}
