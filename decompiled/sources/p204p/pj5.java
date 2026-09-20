package p204p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class pj5 implements Set {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uj5 f178169a;

    public pj5(uj5 uj5Var) {
        this.f178169a = uj5Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f178169a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f178169a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f178169a.m83229j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        uj5 uj5Var = this.f178169a;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return uj5Var.f13976c == set.size() && uj5Var.m83229j(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        uj5 uj5Var = this.f178169a;
        int iHashCode = 0;
        for (int i = uj5Var.f13976c - 1; i >= 0; i--) {
            Object objM25312f = uj5Var.m25312f(i);
            iHashCode += objM25312f == null ? 0 : objM25312f.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f178169a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new oj5(this.f178169a);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        uj5 uj5Var = this.f178169a;
        int iM25310d = uj5Var.m25310d(obj);
        if (iM25310d < 0) {
            return false;
        }
        uj5Var.m25313g(iM25310d);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f178169a.m83230k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f178169a.m83231l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f178169a.f13976c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        uj5 uj5Var = this.f178169a;
        int i = uj5Var.f13976c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = uj5Var.m25312f(i2);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        uj5 uj5Var = this.f178169a;
        int i = uj5Var.f13976c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = uj5Var.m25312f(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
