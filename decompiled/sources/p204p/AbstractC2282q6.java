package p204p;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: p.q6 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2282q6 implements Collection, pq60 {
    /* JADX INFO: renamed from: a */
    public abstract int mo33075a();

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (wj50.m88271j(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public boolean isEmpty() {
        return mo33075a() == 0;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return mo33075a();
    }

    @Override // java.util.Collection, java.util.List
    public Object[] toArray() {
        return wj50.m88262e0(this);
    }

    public final String toString() {
        return g6f.m43753y0(this, ", ", "[", "]", new C2245p6(this, 0), 24);
    }

    @Override // java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        return wj50.m88264f0(this, objArr);
    }
}
