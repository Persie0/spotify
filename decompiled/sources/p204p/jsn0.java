package p204p;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class jsn0 extends AbstractC2204o7 {

    /* JADX INFO: renamed from: c */
    public final Object[] f115520c;

    /* JADX INFO: renamed from: d */
    public final jj91 f115521d;

    public jsn0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.f115520c = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.f115521d = new jj91(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        jj91 jj91Var = this.f115521d;
        if (jj91Var.hasNext()) {
            this.f162442a++;
            return jj91Var.next();
        }
        int i = this.f162442a;
        this.f162442a = i + 1;
        return this.f115520c[i - jj91Var.f162443b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f162442a;
        jj91 jj91Var = this.f115521d;
        int i2 = jj91Var.f162443b;
        if (i <= i2) {
            this.f162442a = i - 1;
            return jj91Var.previous();
        }
        int i3 = i - 1;
        this.f162442a = i3;
        return this.f115520c[i3 - i2];
    }
}
