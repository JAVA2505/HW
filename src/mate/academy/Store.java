package mate.academy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Store extends ArrayList<Item> {


	public Store() {
	}

	public void addAndSortItems(Item item) {
		if (size() > 0) {
			add(item);
			for (int out = size() - 1; out >= 1; out--) {
				for (int in = 0; in < out; in++) {
					if (get(in).getIntelligence() > get(in + 1).getIntelligence() - 1) {
						toSwap(in, in + 1);
					}
				}
			}

		} else {
			add(item);
		}

	}

	private void toSwap(int first, int second) {
		Item temp = get(first);
		set(first, get(second));
		set(second, temp);
	}

	public void removeItem(String name) {

		Iterator<Item> itemIterator = iterator();

		while (itemIterator.hasNext()) {
			Item temp = itemIterator.next();
			if (name.equals(temp.getName())) {
				itemIterator.remove();
			}
		}
	}

}
