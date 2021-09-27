package com.huawei.pattern.iterator;

import com.huawei.pattern.composite.MenuItem;

public class DinnerMenu implements Menu {
    MenuItem[] menue;
    int max =  6;
    int position = 0;
    public DinnerMenu() {
        menue = new MenuItem[max];
        menue[position++] = new MenuItem("item3", 3.4);
        menue[position++] = new MenuItem("item4", 5.1);
        menue[position++] = new MenuItem("item5", 5.2);
    }

    public void addMenueItem(MenuItem menuItem) throws Exception{
        if (position == max) {
            throw new Exception("the number is more than max");
        } else {
            menue[position++] = menuItem;
        }
    }

    @Override
    public Iterator createIterator() {
        return new DinnerMenuIterator(menue);
    }
}
