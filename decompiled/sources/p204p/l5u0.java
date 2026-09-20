package p204p;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes7.dex */
public final class l5u0 implements List, pq60 {

    /* JADX INFO: renamed from: a */
    public final List f130009a;

    /* JADX INFO: renamed from: b */
    public final Map f130010b;

    /* JADX INFO: renamed from: c */
    public final wg61 f130011c = new wg61(new nzk0(this, 22));

    /* JADX INFO: renamed from: d */
    public final int f130012d;

    public l5u0(List list, Map map) {
        this.f130009a = list;
        this.f130010b = map;
        this.f130012d = list.size();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof s5a0) && indexOf((s5a0) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        throw m5u0.f140290a;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final s5a0 get(int i) {
        nw80 nw80Var = (nw80) this.f130009a.get(i);
        nw80 nw80Var2 = (nw80) this.f130010b.get(nw80Var.f159047a);
        return nw80Var2 != null ? new q5a0(nw80Var2) : new r5a0(nw80Var.f159047a, nw80Var.f159049c);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return (obj instanceof l5u0) && ((l5u0) obj).hashCode() == hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return ((Number) this.f130011c.getValue()).intValue();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof s5a0)) {
            return -1;
        }
        s5a0 s5a0Var = (s5a0) obj;
        gpi0 gpi0Var = new gpi0(this);
        int i = 0;
        while (gpi0Var.hasNext()) {
            if (gpi0Var.next().equals(s5a0Var)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f130009a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new gpi0(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof s5a0) {
            throw m5u0.f140290a;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        throw m5u0.f140290a;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f130012d;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        throw m5u0.f140290a;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return wj50.m88262e0(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return wj50.m88264f0(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new gpi0(this);
    }
}
