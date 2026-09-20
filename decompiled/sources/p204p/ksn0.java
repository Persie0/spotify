package p204p;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class ksn0 extends AbstractC2246p7 {

    /* JADX INFO: renamed from: c */
    public final Object[] f125979c;

    /* JADX INFO: renamed from: d */
    public final kj91 f125980d;

    public ksn0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.f125979c = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.f125980d = new kj91(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        kj91 kj91Var = this.f125980d;
        if (kj91Var.hasNext()) {
            this.f174531a++;
            return kj91Var.next();
        }
        int i = this.f174531a;
        this.f174531a = i + 1;
        return this.f125979c[i - kj91Var.f174532b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f174531a;
        kj91 kj91Var = this.f125980d;
        int i2 = kj91Var.f174532b;
        if (i <= i2) {
            this.f174531a = i - 1;
            return kj91Var.previous();
        }
        int i3 = i - 1;
        this.f174531a = i3;
        return this.f125979c[i3 - i2];
    }
}
