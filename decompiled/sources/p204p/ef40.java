package p204p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: loaded from: classes.dex */
public abstract class ef40 extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final Object[] f58934a = new Object[0];

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: renamed from: a */
    public pf40 mo38714a() {
        if (isEmpty()) {
            kf40 kf40Var = pf40.f176960b;
            return wsv0.f254763e;
        }
        Object[] array = toArray(f58934a);
        kf40 kf40Var2 = pf40.f176960b;
        return pf40.m69787l(array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: b */
    public int mo38715b(int i, Object[] objArr) {
        o3a1 it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    /* JADX INFO: renamed from: d */
    public Object[] mo38716d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public int mo38717e() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: f */
    public int mo38718f() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: i */
    public abstract boolean mo1672i();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public abstract o3a1 iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f58934a);
    }

    public Object writeReplace() {
        return new lf40(toArray(f58934a));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] objArrMo38716d = mo38716d();
            if (objArrMo38716d != null) {
                return j1h1.m52157s(mo38718f(), mo38717e(), objArrMo38716d, objArr);
            }
            objArr = jhl0.m53423q(size, objArr);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        mo38715b(0, objArr);
        return objArr;
    }
}
