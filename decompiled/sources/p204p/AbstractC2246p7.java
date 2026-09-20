package p204p;

import java.util.ListIterator;

/* JADX INFO: renamed from: p.p7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2246p7 implements ListIterator, pq60 {

    /* JADX INFO: renamed from: a */
    public int f174531a;

    /* JADX INFO: renamed from: b */
    public int f174532b;

    public AbstractC2246p7(int i, int i2) {
        this.f174531a = i;
        this.f174532b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m69214a() {
        return this.f174531a;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: b */
    public final void m69215b(int i) {
        this.f174531a = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f174531a < this.f174532b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f174531a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f174531a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f174531a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
