package p204p;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class xjf1 extends o0f1 implements ListIterator {

    /* JADX INFO: renamed from: b */
    public final int f262127b;

    /* JADX INFO: renamed from: c */
    public int f262128c;

    /* JADX INFO: renamed from: d */
    public final dkf1 f262129d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xjf1(dkf1 dkf1Var, int i) {
        super(5);
        int size = dkf1Var.size();
        gxf1.m46089s(i, size);
        this.f262127b = size;
        this.f262128c = i;
        this.f262129d = dkf1Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m91217a(int i) {
        return this.f262129d.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f262128c < this.f262127b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f262128c > 0;
    }

    @Override // p204p.o0f1, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f262128c;
        this.f262128c = i + 1;
        return m91217a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f262128c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f262128c - 1;
        this.f262128c = i;
        return m91217a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f262128c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
