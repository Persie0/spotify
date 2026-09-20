package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public abstract class s400 extends q400 implements Queue, Collection {
    @Override // java.util.Collection
    public final void clear() {
        ((vdx) this).f240521a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return ((vdx) this).f240521a.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ((vdx) this).f240521a.containsAll(collection);
    }

    @Override // java.util.Queue
    public final Object element() {
        return ((vdx) this).f240521a.element();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return ((vdx) this).f240521a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return ((vdx) this).f240521a.iterator();
    }

    @Override // java.util.Queue
    public final Object peek() {
        return ((vdx) this).f240521a.peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return ((vdx) this).f240521a.poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return ((vdx) this).f240521a.remove();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return ((vdx) this).f240521a.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return ((vdx) this).f240521a.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return ((vdx) this).f240521a.size();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return ((vdx) this).f240521a.toArray();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return ((vdx) this).f240521a.remove(obj);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ((vdx) this).f240521a.toArray(objArr);
    }
}
