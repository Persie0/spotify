package p204p;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class e0g1 extends o0f1 implements ListIterator {

    /* JADX INFO: renamed from: b */
    public final int f54970b;

    /* JADX INFO: renamed from: c */
    public int f54971c;

    /* JADX INFO: renamed from: d */
    public final m0g1 f54972d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0g1(m0g1 m0g1Var, int i) {
        super(7);
        int size = m0g1Var.size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(wj50.m88274k0(i, size, "index"));
        }
        this.f54970b = size;
        this.f54971c = i;
        this.f54972d = m0g1Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m37496a(int i) {
        return this.f54972d.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f54971c < this.f54970b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f54971c > 0;
    }

    @Override // p204p.o0f1, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f54971c;
        this.f54971c = i + 1;
        return m37496a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f54971c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f54971c - 1;
        this.f54971c = i;
        return m37496a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f54971c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
