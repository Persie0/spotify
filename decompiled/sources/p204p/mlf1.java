package p204p;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class mlf1 extends o0f1 implements ListIterator {

    /* JADX INFO: renamed from: b */
    public final int f144835b;

    /* JADX INFO: renamed from: c */
    public int f144836c;

    /* JADX INFO: renamed from: d */
    public final tlf1 f144837d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlf1(tlf1 tlf1Var, int i) {
        super(4);
        int size = tlf1Var.size();
        p271.m68895E(i, size);
        this.f144835b = size;
        this.f144836c = i;
        this.f144837d = tlf1Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m62204a(int i) {
        return this.f144837d.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f144836c < this.f144835b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f144836c > 0;
    }

    @Override // p204p.o0f1, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f144836c;
        this.f144836c = i + 1;
        return m62204a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f144836c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f144836c - 1;
        this.f144836c = i;
        return m62204a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f144836c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
