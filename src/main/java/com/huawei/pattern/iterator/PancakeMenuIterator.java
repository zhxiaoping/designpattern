package com.huawei.pattern.iterator;

import com.huawei.pattern.composite.MenuItem;

import java.util.List;

public class PancakeMenuIterator implements Iterator {

    java.util.Iterator<MenuItem> iterator;

    public PancakeMenuIterator(List<MenuItem> menuItems) {
        iterator = menuItems.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public MenuItem next() {
        return iterator.next();
    }
}
