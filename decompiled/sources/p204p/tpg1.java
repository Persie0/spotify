package p204p;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class tpg1 extends o0f1 implements ListIterator {

    /* JADX INFO: renamed from: b */
    public final int f222542b;

    /* JADX INFO: renamed from: c */
    public int f222543c;

    /* JADX INFO: renamed from: d */
    public final ptg1 f222544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpg1(ptg1 ptg1Var, int i) {
        super(1);
        int size = ptg1Var.size();
        vhf1.m85544S(i, size);
        this.f222542b = size;
        this.f222543c = i;
        this.f222544d = ptg1Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m81261a(int i) {
        return this.f222544d.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f222543c < this.f222542b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f222543c > 0;
    }

    @Override // p204p.o0f1, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f222543c;
        this.f222543c = i + 1;
        return m81261a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f222543c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f222543c - 1;
        this.f222543c = i;
        return m81261a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f222543c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
