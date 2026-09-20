package p204p;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class rpa extends AbstractC2204o7 {

    /* JADX INFO: renamed from: c */
    public final Object[] f201480c;

    public rpa(int i, int i2, Object[] objArr) {
        super(i, i2);
        this.f201480c = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f162442a;
        this.f162442a = i + 1;
        return this.f201480c[i];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f162442a - 1;
        this.f162442a = i;
        return this.f201480c[i];
    }
}
