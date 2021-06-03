package com.van.designpattern.迭代器模式;

/**
 * 注意 这个iterator是写在NameContainer里面的。因为他要共用它的数组。
 */
public class NameContainer implements Container {
    private String[] names = new String[]{"van", "mike", "jack"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index >= names.length ? false : true;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return names[index++];
            } else {
                return null;
            }
        }
    }
}
