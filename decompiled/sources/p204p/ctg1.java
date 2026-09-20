package p204p;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ctg1 extends o0f1 implements ListIterator {

    /* JADX INFO: renamed from: b */
    public final int f41878b;

    /* JADX INFO: renamed from: c */
    public int f41879c;

    public ctg1(int i, int i2) {
        super(8);
        bnf1.m29986v(i2, i);
        this.f41878b = i;
        this.f41879c = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo33842a(int i);

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f41879c < this.f41878b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f41879c > 0;
    }

    @Override // p204p.o0f1, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f41879c;
        this.f41879c = i + 1;
        return mo33842a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f41879c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f41879c - 1;
        this.f41879c = i;
        return mo33842a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f41879c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
