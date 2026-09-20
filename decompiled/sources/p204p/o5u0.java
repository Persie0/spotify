package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes5.dex */
public final class o5u0 implements List, pq60 {

    /* JADX INFO: renamed from: t */
    public static final o5u0 f162097t;

    /* JADX INFO: renamed from: a */
    public final ArrayList f162098a;

    /* JADX INFO: renamed from: b */
    public final Object f162099b;

    /* JADX INFO: renamed from: c */
    public final b450 f162100c;

    /* JADX INFO: renamed from: d */
    public final int f162101d;

    /* JADX INFO: renamed from: e */
    public final Object f162102e;

    /* JADX INFO: renamed from: f */
    public final Object f162103f;

    /* JADX INFO: renamed from: g */
    public final n5u0 f162104g;

    /* JADX INFO: renamed from: h */
    public final b450 f162105h;

    /* JADX INFO: renamed from: i */
    public final b450 f162106i;

    static {
        b450 b450Var = b450.f23226d;
        n5u0 n5u0Var = n5u0.f150621d;
        lau lauVar = lau.f131415a;
        f162097t = new o5u0(lauVar, b450Var, 0, lauVar, lauVar, w2a1.f247311a, n5u0Var);
    }

    public o5u0(List list, b450 b450Var, int i, List list2, List list3, Object obj, n5u0 n5u0Var) {
        int i2 = b450Var.f278779b;
        int i3 = b450Var.f278778a;
        ArrayList arrayList = new ArrayList(i);
        int i4 = 0;
        while (i4 < i) {
            arrayList.add((i4 > i2 || i3 > i4) ? obj : list.get(i4 - i3));
            i4++;
        }
        this.f162098a = i6f.m49805U(h6f.m46715L(list2, arrayList, list3));
        this.f162099b = list;
        this.f162100c = b450Var;
        this.f162101d = i;
        this.f162102e = list2;
        this.f162103f = obj;
        this.f162104g = n5u0Var;
        this.f162105h = n0e1.m63417Y(list2.size(), list2.size() + i);
        int i5 = n5u0Var.f150623b;
        int i6 = i - 1;
        this.f162106i = new b450(i3 != 0 ? i3 + i5 : 0, i2 != i6 ? i2 - i5 : i6, 1);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f162098a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f162098a.containsAll(collection);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f162098a.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return this.f162098a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f162098a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f162098a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return this.f162098a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f162098a.listIterator();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object removeLast() {
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
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f162098a.size();
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.f162098a.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return wj50.m88262e0(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.f162098a.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return wj50.m88264f0(this, objArr);
    }
}
