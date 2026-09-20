package p204p;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class jj91 extends AbstractC2204o7 {

    /* JADX INFO: renamed from: c */
    public int f112960c;

    /* JADX INFO: renamed from: d */
    public Object[] f112961d;

    /* JADX INFO: renamed from: e */
    public boolean f112962e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public jj91(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.f112960c = i3;
        Object[] objArr2 = new Object[i3];
        this.f112961d = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.f112962e = r5;
        objArr2[0] = objArr;
        m53529b(i - r5, 1);
    }

    /* JADX INFO: renamed from: a */
    public final Object m53528a() {
        int i = this.f162442a & 31;
        Object obj = this.f112961d[this.f112960c - 1];
        if (obj != null) {
            return ((Object[]) obj)[i];
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<E of kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
    }

    /* JADX INFO: renamed from: b */
    public final void m53529b(int i, int i2) {
        int i3 = (this.f112960c - i2) * 5;
        while (i2 < this.f112960c) {
            Object[] objArr = this.f112961d;
            Object obj = objArr[i2 - 1];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArr[i2] = ((Object[]) obj)[edg1.m38588i(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m53530c(int i) {
        int i2 = 0;
        while (edg1.m38588i(this.f162442a, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            m53529b(this.f162442a, ((this.f112960c - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objM53528a = m53528a();
        int i = this.f162442a + 1;
        this.f162442a = i;
        if (i == this.f162443b) {
            this.f112962e = true;
            return objM53528a;
        }
        m53530c(0);
        return objM53528a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f162442a--;
        if (this.f112962e) {
            this.f112962e = false;
            return m53528a();
        }
        m53530c(31);
        return m53528a();
    }
}
