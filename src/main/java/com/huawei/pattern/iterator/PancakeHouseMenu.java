package com.huawei.pattern.iterator;

import com.huawei.pattern.composite.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu implements Menu {

    List<MenuItem> menue = new ArrayList();

    public PancakeHouseMenu() {
        menue.add(new MenuItem("item0", 5.2));
        menue.add(new MenuItem("item1", 6.2));
    }

    public void addMenueItem(MenuItem menuItem) {
        menue.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return new PancakeMenuIterator(menue);
    }
}
