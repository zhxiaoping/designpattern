package com.huawei.pattern.iterator;

import com.huawei.pattern.composite.MenuItem;

public class DinnerMenuIterator implements Iterator {

    int position = 0;
    MenuItem[] menue;

    public DinnerMenuIterator(MenuItem[] menue) {
        this.menue = menue;
    }

    @Override
    public boolean hasNext() {
        if (position == menue.length || menue[position + 1] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        if (position == menue.length || menue[position] == null) {
            throw new IndexOutOfBoundsException();
        } else {
            return menue[position++];
        }
    }
}
