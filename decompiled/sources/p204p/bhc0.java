package p204p;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class bhc0 implements Collection {

    /* JADX INFO: renamed from: a */
    public final fhc0 f27137a;

    /* JADX INFO: renamed from: b */
    public final Collection f27138b;

    public bhc0(fhc0 fhc0Var, Collection collection) {
        this.f27137a = fhc0Var;
        this.f27138b = collection;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f27137a.m41656c();
        this.f27138b.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f27138b.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f27138b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return this.f27138b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f27138b.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f27138b.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new chc0(0, this.f27137a, this.f27138b.iterator());
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        this.f27137a.m41656c();
        return this.f27138b.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        this.f27137a.m41656c();
        return this.f27138b.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        this.f27137a.m41656c();
        return this.f27138b.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f27138b.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f27138b.toArray();
    }

    public final String toString() {
        return this.f27138b.toString();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f27138b.toArray(objArr);
    }
}
