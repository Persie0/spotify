package p204p;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class ww21 implements Iterator {

    /* JADX INFO: renamed from: a */
    public boolean f255679a;

    /* JADX INFO: renamed from: b */
    public final int f255680b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xw21 f255681c;

    public ww21(xw21 xw21Var) {
        this.f255681c = xw21Var;
        this.f255680b = ((AbstractList) xw21Var).modCount;
    }

    /* JADX INFO: renamed from: a */
    public final void m89169a() {
        xw21 xw21Var = this.f255681c;
        int i = ((AbstractList) xw21Var).modCount;
        int i2 = this.f255680b;
        if (i == i2) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) xw21Var).modCount + "; expected: " + i2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f255679a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f255679a) {
            throw new NoSuchElementException();
        }
        this.f255679a = true;
        m89169a();
        return this.f255681c.f266562b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        m89169a();
        this.f255681c.clear();
    }
}
