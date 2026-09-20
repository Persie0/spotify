package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final class as51 implements Collection, pq60 {

    /* JADX INFO: renamed from: a */
    public final mpi0 f19310a;

    public as51() {
        int i = svl0.f214468a;
        this.f19310a = new mpi0(6);
    }

    /* JADX INFO: renamed from: a */
    public final void m27064a(Object obj) {
        this.f19310a.m62485a(obj);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.f19310a.m62485a(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f19310a.m62486b();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f19310a.m62487c(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f19310a.m62487c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f19310a.f146037g == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        mpi0 mpi0Var = this.f19310a;
        mpi0Var.getClass();
        return new j310(new opi0(mpi0Var));
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f19310a.m62491g(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f19310a.m62491g(collection);
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f19310a.m62493i(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f19310a.f146037g;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return wj50.m88262e0(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return wj50.m88264f0(this, objArr);
    }
}
