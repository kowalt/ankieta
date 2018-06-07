package pl.jodkow.PollBE.dao;

import java.util.List;
import java.util.Map;

public interface DAO<T> {
    public void add(T item);
    public void update(T item);
    public void remove(T item);
    public T get(List<Entry> keys);
}
