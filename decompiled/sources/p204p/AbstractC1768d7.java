package p204p;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: p.d7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1768d7 extends o3a1 implements ListIterator {

    /* JADX INFO: renamed from: b */
    public final int f45939b;

    /* JADX INFO: renamed from: c */
    public int f45940c;

    public AbstractC1768d7(int i, int i2) {
        super(0);
        c95.m31851q(i2, i);
        this.f45939b = i;
        this.f45940c = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo35159a(int i);

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f45940c < this.f45939b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f45940c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f45940c;
        this.f45940c = i + 1;
        return mo35159a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f45940c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f45940c - 1;
        this.f45940c = i;
        return mo35159a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f45940c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
