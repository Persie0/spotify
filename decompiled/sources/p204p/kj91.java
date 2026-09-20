package p204p;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class kj91 extends AbstractC2246p7 {

    /* JADX INFO: renamed from: c */
    public int f123271c;

    /* JADX INFO: renamed from: d */
    public Object[] f123272d;

    /* JADX INFO: renamed from: e */
    public boolean f123273e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public kj91(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.f123271c = i3;
        Object[] objArr2 = new Object[i3];
        this.f123272d = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.f123273e = r5;
        objArr2[0] = objArr;
        m56558d(i - r5, 1);
    }

    /* JADX INFO: renamed from: c */
    public final Object m56557c() {
        return ((Object[]) this.f123272d[this.f123271c - 1])[this.f174531a & 31];
    }

    /* JADX INFO: renamed from: d */
    public final void m56558d(int i, int i2) {
        int i3 = (this.f123271c - i2) * 5;
        while (i2 < this.f123271c) {
            Object[] objArr = this.f123272d;
            objArr[i2] = ((Object[]) objArr[i2 - 1])[geg1.m44516w(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m56559e(int i) {
        int i2 = 0;
        while (geg1.m44516w(this.f174531a, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            m56558d(this.f174531a, ((this.f123271c - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objM56557c = m56557c();
        int i = this.f174531a + 1;
        this.f174531a = i;
        if (i == this.f174532b) {
            this.f123273e = true;
            return objM56557c;
        }
        m56559e(0);
        return objM56557c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f174531a--;
        if (this.f123273e) {
            this.f123273e = false;
            return m56557c();
        }
        m56559e(31);
        return m56557c();
    }
}
