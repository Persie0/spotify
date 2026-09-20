package p204p;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class i0f1 extends o0f1 implements ListIterator {

    /* JADX INFO: renamed from: b */
    public final int f97231b;

    /* JADX INFO: renamed from: c */
    public int f97232c;

    /* JADX INFO: renamed from: d */
    public final k0f1 f97233d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0f1(k0f1 k0f1Var, int i) {
        super(0);
        int size = k0f1Var.size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(ex60.m40181o(i, size, "index"));
        }
        this.f97231b = size;
        this.f97232c = i;
        this.f97233d = k0f1Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m49375a(int i) {
        return this.f97233d.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f97232c < this.f97231b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f97232c > 0;
    }

    @Override // p204p.o0f1, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f97232c;
        this.f97232c = i + 1;
        return m49375a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f97232c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f97232c - 1;
        this.f97232c = i;
        return m49375a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f97232c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
