package p204p;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class spa extends AbstractC2246p7 {

    /* JADX INFO: renamed from: c */
    public final Object[] f212786c;

    public spa(int i, int i2, Object[] objArr) {
        super(i, i2);
        this.f212786c = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int iM69214a = m69214a();
        m69215b(iM69214a + 1);
        return this.f212786c[iM69214a];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        m69215b(m69214a() - 1);
        return this.f212786c[m69214a()];
    }
}
