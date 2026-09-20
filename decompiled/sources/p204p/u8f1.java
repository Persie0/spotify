package p204p;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class u8f1 extends o0f1 implements ListIterator {

    /* JADX INFO: renamed from: b */
    public final int f227944b;

    /* JADX INFO: renamed from: c */
    public int f227945c;

    /* JADX INFO: renamed from: d */
    public final daf1 f227946d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8f1(daf1 daf1Var, int i) {
        super(3);
        int size = daf1Var.size();
        quf1.m73928t(i, size);
        this.f227944b = size;
        this.f227945c = i;
        this.f227946d = daf1Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m82572a(int i) {
        return this.f227946d.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f227945c < this.f227944b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f227945c > 0;
    }

    @Override // p204p.o0f1, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f227945c;
        this.f227945c = i + 1;
        return m82572a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f227945c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f227945c - 1;
        this.f227945c = i;
        return m82572a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f227945c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
