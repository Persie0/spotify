package p204p;

import java.util.ListIterator;

/* JADX INFO: renamed from: p.o7 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2204o7 implements ListIterator, pq60 {

    /* JADX INFO: renamed from: a */
    public int f162442a;

    /* JADX INFO: renamed from: b */
    public int f162443b;

    public AbstractC2204o7(int i, int i2) {
        this.f162442a = i;
        this.f162443b = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f162442a < this.f162443b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f162442a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f162442a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f162442a - 1;
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
