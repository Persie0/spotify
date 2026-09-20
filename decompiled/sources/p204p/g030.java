package p204p;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public final class g030 implements List, pq60 {

    /* JADX INFO: renamed from: a */
    public final jpi0 f75253a = new jpi0(16);

    /* JADX INFO: renamed from: b */
    public final yoi0 f75254b = new yoi0(16);

    /* JADX INFO: renamed from: c */
    public int f75255c = -1;

    /* JADX INFO: renamed from: a */
    public final long m43253a() {
        long jM54982a = k0e1.m54982a(Float.POSITIVE_INFINITY, false, false);
        int i = this.f75255c + 1;
        int iM46714K = h6f.m46714K(this);
        if (i > iM46714K) {
            return jM54982a;
        }
        while (true) {
            yoi0 yoi0Var = this.f75254b;
            if (i < 0) {
                yoi0Var.getClass();
                break;
            }
            if (i >= yoi0Var.f274677b) {
                break;
            }
            long j = yoi0Var.f274676a[i];
            if (psg1.m70850p(j, jM54982a) < 0) {
                jM54982a = j;
            }
            if ((psg1.m70853t(jM54982a) < 0.0f && psg1.m70830F(jM54982a)) || i == iM46714K) {
                return jM54982a;
            }
            i++;
        }
        epv0.m39675K("Index must be between 0 and size");
        throw null;
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

    /* JADX INFO: renamed from: b */
    public final void m43254b(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.f75253a.m53965l(i, i2);
        yoi0 yoi0Var = this.f75254b;
        if (i >= 0) {
            int i3 = yoi0Var.f274677b;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    epv0.m39674J("The end index must be < start index");
                    throw null;
                }
                if (i2 != i) {
                    if (i2 < i3) {
                        long[] jArr = yoi0Var.f274676a;
                        bk5.m29633r0(jArr, jArr, i, i2, i3);
                    }
                    yoi0Var.f274677b -= i2 - i;
                    return;
                }
                return;
            }
        } else {
            yoi0Var.getClass();
        }
        epv0.m39675K("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f75255c = -1;
        this.f75253a.m53957d();
        this.f75254b.f274677b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof exh0) && indexOf((exh0) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((exh0) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (exh0) this.f75253a.m53959f(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof exh0)) {
            return -1;
        }
        exh0 exh0Var = (exh0) obj;
        int iM46714K = h6f.m46714K(this);
        if (iM46714K >= 0) {
            int i = 0;
            while (!wj50.m88271j(this.f75253a.m53959f(i), exh0Var)) {
                if (i != iM46714K) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f75253a.m53961h();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new e030(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof exh0)) {
            return -1;
        }
        exh0 exh0Var = (exh0) obj;
        for (int iM46714K = h6f.m46714K(this); -1 < iM46714K; iM46714K--) {
            if (wj50.m88271j(this.f75253a.m53959f(iM46714K), exh0Var)) {
                return iM46714K;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new e030(this, 0, 7);
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
        return this.f75253a.f114676b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new f030(this, i, i2);
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

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new e030(this, i, 6);
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
