package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class pqi0 implements List, rq60 {

    /* JADX INFO: renamed from: a */
    public final qqi0 f180330a;

    public pqi0(qqi0 qqi0Var) {
        this.f180330a = qqi0Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f180330a.m73556b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        qqi0 qqi0Var = this.f180330a;
        return qqi0Var.m73559e(qqi0Var.f191610c, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f180330a.m73561g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f180330a.m73562i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        qqi0 qqi0Var = this.f180330a;
        qqi0Var.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!qqi0Var.m73562i(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        rqi0.m76249a(i, this);
        return this.f180330a.f191608a[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f180330a.m73563j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f180330a.f191610c == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new gpi0(0, 1, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        qqi0 qqi0Var = this.f180330a;
        Object[] objArr = qqi0Var.f191608a;
        for (int i = qqi0Var.f191610c - 1; i >= 0; i--) {
            if (wj50.m88271j(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new gpi0(0, 1, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f180330a.m73564k(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        qqi0 qqi0Var = this.f180330a;
        qqi0Var.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i = qqi0Var.f191610c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            qqi0Var.m73564k(it.next());
        }
        return i != qqi0Var.f191610c;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        qqi0 qqi0Var = this.f180330a;
        int i = qqi0Var.f191610c;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(qqi0Var.f191608a[i2])) {
                qqi0Var.m73565l(i2);
            }
        }
        return i != qqi0Var.f191610c;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        rqi0.m76249a(i, this);
        Object[] objArr = this.f180330a.f191608a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f180330a.f191610c;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        rqi0.m76250b(i, i2, this);
        return new ipi0(i, i2, 1, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return wj50.m88262e0(this);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.f180330a.m73555a(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new gpi0(i, 1, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        rqi0.m76249a(i, this);
        return this.f180330a.m73565l(i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return wj50.m88264f0(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.f180330a.m73559e(i, collection);
    }
}
