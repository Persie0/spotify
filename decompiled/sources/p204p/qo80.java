package p204p;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class qo80 implements ListIterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final ro80 f190833a;

    /* JADX INFO: renamed from: b */
    public int f190834b;

    /* JADX INFO: renamed from: c */
    public int f190835c = -1;

    /* JADX INFO: renamed from: d */
    public int f190836d;

    public qo80(int i, ro80 ro80Var) {
        this.f190833a = ro80Var;
        this.f190834b = i;
        this.f190836d = ((AbstractList) ro80Var).modCount;
    }

    /* JADX INFO: renamed from: a */
    public final void m73369a() {
        if (((AbstractList) this.f190833a).modCount != this.f190836d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        m73369a();
        int i = this.f190834b;
        this.f190834b = i + 1;
        ro80 ro80Var = this.f190833a;
        ro80Var.add(i, obj);
        this.f190835c = -1;
        this.f190836d = ((AbstractList) ro80Var).modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f190834b < this.f190833a.f201179b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f190834b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m73369a();
        int i = this.f190834b;
        ro80 ro80Var = this.f190833a;
        if (i >= ro80Var.f201179b) {
            throw new NoSuchElementException();
        }
        this.f190834b = i + 1;
        this.f190835c = i;
        return ro80Var.f201178a[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f190834b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m73369a();
        int i = this.f190834b;
        if (i <= 0) {
            throw new NoSuchElementException();
        }
        int i2 = i - 1;
        this.f190834b = i2;
        this.f190835c = i2;
        return this.f190833a.f201178a[i2];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f190834b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m73369a();
        int i = this.f190835c;
        if (i == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        ro80 ro80Var = this.f190833a;
        ro80Var.mo47662b(i);
        this.f190834b = this.f190835c;
        this.f190835c = -1;
        this.f190836d = ((AbstractList) ro80Var).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m73369a();
        int i = this.f190835c;
        if (i == -1) {
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
        this.f190833a.set(i, obj);
    }
}
