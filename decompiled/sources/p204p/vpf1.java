package p204p;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class vpf1 extends o0f1 implements ListIterator {

    /* JADX INFO: renamed from: b */
    public final int f243685b;

    /* JADX INFO: renamed from: c */
    public int f243686c;

    /* JADX INFO: renamed from: d */
    public final gqf1 f243687d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vpf1(gqf1 gqf1Var, int i) {
        super(6);
        int size = gqf1Var.size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(jg31.m53262H(i, size, "index"));
        }
        this.f243685b = size;
        this.f243686c = i;
        this.f243687d = gqf1Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m86123a(int i) {
        return this.f243687d.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f243686c < this.f243685b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f243686c > 0;
    }

    @Override // p204p.o0f1, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f243686c;
        this.f243686c = i + 1;
        return m86123a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f243686c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f243686c - 1;
        this.f243686c = i;
        return m86123a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f243686c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
